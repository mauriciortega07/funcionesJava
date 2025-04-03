package com.ebac.modulo51;

public class Contexto {

    public static void main(String[] args) {

        ClasePojo objComun = new AplicacionPojo("Mauricio", 25, "cdmx");
        System.out.println(objComun.toString());
        System.out.println(objComun.calcular());


    }
}
