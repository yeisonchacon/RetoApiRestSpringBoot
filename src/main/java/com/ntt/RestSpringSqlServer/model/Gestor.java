package com.ntt.RestSpringSqlServer.model;

public class Gestor {
    private String PRIMER_NOMBRE;

    public String getPRIMER_NOMBRE() {
        return PRIMER_NOMBRE;
    }

    public void setPRIMER_NOMBRE(String PRIMER_NOMBRE) {
        this.PRIMER_NOMBRE = PRIMER_NOMBRE;
    }

    @Override
    public String toString() {
        return  PRIMER_NOMBRE;
    }
}