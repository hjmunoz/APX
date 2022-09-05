package com.bbva.wikj.dto.ejercicioapxv;

import java.util.List;

public class DataSalidaDTO {
    List<ProductoSalidaDTO> venta;

    public List<ProductoSalidaDTO> getVenta() {
        return venta;
    }

    public void setVenta(List<ProductoSalidaDTO> venta) {
        this.venta = venta;
    }

    @Override
    public String toString() {
        return "DataSalidaDTO{" +
                "venta=" + venta +
                '}';
    }
}
