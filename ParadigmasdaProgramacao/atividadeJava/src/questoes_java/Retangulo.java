package questoes_java;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Retangulo {
    private double larg, alt, area, peri, diag, resultadoArea,resultadoPeri, resultadoDiag;

    public void resultado (double larg, double alt){
        this.resultadoArea = (area = larg * alt);
        this.resultadoPeri = (peri = 2*(larg + alt));
        this.resultadoDiag = (diag =(sqrt(pow(larg,2) + pow(alt,2))));

        System.out.println("Área: " + resultadoArea);
        System.out.println("Perímetro: " + resultadoPeri);
        System.out.println("Diagonal: " + resultadoDiag);
    }


    public double getLarg() {
        return larg;
    }

    public void setLarg(double larg) {
        this.larg = larg;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPeri() {
        return peri;
    }

    public void setPeri(double peri) {
        this.peri = peri;
    }

    public double getDiag() {
        return diag;
    }

    public void setDiag(double diag) {
        this.diag = diag;
    }
}
