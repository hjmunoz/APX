package com.bbva.wikj.dto.ejercicioapxv.servicioGet;

public class ProductoSalidaGetDTO {

    private String nombre;
    private String marca;
    private String descripcion;
    private int precio;
    private int cantidad;
    private int precioTotal;
    private int iva;

    private int precioConIva;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getPrecioConIva() {
        return precioConIva;
    }

    public void setPrecioConIva(int precioConIva) {
        this.precioConIva = precioConIva;
    }

    @Override
    public String toString() {
        return "ProductoSalidaGetDTO{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", precioTotal=" + precioTotal +
                ", iva=" + iva +
                ", precioConIva=" + precioConIva +
                '}';
    }
}
