package com.bbva.wikj.lib.r002.impl;

import com.bbva.wikj.dto.ejercicioapxv.DataDTO;
import com.bbva.wikj.dto.ejercicioapxv.DataSalidaDTO;
import com.bbva.wikj.dto.ejercicioapxv.ProductoSalidaDTO;
import com.bbva.wikj.dto.ejercicioapxv.servicioGet.DataEntradaGetDTO;
import com.bbva.wikj.dto.ejercicioapxv.servicioGet.ProductoSalidaGetDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * The WIKJR002Impl class...
 */
public class WIKJR002Impl extends WIKJR002Abstract {

    private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR002Impl.class);

    @Override
    public DataSalidaDTO execute(DataDTO dataDTO) {
        ProductoSalidaDTO productoSalidaDTO = new ProductoSalidaDTO();
        productoSalidaDTO.setNombre(dataDTO.getCompra().get(0).getNombre());
        productoSalidaDTO.setMarca(dataDTO.getCompra().get(0).getMarca());
        productoSalidaDTO.setDescripcion(dataDTO.getCompra().get(0).getDescripcion());
        productoSalidaDTO.setPrecio(dataDTO.getCompra().get(0).getPrecio());
        productoSalidaDTO.setCantidad(dataDTO.getCompra().get(0).getCantidad());
        int precioTotal = dataDTO.getCompra().get(0).getPrecio() * dataDTO.getCompra().get(0).getCantidad();
        productoSalidaDTO.setPrecioTotal(precioTotal);
        productoSalidaDTO.setIva(16);
        int ivaCompra = precioTotal * 16 / 100;
        productoSalidaDTO.setPrecioConIva(ivaCompra + precioTotal);
        DataSalidaDTO dataSalidaDTO = new DataSalidaDTO();
        dataSalidaDTO.setVenta(dataSalidaDTO.getVenta());
        return dataSalidaDTO;
    }

    @Override
    public ProductoSalidaGetDTO responseGet(DataEntradaGetDTO dataEntradaGetDTO) {



        ProductoSalidaDTO productoSalidaDTO = new ProductoSalidaDTO();
        productoSalidaDTO.setNombre(dataDTO.getCompra().get(0).getNombre());
        productoSalidaDTO.setMarca(dataDTO.getCompra().get(0).getMarca());
        productoSalidaDTO.setDescripcion(dataDTO.getCompra().get(0).getDescripcion());
        productoSalidaDTO.setPrecio(dataDTO.getCompra().get(0).getPrecio());
        productoSalidaDTO.setCantidad(dataDTO.getCompra().get(0).getCantidad());
        int precioTotal = dataDTO.getCompra().get(0).getPrecio() * dataDTO.getCompra().get(0).getCantidad();
        productoSalidaDTO.setPrecioTotal(precioTotal);
        productoSalidaDTO.setIva(16);
        int ivaCompra = precioTotal * 16 / 100;
        productoSalidaDTO.setPrecioConIva(ivaCompra + precioTotal);
        DataSalidaDTO dataSalidaDTO = new DataSalidaDTO();
        dataSalidaDTO.setVenta(dataSalidaDTO.getVenta());
        return dataSalidaDTO;

    }


}
