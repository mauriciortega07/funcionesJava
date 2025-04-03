package com.ebac.modulo51;

public abstract class ClasePojo {
    String name;
    int edad;
    String ciudad;

    public ClasePojo(String name, int edad, String ciudad){
    this.name = name;
    this.edad = edad;
    this.ciudad = ciudad;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getName(){
        return name;
    }

    public int getEdad() {
        return edad;
    }

    public String getCiudad(){
        return ciudad;
    }

    @Override
    public String toString() {
        return "Hola mi nombre es " + name +
                ", vivo en " + ciudad +
                " y tengo " + edad + " años.";
    }

    public abstract String calcular();



}
