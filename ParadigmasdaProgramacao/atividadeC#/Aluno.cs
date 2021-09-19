using System;

public class Aluno {
    
    private String nomeAluno;
    
    private double primeiraNota;
    
    private double segundaNota;
    
    private double terceiraNota;
    
    private double notaFinal;
    
    private String Resultado;
    
    public Aluno() {
    }
    
    public double CalcularMediaAluno(double primeiraNota, double segundaNota, double terceiraNota) {
        this.notaFinal = (this.primeiraNota + (this.segundaNota + this.terceiraNota));
        return this.notaFinal;
    }
    
    public String GetNomeAluno() {
        return this.nomeAluno;
    }
    
    public void SetNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    
    public double GetPrimeiraNota() {
        return this.primeiraNota;
    }
    
    public void SetPrimeiraNota(double primeiraNota) {
        this.primeiraNota = primeiraNota;
    }
    
    public double GetSegundaNota() {
        return this.segundaNota;
    }
    
    public void SetSegundaNota(double segundaNota) {
        this.segundaNota = segundaNota;
    }
    
    public double GetTerceiraNota() {
        return this.terceiraNota;
    }
    
    public void SetTerceiraNota(double terceiraNota) {
        this.terceiraNota = terceiraNota;
    }
    
    public double GetNotaFinal() {
        return this.notaFinal;
    }
    
    public void SetNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    public String GetResultado() {
        return this.Resultado;
    }
    
    public void SetResultado(String resultado) {
        this.Resultado = resultado;
        
    }
}