package com.company;

public class Calculadora {
    private double v1;
    private double v2;


    public double soma(double v1, double v2){
       return v1 + v2;
    }

    public double subtracao(double v1, double v2){
        return v1 - v2;
    }

    public double multiplicacao(double v1, double v2){
        return v1 * v2;
    }

    public double divisao(double v1, double v2){
        if(v2 == 0){
            throw new IllegalCallerException("Impossível divisão por 0");
        }
        return v1 / v2;
    }

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }

}
