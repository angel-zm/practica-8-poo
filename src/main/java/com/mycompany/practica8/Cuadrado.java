package com.mycompany.practica8;
public class Cuadrado  extends PoligonoC{
    private int alfa,beta;
    private float a,b,base,alt;

    public Cuadrado() {
    }
    
    public void setBase(float x){ 
     }
    public void setAltura(float x){ 
     }

    public int getAlfa() {
        return alfa;
    }

    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getAlt() {
        return alt;
    }

    public void setAlt(float alt) {
        this.alt = alt;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", alt=" + alt + '}';
    }
    
}
