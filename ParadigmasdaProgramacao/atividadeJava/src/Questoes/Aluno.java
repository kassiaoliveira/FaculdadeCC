package Questoes;

public class Aluno {

    private String nomeAluno;
    private Double primeiraNota;
    private Double segundaNota;
    private Double terceiraNota;

    public Aluno(){
    }

    public static void  calcularMediaAluno (Double primeiraNota, Double segundaNota, Double terceiraNota){
       double notaFinal = (primeiraNota + segundaNota + terceiraNota) ;
        if ( notaFinal >= 60 ){
            System.out.println("Aluno Aprovado");
        } else{
            System.out.println("Aluno Reprovado");
            System.out.println("Faltam: " + (60 - notaFinal));
        }
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Double getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(Double primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public Double getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(Double segundaNota) {
        this.segundaNota = segundaNota;
    }

    public Double getTerceiraNota() {
        return terceiraNota;
    }

    public void setTerceiraNota(Double terceiraNota) {
        this.terceiraNota = terceiraNota;
    }

}
