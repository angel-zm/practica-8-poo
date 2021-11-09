/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica8;

public class TrianguloA extends PoligonoA{
    private int alfa,beta,gama;
    private float a,b,c,base,alt;

    public TrianguloA(int alfa, int beta, int gama, float a, float b, float c, float base, float alt) {
        this.alfa = alfa;
        this.beta = beta;
        this.gama = gama;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.alt = alt;
    }

    public TrianguloA() {
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

    public int getGama() {
        return gama;
    }

    public void setGama(int gama) {
        this.gama = gama;
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

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAlt() {
        return alt;
    }

    public void setAlt(float alt) {
        this.alt = alt;
    }

    @Override
    public double area() {
        return (base*alt)/2;
    }

    @Override
    public double perimetro() {
    return a+b+c;    
    }

    @Override
    public String toString() {
        return "TrianguloA{" + "alfa=" + alfa + ", beta=" + beta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", alt=" + alt + '}';
    }

    
    
}
