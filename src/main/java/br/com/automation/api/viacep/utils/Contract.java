package br.com.automation.api.viacep.utils;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Contract {

    private static final Logger LOGGER = LogManager.getLogger(Contract.class);

    private Contract() {
        throw new IllegalStateException("Utility class");
    }

    public static File getContract(String contractName) {

        try {
            return new File("src/test/resources/schemas/" + contractName + ".json");
        } catch (NullPointerException e) {
            LOGGER.error("Error on load contract: %s", contractName);
        }

        return null;
    }
}