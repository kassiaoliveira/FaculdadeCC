package Questoes;

public class Funcionario {

    private String nome;
    private Double salario;
    private Double salarioMedio;

    public Double calcularMedia(Double primeiroSalario, Double segundoSalario) {

        salarioMedio = (primeiroSalario + segundoSalario) / 2;

        return salarioMedio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setSalarioMedio(Double salarioMedio) {
        this.salarioMedio = salarioMedio;
    }

}
