CREATE PROCEDURE [dbo].[SP_GerarAgendaMedico_test]
    @Data DATE ,
    @CRM VARCHAR(20)
AS
DECLARE @DataInicial DATE, @HoraInicial TIME(0), @HoraFinal TIME(0)
SET @DataInicial= @Data
    BEGIN
        IF NOT EXISTS(SELECT Dt_Feriado
            FROM Feriado
            WHERE Dt_Feriado = @Data)  AND
            NOT EXISTS (SELECT *
            FROM AgendaMedico
            WHERE @CRM = CRM and @Data=Data) AND
            (SELECT Situacao
            FROM DisponibilidadeMedico
            WHERE CRM = @CRM AND DiaSemana = DATEPART(DW,@Data))=1
                                 BEGIN
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
    PRINT 'Fim da Geração'
    GO