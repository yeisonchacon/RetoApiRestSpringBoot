package com.ntt.RestSpringSqlServer.model;

public class Ciudad {

    private String NOMBRE;

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "NOMBRE='" + NOMBRE + '\'' +
                '}';
    }
}
