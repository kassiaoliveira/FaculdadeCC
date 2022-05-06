SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE  [dbo].[SP_GerarAgendaMedico]
    @Data DATE ,
    @CRM VARCHAR(20)
AS
DECLARE @DataInicial DATE, @HoraInicial TIME(0), @HoraFinal TIME(0)
SET @DataInicial= @Data

BEGIN
        IF NOT EXISTS
        (SELECT Dt_Feriado
        FROM Feriado
        WHERE Dt_Feriado = @Data) -- 3.1. Se a data n�o � feriado;
        AND
        NOT EXISTS (SELECT *
        FROM AgendaMedico
        WHERE @CRM = CRM and @Data=Data) -- 3.2. Se j� n�o foi feita a gera��o da agenda para esta data e este m�dico;
        AND
        (SELECT Situacao
        FROM DisponibilidadeMedico
        WHERE CRM = @CRM AND DiaSemana = DATEPART(DW,@Data)) = 1 --3.3. Se o m�dico atende neste dia da semana;

            BEGIN         --3.4. Gerar os registros com diferen�a de 10 minutos entre a HoraInicial e HoraFinal conforme determinados na tabela de Disponibilidade_Medico.
                SET @HoraInicial=(SELECT HoraInicial
                FROM DisponibilidadeMedico
                WHERE CRM=@CRM AND DATEPART(DW,@Data)=DiaSemana)
                SET @HoraFinal  = (SELECT HoraFinal
                FROM DisponibilidadeMedico
                WHERE CRM=@CRM AND DATEPART(DW,@Data)=DiaSemana)

                WHILE @HoraInicial < @HoraFinal
                    BEGIN
                        INSERT INTO AgendaMedico
                            (CRM,Data,Hora,Situacao,Encaixe)
                        VALUES
                            (@CRM, @Data, @HoraInicial, 0, 0)
                        SET @HoraInicial=DATEADD(MINUTE, 10, @HoraInicial)
                    END
            END
    SET @Data=DATEADD(DAY, 1, @Data);
END
GO
