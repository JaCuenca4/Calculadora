package com.example.calculadorabasica.Clases;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Conversion.
 */
public class Conversion {

    /**
     * Instantiates a new Conversion.
     */
    public Conversion() {

    }

    /**
     * Convertir list.
     *
     * @param dato          the dato
     * @param identificador the identificador
     * @return the list
     */
    public List<String> convertir(String dato, String identificador) {
        List<String> resultados = new ArrayList<>();
        String dato2 = convertDecimal(dato, identificador);
        resultados.add(getHexa(dato2));
        resultados.add(getDecimal(dato2));
        resultados.add(getOctal(dato2));
        resultados.add(getBinario(dato2));
        return resultados;
    }

    /**
     * Convert decimal string.
     *
     * @param dato          the dato
     * @param identificador the identificador
     * @return the string
     */
    public String convertDecimal(String dato, String identificador) {
        if (identificador.equals("HEX")) {
            Long decimal = Long.parseLong(dato, 16);
            return String.valueOf(decimal);
        } else if (identificador.equals("DEC")) {
            return dato;
        } else if (identificador.equals("BIN")) {
            long numeroDecimal = Long.parseLong(dato, 2);
            return String.valueOf(numeroDecimal);
        } else if (identificador.equals("OCT")) {
            Long decimal = Long.parseLong(dato, 8);
            return String.valueOf(decimal);
        } else {
            return dato;
        }
    }

    /**
     * Gets hexa.
     *
     * @param dato the dato
     * @return the hexa
     */
    public String getHexa(String dato) {
        int dato2 = Integer.valueOf(dato);
        String hexadecimal = Integer.toHexString(dato2);
        return "HEX " + hexadecimal.toUpperCase();

    }

    /**
     * Gets decimal.
     *
     * @param dato the dato
     * @return the decimal
     */
    public String getDecimal(String dato) {
        return "DEC " + dato;
    }

    /**
     * Gets octal.
     *
     * @param dato the dato
     * @return the octal
     */
    public String getOctal(String dato) {
        int dato2 = Integer.valueOf(dato);
        String octal = Integer.toOctalString(dato2);
        return "OCT " + octal;
    }

    /**
     * Gets binario.
     *
     * @param dato the dato
     * @return the binario
     */
    public String getBinario(String dato) {
        Long dato2 = Long.getLong(dato);
        String binario = Long.toBinaryString(dato2);
        return "BIN " + binario;
    }
}