SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE  [dbo].[SP_MarcarConsulta]
                 @Cliente INT, @CRM VARCHAR(20), @Data DATE, @Hora TIME(0)
AS
                 DECLARE @DiaSem NUMERIC(1)
                 SET @DiaSem = (DATEPART(DW,@Data))
                 IF NOT EXISTS (SELECT * FROM Cliente WHERE Cd_Cliente = @Cliente)
                    PRINT 'Cliente não cadastrado!'
                 ELSE
                    IF NOT EXISTS (SELECT * FROM Medico WHERE CRM = @CRM)
                       PRINT 'Médico não cadastrado!'
                    ELSE
                       IF NOT EXISTS (SELECT * FROM AgendaMedico WHERE CRM = @CRM AND Data = @Data)
                          PRINT 'Agenda não disponível para esta data!'
                       ELSE
                          IF NOT EXISTS (SELECT * FROM AgendaMedico          WHERE CRM = @CRM AND Data = @Data AND Hora = @Hora)  
                             IF  EXISTS (SELECT * FROM DisponibilidadeMedico WHERE CRM = @CRM AND DiaSemana = @DiaSem AND Situacao = 1 AND PermiteEncaixe = 1) AND 
							            (SELECT COUNT(*) FROM AgendaMedico   WHERE CRM = @CRM AND Cd_Cliente = @Cliente AND Data = @Data AND DATEPART(hh,Hora) >= DATEPART(hh,@Hora)  AND DATEPART(hh,Hora) < (DATEPART(hh,@Hora)+1) AND Situacao = 1 AND Encaixe = 1)=0
                                 BEGIN
								      INSERT INTO AgendaMedico (CRM,Cd_Cliente,Data,Hora,Situacao,Encaixe) VALUES (@CRM,@Cliente,@Data,@Hora,1,1)
								      PRINT 'Encaixe marcado!'
								 END;
                             ELSE
                                PRINT 'Encaixe negado!'
                          ELSE
                             IF EXISTS (SELECT * FROM AgendaMedico WHERE CRM = @CRM AND Data = @Data AND Hora = @Hora AND Situacao = 1)
                                PRINT 'Horário já reservado!'
                             ELSE
								BEGIN
                                     UPDATE AgendaMedico SET Cd_Cliente=@Cliente, Situacao=1 WHERE CRM = @CRM AND Data = @Data AND Hora = @Hora
                                     PRINT 'Consulta Marcada!'
                                END;
GO
