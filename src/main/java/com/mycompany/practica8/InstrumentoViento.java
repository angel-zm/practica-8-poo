/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica8;

/**
 *
 * @author ANGEL ZAMUDIO
 */
public class InstrumentoViento extends Object implements InstrumentoMusical{

    public InstrumentoViento() {
    }
    

    @Override
    public void tocar() {
        System.out.println("TOCANDO EL ISNTRUMENTO DE VIENTO");
    }

    @Override
    public void afinar() {
        System.out.println("AFINANDO INSTRUMENTO DE VIENTO");
    }

    @Override
    public String tipoInstrumento() {
    return "flauta";
    }

    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
}
