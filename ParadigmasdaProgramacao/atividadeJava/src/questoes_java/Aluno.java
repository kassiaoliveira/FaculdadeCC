package questoes_java;

import java.util.ArrayList;

public class Aluno {
    private String nomeAluno;
    private Float primeiraNota;
    private Float segundaNota;
    private Float terceiraNota;
    private Float notaFinal;
    private String Resultado;

    public Aluno(){
    }

    public Float calcularMediaAluno (Float primeiraNota, Float segundaNota, Float terceiraNota){
        this.notaFinal = (primeiraNota + segundaNota + terceiraNota) ;
        return this.notaFinal;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Float getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(Float primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public Float getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(Float segundaNota) {
        this.segundaNota = segundaNota;
    }

    public Float getTerceiraNota() {
        return terceiraNota;
    }

    public void setTerceiraNota(Float terceiraNota) {
        this.terceiraNota = terceiraNota;
    }

    public Float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Float notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getResultado() {
        return Resultado;
    }

    public void setResultado(String resultado) {
        Resultado = resultado;
    }
}
