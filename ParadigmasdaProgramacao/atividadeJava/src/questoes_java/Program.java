package questoes_java;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int questao;

        System.out.println("Primeira Atividade:");
        System.out.println("Informe a questão que deseja resolver:");
        System.out.println("1 - Pessoa Mais Velha");
        System.out.println("2 - Salário Médio");
        System.out.println("3 - Retângulo");
        System.out.println("4 - Aumento Salarial");
        System.out.println("5 - Boletim Aluno");
        System.out.println("0 - Sair");

        questao = scan.nextInt();

        do
        {
            switch (questao)
            {
                case 1:

                    return;

                case 2:
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

                    return;

                case 3:
                    Retangulo retangulo = new Retangulo();
                    System.out.println("Informe a largura do retângulo:  ");
                    double larg =scan.nextDouble();


                    System.out.println("Informe a altura do retângulo: ");
                    double alt = scan.nextDouble();

                    retangulo.resultado(larg,alt);

                    return;

                case 4:

                    return;

                case 5:
                    Aluno aluno = new Aluno();
                    System.out.println("Digite o nome do Aluno");
                    System.out.println("Nome: ");
                    String nomeAluno = scan.next();
                    aluno.setNomeAluno(nomeAluno);

                    System.out.println("Digite a Primeira nota do aluno");
                    float primeiraNota=scan.nextFloat();
                    aluno.setPrimeiraNota(primeiraNota);

                    System.out.println("Digite a Segunda nota do aluno");
                    float segundaNota=scan.nextFloat();
                    aluno.setSegundaNota(segundaNota);

                    System.out.println("Digite a Terceira nota do aluno");
                    float terceiraNota=scan.nextFloat();
                    aluno.setTerceiraNota(terceiraNota);

                    Float notaFinal = aluno.calcularMediaAluno(primeiraNota,segundaNota,terceiraNota);

                    if ( notaFinal >= 60 ){
                        System.out.println("Aluno Aprovado");
                        } else{
                        System.out.println("Aluno Reprovado");
                        System.out.println("Faltam: " + (60 - notaFinal));
                };
                    return;

                default:
                    System.out.println("Número inválido, digite novamente: ");
                    questao = scan.nextInt();
            }


        }while (questao != 0);
    }
}
