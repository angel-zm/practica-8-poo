/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica8;

// clases abstractas podemos tener metodos abstractos y concretos (no se pueden crear objetos) 

public abstract class PoligonoA {
    public abstract double area();
    public abstract  double perimetro ();

    @Override
    public String toString() {
        return "PoligonoA{" + '}';
    }
    
}
