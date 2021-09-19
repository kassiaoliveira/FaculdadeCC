using System;

namespace atividadeCsharp
{
    class Program
    {
        static void Main(string[] args)
        {

            int questao = MostrarMenu();

            do
            {
                switch (questao)
                {

                    case 1:
                        
                        Pessoa pessoaUm = new Pessoa();
                        Pessoa pessoaDois = new Pessoa();

                        Console.WriteLine("Informe o nome da primeira pessoa: ");
                        pessoaUm.SetNome(Console.ReadLine());
                        Console.WriteLine("Informe a idade da primeira pessoa: ");
                        pessoaUm.SetIdade(Convert.ToInt32(Console.ReadLine()));

                        Console.WriteLine("Informe o nome da segunda pessoa: ");
                        pessoaDois.SetNome(Console.ReadLine());
                        Console.WriteLine("Informe a idade da segunda pessoa: ");
                        pessoaDois.SetIdade(Convert.ToInt32(Console.ReadLine()));

                        Pessoa.pessoaMaisVelha(pessoaUm,
                                               pessoaDois);

                        questao = MostrarMenu();
                        break;
                    case 2:

                        Funcionario primeiroFuncionario = new Funcionario();
                        Funcionario segundoFuncionario = new Funcionario();

                        Console.WriteLine("Informe os dados do primeiro funcionário:  ");
                        Console.WriteLine("Nome:  ");
                        string nome = Console.ReadLine();
                        primeiroFuncionario.SetNome(nome);

                        Console.WriteLine("Salário: ");
                        double salario1 = Convert.ToDouble(Console.ReadLine());
                        primeiroFuncionario.SetSalario(salario1);

                        Console.WriteLine("Informe os dados do segundo funcionário:  ");
                        Console.WriteLine("Nome:  ");
                        nome = Console.ReadLine();
                        segundoFuncionario.SetNome(nome);

                        Console.WriteLine("Salário: ");
                        double salario2 = Convert.ToDouble(Console.ReadLine());
                        segundoFuncionario.SetSalario(salario2);

                        double salarioMedio = primeiroFuncionario.calcularMedia(salario1, salario2);
                        Console.WriteLine("Salário Médio: " + salarioMedio);
                        questao = MostrarMenu();
                        break;
                    case 3:
                        Retangulo retangulo = new Retangulo();

                        Console.WriteLine("Informe a largura do retángulo:  ");
                        retangulo.SetLarg(Convert.ToDouble(Console.ReadLine()));

                        Console.WriteLine("Informe a altura do retángulo: ");
                        retangulo.SetAlt(Convert.ToDouble(Console.ReadLine())); ;

                        retangulo.resultado(retangulo.GetLarg(), retangulo.GetAlt());
                        questao = MostrarMenu();
                        break;
                    case 4:
                        break;
                    case 5:

                        Aluno aluno = new Aluno();

                        Console.WriteLine("Digite o nome do Aluno");
                        string nomeAluno = Console.ReadLine();
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
                        if (notaFinal >= 60)
                        {
                            Console.WriteLine("Aluno Aprovado");
                        }
                        else
                        {
                            Console.WriteLine("Aluno Reprovado");
                            Console.WriteLine("Faltam: " + (60 - notaFinal));
                        }
                        questao = MostrarMenu();
                        break;
                    case 0:
                        Console.WriteLine("Encerrando Aplicação");
                        break;
                    default:
                        Console.WriteLine("Número inválido, digite novamente: ");
                        questao = Convert.ToInt16(Console.ReadLine());
                        break;
                }

            } while (questao != 0);
        }

        static int MostrarMenu()
        {
            Console.WriteLine("");
            Console.WriteLine("Menu");
            Console.WriteLine("Informe a questão que deseja resolver:");
            Console.WriteLine("1 - Pessoa Mais Velha");
            Console.WriteLine("2 - Salário Médio");
            Console.WriteLine("3 - Retángulo");
            Console.WriteLine("4 - Aumento Salarial");
            Console.WriteLine("5 - Boletim Aluno");
            Console.WriteLine("0 - Sair");
            Console.WriteLine("");

            int questao = Convert.ToInt16(Console.ReadLine());
            return questao;
        } 

    }
}
