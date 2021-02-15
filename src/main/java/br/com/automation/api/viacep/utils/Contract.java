package br.com.automation.api.viacep.utils;

import java.io.File;

public class Contract {

    private Contract() {
        throw new IllegalStateException("Utility class");
    }

    public static File getContract(String contractName) {
        return new File("src/test/resources/schemas/" + contractName + ".json");
    }
}