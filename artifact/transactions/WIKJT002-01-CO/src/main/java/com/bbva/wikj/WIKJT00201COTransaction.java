package com.bbva.wikj;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.wikj.dto.ejercicioapxv.DataSalidaDTO;
import com.bbva.wikj.lib.r002.WIKJR002;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * transacciones de ejercicio ventas apx
 */
public class WIKJT00201COTransaction extends AbstractWIKJT00201COTransaction {

    private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT00201COTransaction.class);

    /**
     * The execute method...
     */
    @Override
    public void execute() {
        LOGGER.info("Starting execute WIKJT00101COTransaction {}", getData());
        WIKJR002 wikjR002 = (WIKJR002) getServiceLibrary(WIKJR002.class);
        // TODO

        DataSalidaDTO dataSalidaDTO = wikjR002.execute(getData());

        if (getAdviceList().isEmpty()) {

            LOGGER.info("result execute successful WIKJT00101COTransaction");

            setData(dataSalidaDTO);

            this.setSeverity(Severity.OK);

        } else {

            LOGGER.info("result execute fail WIKJT00101COTransaction");

            this.setSeverity(Severity.ENR);
        }
    }


}
