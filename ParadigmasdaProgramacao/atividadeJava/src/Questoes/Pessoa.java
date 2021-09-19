package Questoes;

public class Pessoa {

    public Pessoa()
    {
    }

    private String nome;
    private int idade;

    public static void pessoaMaisVelha(Pessoa pessoaUm, Pessoa pessoaDois){
        if (pessoaUm.getIdade() > pessoaDois.getIdade())
        {
            System.out.println("Pessoa mais velha: " + pessoaUm.getNome());
        }
        else {
            System.out.println("Pessoa mais velha: " + pessoaDois.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
