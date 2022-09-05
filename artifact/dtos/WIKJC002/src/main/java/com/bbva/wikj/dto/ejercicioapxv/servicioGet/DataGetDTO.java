package com.bbva.wikj.dto.ejercicioapxv.servicioGet;

import java.util.List;

public class DataGetDTO {

    List<ProductoSalidaGetDTO> venta;

    public List<ProductoSalidaGetDTO> getVenta() {
        return venta;
    }

    public void setVenta(List<ProductoSalidaGetDTO> venta) {
        this.venta = venta;
    }

    @Override
    public String toString() {
        return "DataGetDTO{" +
                "venta=" + venta +
                '}';
    }
}
