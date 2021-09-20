using System;

namespace atividadeCsharp
{

    public class Aluno
    {
        public Aluno()
        {
        }

        private string nomeAluno;

        private double primeiraNota;

        private double segundaNota;

        private double terceiraNota;

        private double notaFinal;

        private string Resultado;

        public void CalcularMediaAluno(double primeiraNota, double segundaNota, double terceiraNota)
        {
            notaFinal = this.primeiraNota + this.segundaNota + this.terceiraNota;

            if (notaFinal >= 60)
            {
                Console.WriteLine("Aluno Aprovado");
            }
            else
            {
                Console.WriteLine("Aluno Reprovado");
                Console.WriteLine("Faltam: " + (60 - notaFinal));
            }
        }

        public string GetNomeAluno()
        {
            return nomeAluno;
        }

        public void SetNomeAluno(string nomeAluno)
        {
            this.nomeAluno = nomeAluno;
        }

        public double GetPrimeiraNota()
        {
            return primeiraNota;
        }

        public void SetPrimeiraNota(double primeiraNota)
        {
            this.primeiraNota = primeiraNota;
        }

        public double GetSegundaNota()
        {
            return segundaNota;
        }

        public void SetSegundaNota(double segundaNota)
        {
            this.segundaNota = segundaNota;
        }

        public double GetTerceiraNota()
        {
            return terceiraNota;
        }

        public void SetTerceiraNota(double terceiraNota)
        {
            this.terceiraNota = terceiraNota;
        }

        public double GetNotaFinal()
        {
            return notaFinal;
        }

        public void SetNotaFinal(double notaFinal)
        {
            this.notaFinal = notaFinal;
        }

        public string GetResultado()
        {
            return Resultado;
        }

        public void SetResultado(string resultado)
        {
            Resultado = resultado;
        }
    }
}