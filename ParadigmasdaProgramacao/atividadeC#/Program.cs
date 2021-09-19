using System;
using Atividade;


    public class Program {

    public static void main(String[] args) {

        int questao;
        Console.WriteLine("Primeira Atividade:");
        Console.WriteLine("Informe a questão que deseja resolver:");
        Console.WriteLine("1 - Pessoa Mais Velha");
        Console.WriteLine("2 - Salário Médio");
        Console.WriteLine("3 - Retángulo");
        Console.WriteLine("4 - Aumento Salarial");
        Console.WriteLine("5 - Boletim Aluno");
        Console.WriteLine("0 - Sair");
        questao = Convert.ToInt16(Console.ReadLine());

        do
        {
            switch (questao)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    Retangulo retangulo = new Retangulo();

                    Console.WriteLine("Informe a largura do retángulo:  ");
                    retangulo.SetLarg(Convert.ToDouble(Console.ReadLine()));

                    Console.WriteLine("Informe a altura do retángulo: ");
                    retangulo.SetAlt(Convert.ToDouble(Console.ReadLine())); ;

                    retangulo.resultado(retangulo.GetLarg(), retangulo.GetAlt());
                    break;

                case 4:

                    break;
                case 5:
                    Aluno aluno = new Aluno();

                    Console.WriteLine("Digite o nome do Aluno");
                    String nomeAluno = Console.ReadLine();
                    aluno.SetNomeAluno(nomeAluno);

                    Console.WriteLine("Digite a Primeira nota do aluno");
                    double primeiraNota = Convert.ToDouble(Console.ReadLine());
                    aluno.SetPrimeiraNota(primeiraNota);

                    Console.WriteLine("Digite a Segunda nota do aluno");
                    double segundaNota = Convert.ToDouble(Console.ReadLine());
                    aluno.SetSegundaNota(segundaNota);

                    Console.WriteLine("Digite a Terceira nota do aluno");
                    double terceiraNota = Convert.ToDouble(Console.ReadLine());
                    aluno.SetTerceiraNota(terceiraNota);

                    double notaFinal = aluno.CalcularMediaAluno(primeiraNota, segundaNota, terceiraNota);
                    if ((notaFinal >= 60))
                    {
                        Console.WriteLine("Aluno Aprovado");
                    }
                    else
                    {
                        Console.WriteLine("Aluno Reprovado");
                        Console.WriteLine(("Faltam: " + (60 - notaFinal)));
                    }
                    break;

                default:
                    Console.WriteLine("Número inválido, digite novamente: ");
                    questao = Convert.ToInt16(Console.ReadLine());
                    break;
            }
        } while ((questao != 0));

    }

 }



