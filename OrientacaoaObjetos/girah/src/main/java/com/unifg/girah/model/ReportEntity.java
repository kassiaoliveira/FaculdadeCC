package com.unifg.girah.model;

public class ReportEntity {

    private String matricula;
    private String nome;
    private String cargo;
    private String codEquipe;
    private String nomeEquipe;
    private String codProjeto;
    private String nomeProjeto;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCodEquipe() {
        return codEquipe;
    }

    public void setCodEquipe(String codEquipe) {
        this.codEquipe = codEquipe;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public String getCodProjeto() {
        return codProjeto;
    }

    public void setCodProjeto(String codProjeto) {
        this.codProjeto = codProjeto;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }
}
