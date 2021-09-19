CREATE VIEW GIRAH.VW_RELATORIOPROJETOSGESTAO AS
SELECT
        FUC.MATRICULA "Matricula do Funcionário",
        FUC.NOMECOMPLETO "Nome Completo",
        CA.NOMECARGO "Função",
        EQP.codequipe "Código da Equipe",
        EQP.NOMEEQUIPE "Nome da Equipe",
        PRJ.CODIGOPROJETO"Código do Projeto",
        PRJ.NOMEPROJETO "Nome do Projeto"
    FROM
        GIRAH.FUNCIONARIO FUC
        JOIN GIRAH.CARGO CA ON CA.IDCARGO = FUC.CARGO_IDCARGO
        JOIN GIRAH.EQUIPE EQP ON EQP.codequipe = FUC.equipe_codequipe
        JOIN GIRAH.PROJETO PRJ ON PRJ.equipe_codequipe =  EQP.codequipe;