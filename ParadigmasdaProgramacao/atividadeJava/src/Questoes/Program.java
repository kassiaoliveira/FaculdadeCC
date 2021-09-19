package Questoes;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int questao = getMenu(scan);

        do{
            switch (questao){
                case 1:
                // Moisés Torquato de Santana 202004813
                    Pessoa pessoaUm = new Pessoa();
                    Pessoa pessoaDois = new Pessoa();

                    System.out.println("Informe o nome da primeira pessoa: ");
                    pessoaUm.setNome(scan.nextLine());
                    System.out.println("Informe a idade da primeira pessoa: ");
                    pessoaUm.setIdade(scan.nextInt());
                    scan.nextLine();

                    System.out.println("Informe o nome da segunda pessoa: ");
                    pessoaDois.setNome(scan.nextLine());
                    System.out.println("Informe a idade da segunda pessoa: ");
                    pessoaDois.setIdade(scan.nextInt());

                    Pessoa.pessoaMaisVelha(pessoaUm, pessoaDois);
                    questao = getMenu(scan);
                    break;

                case 2:
                    //Isabelle Conceição de Souza Lourenço 202003947
                    Funcionario primeiroFuncionario = new Funcionario();
                    Funcionario segundoFuncionario = new Funcionario();

                    System.out.println("Informe os dados do primeiro funcionário: ");
                    System.out.println("Nome: ");
                    String nome = scan.next();
                    primeiroFuncionario.setNome(nome);

                    System.out.println("Salario: ");
                    Double salario1 = scan.nextDouble();
                    primeiroFuncionario.setSalario(salario1);

                    System.out.println("Informe os dados do Segundo funcionário: ");
                    System.out.println("Nome: ");
                    String nome2 = scan.next();
                    segundoFuncionario.setNome(nome2);

                    System.out.println("Salario: ");
                    Double salario2 = scan.nextDouble();
                    segundoFuncionario.setSalario(salario2);

                    Double salarioMedio = primeiroFuncionario.calcularMedia(salario1,salario2);
                    System.out.println("Salário Médio: " + salarioMedio);

                    questao = getMenu(scan);
                    break;

                case 3:
                    //Renan Yuri Bernardo da Silva 202004640
                    Retangulo retangulo = new Retangulo();
                    System.out.println("Informe a largura do retângulo:  ");
                    double larg =scan.nextDouble();


                    System.out.println("Informe a altura do retângulo: ");
                    double alt = scan.nextDouble();

                    retangulo.resultado(larg,alt);

                    questao = getMenu(scan);
                    break;

                case 4:
                    //Ana Beatriz Araújo de Sousa  202004354
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Digite o nome do trabalhador");
                    nome = sc.nextLine();
                    System.out.println("Digite o salário do trabalhador");
                    double salario = sc.nextDouble();
                    System.out.println("Digite o imposto em cima do salário do trabalhador");
                    double imposto = sc.nextDouble();

                    AumentoSalario cadastro = new AumentoSalario(nome, salario, imposto);

                    System.out.println("Dados do trabalhador: ");
                    System.out.println("Nome: " + cadastro.getNome());
                    double salarioLiquido = cadastro.salarioLiquido(salario, imposto);
                    System.out.println("Salário líquido: " + salarioLiquido);

                    System.out.println("Insira a porcentagem do aumento de salario: ");
                    double aumento = sc.nextDouble();

                    double novoSalario = cadastro.aumento(salarioLiquido, aumento);

                    System.out.println("Novo salário líquido: " + novoSalario);
                    questao = getMenu(scan);
                    break;

                case 5:
                    //Kassia Oliveira da Silva 202002098
                    Aluno aluno = new Aluno();
                    System.out.println("Digite o nome do Aluno");
                    System.out.println("Nome: ");
                    String nomeAluno = scan.next();
                    aluno.setNomeAluno(nomeAluno);

                    System.out.println("Digite a Primeira nota do aluno");
                    Double primeiraNota=scan.nextDouble();
                    aluno.setPrimeiraNota(primeiraNota);

                    System.out.println("Digite a Segunda nota do aluno");
                    Double segundaNota=scan.nextDouble();
                    aluno.setSegundaNota(segundaNota);

                    System.out.println("Digite a Terceira nota do aluno");
                    Double terceiraNota=scan.nextDouble();
                    aluno.setTerceiraNota(terceiraNota);

                    aluno.calcularMediaAluno(primeiraNota,segundaNota,terceiraNota);

                    questao = getMenu(scan);
                    break;

                case 0:
                    System.out.println("Encerrando Aplicação.....");

                    break;
                default:
                    System.out.println("Número inválido, digite novamente: ");
                    questao = getMenu(scan);
                    break;
            }


        }while (questao != 0);
    }

    private static int getMenu(Scanner scan) {
        System.out.println("");
        System.out.println("******MENU******");
        System.out.println("Informe a questão que deseja resolver:");
        System.out.println("1 - Pessoa Mais Velha");
        System.out.println("2 - Salário Médio");
        System.out.println("3 - Retângulo");
        System.out.println("4 - Aumento Salarial");
        System.out.println("5 - Boletim Aluno");
        System.out.println("0 - Sair");
        System.out.println("");

        int questao = scan.nextInt();
        return questao;
    }
}
