package com.ebac.modulo51;

public class AplicacionPojo extends ClasePojo {

    public AplicacionPojo(String name, int edad, String ciudad) {
        super(name, edad, ciudad);
    }

    @Override
    public String calcular() {
        String msj = "Mi edad multiplicada por 4 es: " + this.edad * 4;
        return msj;
    }




}
