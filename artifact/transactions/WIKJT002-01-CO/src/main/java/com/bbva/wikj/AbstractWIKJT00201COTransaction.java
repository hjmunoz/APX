package com.bbva.wikj;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.wikj.dto.ejercicioapxv.DataDTO;
import com.bbva.wikj.dto.ejercicioapxv.DataSalidaDTO;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractWIKJT00201COTransaction extends AbstractTransaction {

	public AbstractWIKJT00201COTransaction(){
	}

	protected DataDTO getData(){
		return (DataDTO)getParameter("data");
	}

	protected void setData(final DataSalidaDTO dataSalidaDTO)
	{
		this.addParameter("data", dataSalidaDTO);

	}

}
