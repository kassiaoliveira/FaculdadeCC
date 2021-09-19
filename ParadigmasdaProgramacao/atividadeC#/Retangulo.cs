using System;

namespace Atividade {
    public class Retangulo {
        
            private double larg;
            private double alt;
            private double resultadoArea;
            private double resultadoPeri;
            private double resultadoDiag;
    
            public void resultado(double larg, double alt) {
                this.resultadoArea = (larg * alt);
                this.resultadoPeri = (2 * (larg + alt));
                this.resultadoDiag = Math.Sqrt((Math.Pow(larg, 2) + Math.Pow(alt, 2)));
                Console.WriteLine(("Área: " + this.resultadoArea));
                Console.WriteLine(("Perímetro: " + this.resultadoPeri));
                Console.WriteLine(("Diagonal: " + this.resultadoDiag));
            }
    
            public double GetLarg() {
                return this.larg;
            }
    
            public void SetLarg(double larg) {
                this.larg = larg;
            }
            
            public double GetAlt() {
                return this.alt;
            }
    
            public void SetAlt(double alt) {
                this.alt = alt;
            }
    } 
}