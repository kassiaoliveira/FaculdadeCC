package com.unifg.girah.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "PROJETO")
public class ProjectEntity {

    @Id
    @Column(name = "CODIGOPROJETO")
    private Integer codProjeto;

    @Column(name = "NOMEPROJETO")
    private String nomeProjeto;

    @Column(name = "DATAINICIO")
    private Date dataInicio;

    @Column(name = "DATAFIM")
    private Date dataFim;

    @ManyToOne
    private TeamEntity equipe;

    public Integer getCodProjeto() {
        return codProjeto;
    }

    public void setCodProjeto(Integer codProjeto) {
        this.codProjeto = codProjeto;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public TeamEntity getEquipe() {
        return equipe;
    }

    public void setEquipe(TeamEntity equipe) {
        this.equipe = equipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProjectEntity)) return false;
        ProjectEntity that = (ProjectEntity) o;
        return Objects.equals(getCodProjeto(), that.getCodProjeto()) &&
                Objects.equals(getNomeProjeto(), that.getNomeProjeto()) &&
                Objects.equals(getDataInicio(), that.getDataInicio()) &&
                Objects.equals(getDataFim(), that.getDataFim()) &&
                Objects.equals(getEquipe(), that.getEquipe());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodProjeto(), getNomeProjeto(), getDataInicio(), getDataFim(), getEquipe());
    }
}
