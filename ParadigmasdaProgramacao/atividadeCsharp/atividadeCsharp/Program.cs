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
                        // Moisés Torquato de Santana 202004813
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
                        //Isabelle Conceição de Souza Lourenço 202003947
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
                        //Renan Yuri Bernardo da Silva 202004640
                        Retangulo retangulo = new Retangulo();

                        Console.WriteLine("Informe a largura do retángulo:  ");
                        retangulo.SetLarg(Convert.ToDouble(Console.ReadLine()));

                        Console.WriteLine("Informe a altura do retángulo: ");
                        retangulo.SetAlt(Convert.ToDouble(Console.ReadLine())); ;

                        retangulo.resultado(retangulo.GetLarg(), retangulo.GetAlt());
                        questao = MostrarMenu();
                        break;
                    case 4:
                        //Ana Beatriz Araújo de Sousa  202004354

                        Console.WriteLine("Digite o nome do trabalhador: ");
                        string nomeTrabalhador = Console.ReadLine();
                        Console.WriteLine("Digite o salário do trabalhador: ");
                        float salario = float.Parse(Console.ReadLine());
                        Console.WriteLine("Digite o imposto sob o salário do trabalhador: ");
                        float imposto = float.Parse(Console.ReadLine());

                        AumentoSalario aumentoSalarial = new AumentoSalario();

                        Console.WriteLine("Dados do trabalhador: ");
                        aumentoSalarial.NomeTrabalhador = nomeTrabalhador;
                        Console.WriteLine(aumentoSalarial.NomeTrabalhador);
                        salario = aumentoSalarial.salarioLiquido(salario, imposto);
                        Console.WriteLine("Salário líquido: ");
                        Console.WriteLine(aumentoSalarial.Salario);
                        Console.WriteLine("Digite o aumento salarial: ");
                        float aumento = float.Parse(Console.ReadLine());
                        aumentoSalarial.Aumento = aumento;
                        salario = aumentoSalarial.novoSalario(salario, aumento);
                        Console.WriteLine("Novo salário: ");
                        Console.WriteLine(aumentoSalarial.Salario);

                        questao = MostrarMenu();

                        break;
                    case 5:
                        //Kassia Oliveira da Silva 202002098
                        Aluno aluno = new Aluno();

                        Console.WriteLine("Digite o nome do Aluno");
                        string nomeAluno = Console.ReadLine();
                        aluno.SetNomeAluno(nomeAluno);

                        Console.WriteLine("Digite a Primeira nota do aluno");
                        double primeiraNota = Convert.ToDouble(Console.ReadLine());
                        aluno.SetPrimeiraNota(primeiraNota);
                        while (aluno.GetPrimeiraNota() > 30)
                        {
                            Console.WriteLine("Nota inválida! Digite a primeira nota do aluno");
                            aluno.SetPrimeiraNota(Convert.ToDouble(Console.ReadLine()));
                        }


                        Console.WriteLine("Digite a Segunda nota do aluno");
                        double segundaNota = Convert.ToDouble(Console.ReadLine());
                        aluno.SetSegundaNota(segundaNota);
                        while (aluno.GetSegundaNota() > 35){
                        Console.WriteLine("Nota inválida! Digite a Segunda nota do aluno");
                            aluno.SetSegundaNota(Convert.ToDouble(Console.ReadLine()));
                        }
                        

                        Console.WriteLine("Digite a Terceira nota do aluno");
                        double terceiraNota = Convert.ToDouble(Console.ReadLine());
                        aluno.SetTerceiraNota(terceiraNota);
                        while (aluno.GetPrimeiraNota() > 35)
                        {
                            Console.WriteLine("Nota inválida! Digite a terceira nota do aluno");
                            aluno.SetTerceiraNota(Convert.ToDouble(Console.ReadLine()));
                        }


                        aluno.CalcularMediaAluno(primeiraNota, segundaNota, terceiraNota);
                       
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
