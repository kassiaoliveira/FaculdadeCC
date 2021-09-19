package Questoes;

public class AumentoSalario {

        private String nome;
        private double salario;
        private double imposto;
        private double aumento;


        public String getNome() {
            return nome;
        }

        public AumentoSalario(String nome, double salario, double imposto) {
            this.nome = nome;
            this.salario = salario;
            this.imposto = imposto;
        }

        public double salarioLiquido(double salario, double imposto) {
            this.salario -= this.imposto;

            return this.salario;
        }

        public double aumento(double salario, double aumento) {
            this.aumento = aumento;
            this.salario = this.salario + this.salario * (this.aumento/100);

            return this.salario;
        }
}
