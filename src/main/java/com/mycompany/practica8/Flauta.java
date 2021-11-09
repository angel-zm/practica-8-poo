
package com.mycompany.practica8;

public class Flauta extends InstrumentoViento {

    public Flauta() {
    }
    //podemos sobrescribir los metodos

    @Override
    public String tipoInstrumento() {
        return "flauta";
    }
    
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
    
}
