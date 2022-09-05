package com.bbva.wikj.lib.r002;


import com.bbva.wikj.dto.ejercicioapxv.DataDTO;
import com.bbva.wikj.dto.ejercicioapxv.DataSalidaDTO;
import com.bbva.wikj.dto.ejercicioapxv.servicioGet.DataEntradaGetDTO;
import com.bbva.wikj.dto.ejercicioapxv.servicioGet.ProductoSalidaGetDTO;

import java.util.List;

/**
 * The  interface WIKJR002 class...
 */
public interface WIKJR002 {

	/**
	 * The execute method...
	 */
	DataSalidaDTO execute(DataDTO dataDTO);

	DataSalidaDTO responseGet(DataEntradaGetDTO dataEntradaGetDTO);



}
