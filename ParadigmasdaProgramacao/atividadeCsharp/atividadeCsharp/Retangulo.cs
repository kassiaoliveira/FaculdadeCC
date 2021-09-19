using System;

namespace atividadeCsharp
{
    public class Retangulo
    {
        public Retangulo()
        {
        }

        private double larg;
        private double alt;
        private double resultadoArea;
        private double resultadoPeri;
        private double resultadoDiag;

        public void resultado(double larg, double alt)
        {
            resultadoArea = larg * alt;
            resultadoPeri = 2 * (larg + alt);
            resultadoDiag = Math.Sqrt(Math.Pow(larg, 2) + Math.Pow(alt, 2));
            Console.WriteLine("Área: " + resultadoArea);
            Console.WriteLine("Perímetro: " + resultadoPeri);
            Console.WriteLine("Diagonal: " + resultadoDiag);
        }

        public double GetLarg()
        {
            return larg;
        }

        public void SetLarg(double larg)
        {
            this.larg = larg;
        }

        public double GetAlt()
        {
            return alt;
        }

        public void SetAlt(double alt)
        {
            this.alt = alt;


        }
    }
}