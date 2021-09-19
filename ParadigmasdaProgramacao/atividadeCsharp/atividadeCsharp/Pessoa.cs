using System;

namespace atividadeCsharp
{
    public class Pessoa
    {
        public Pessoa()
        {
        }

        private string nome;
        private int idade;

       public static void pessoaMaisVelha(Pessoa pessoaUm, Pessoa pessoaDois){
            if (pessoaUm.GetIdade() > pessoaDois.GetIdade())
            {
                Console.WriteLine("Pessoa mais velha: " + pessoaUm.GetNome());
            }
            else {
                Console.WriteLine("Pessoa mais velha: " + pessoaDois.GetNome());

            }
        }
        public string GetNome()
        {
            return this.nome;
        }

        public void SetNome(string nome)
        {
            this.nome = nome;
        }

        public int GetIdade()
        {
            return idade;
        }

        public void SetIdade(int idade)
        {
            this.idade = idade;
        }
    }
}