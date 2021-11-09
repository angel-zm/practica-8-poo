
package com.mycompany.practica8;


public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("COMPORTAMIENTO DE OBJETOS COMO SU SUPER CLASE");
        PoligonoC poligono = new PoligonoC();
        //poligono se comporta como su superclase object
        Object objeto =poligono;
        System.out.println(poligono);
        System.out.println(objeto);
        poligono=new Triangulo();//reasignacion
        System.out.println(poligono);
        System.out.println(objeto);
        poligono=new Cuadrado();//reasignacion
        System.out.println(poligono);
        System.out.println("==================================CLASES ABSTRACTAS===========================");
        //PoligonoA polA= new PoligonoA(); --------------> no sepuede crear objetos de clases abstractas pero si a sus hijos
        PoligonoA pola = new TrianguloA();
        System.out.println(pola);
        pola= new CuadradoA();//reescritura
        System.out.println(pola);
        System.out.println("====================================== INTERFACES ======================");//CLASE ABSTRACTA PURAxD
        //podemos crear referencia a una interfaz
        InstrumentoMusical instrumento;
        //no podemos implementarla
        instrumento =new Flauta();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
        System.out.println(instrumento );
        
    }
    
}
