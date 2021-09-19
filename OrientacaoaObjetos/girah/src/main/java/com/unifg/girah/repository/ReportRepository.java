package com.unifg.girah.repository;

import com.unifg.girah.model.ReportEntity;
import com.unifg.girah.util.MySQLUtil;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ReportRepository {

    public List<ReportEntity> getReports(){
        List<ReportEntity> reportEntityList = new ArrayList<>();
        String sql = "SELECT * FROM VW_RELATORIOPROJETOSGESTAO";
        Connection connection;

        try{
            connection = MySQLUtil.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                ReportEntity entity = new ReportEntity();
                entity.setMatricula(result.getString("Matricula do Funcionário"));
                entity.setNome(result.getString("Nome Completo"));
                entity.setCargo(result.getString("Função"));
                entity.setCodEquipe(result.getString("Código da Equipe"));
                entity.setNomeEquipe(result.getString("Nome da Equipe"));
                entity.setCodProjeto(result.getString("Código do Projeto"));
                entity.setNomeProjeto(result.getString("Nome do Projeto"));
                reportEntityList.add(entity);
            }

            statement.close();
            connection.close();
            return reportEntityList;
        } catch (SQLException e){
            e.printStackTrace();
        }

        return reportEntityList;

    }
}
