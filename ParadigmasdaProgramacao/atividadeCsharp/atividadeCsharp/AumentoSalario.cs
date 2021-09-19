using System;

namespace atividadeCsharp
{
    public class AumentoSalario
    {
        public AumentoSalario()
        {
        }
        private string nomeTrabalhador;
        private float salario;
        private float imposto;
        private float aumento;

        public string NomeTrabalhador { get => nomeTrabalhador; set => nomeTrabalhador = value; }
        public float Salario { get => salario; set => salario = value; }
        public float Imposto { get => imposto; set => imposto = value; }
        public float Aumento { get => aumento; set => aumento = value; }

        public float salarioLiquido(float salario, float imposto)
        {
            this.salario = salario;
            this.imposto = imposto;
            this.salario -= this.imposto;
            return this.salario;
        }

        public float novoSalario(float salario, float aumento)
        {
            this.salario = salario;
            this.aumento = aumento;
            this.salario = this.salario + this.salario * (this.aumento / 100);
            return this.salario;
        }
    }
}