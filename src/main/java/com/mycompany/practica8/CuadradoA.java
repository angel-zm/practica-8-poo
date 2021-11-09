/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica8;


 
public class CuadradoA extends PoligonoA{
    private int alfa,beta;
    private float a,b,base,alt;

    public CuadradoA() {
    }

    public CuadradoA(int alfa, int beta, float a, float b, float base, float alt) {
        this.alfa = alfa;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.alt = alt;
    }
    

    @Override
    public double area() {
        return base*alt;
    }

    @Override
    public double perimetro() {
        return 2*(a+b);
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
    public String toString() {
        return "CuadradoA{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", alt=" + alt + '}';
    }
    
}
