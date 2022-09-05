package com.bbva.wikj.dto.ejercicioapxv.servicioGet;

public class DataEntradaGetDTO {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "DataEntradaGetDTO{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
