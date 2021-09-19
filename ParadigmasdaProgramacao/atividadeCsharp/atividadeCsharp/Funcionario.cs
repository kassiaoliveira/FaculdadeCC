using System;

namespace atividadeCsharp
{
    public class Funcionario
    {
        public Funcionario()
        {
        }

        private string nome;
        private double salario;
        private double salarioMedio;

        public double calcularMedia(double primeiroSalario, double segundoSalario)
        {

            salarioMedio = (primeiroSalario + segundoSalario) / 2;

            return salarioMedio;
        }

        public string GetNome()
        {
            return this.nome;
        }

        public void SetNome(string nome)
        {
            this.nome = nome;
        }

        public double GetSalario()
        {
            return salario;
        }

        public void SetSalario(double salario)
        {
            this.salario = salario;
        }

        public double GetSalarioMedio()
        {
            return salarioMedio;
        }

        public void SetSalarioMedio(double salarioMedio)
        {
            this.salarioMedio = salarioMedio;
        }

    }
}
