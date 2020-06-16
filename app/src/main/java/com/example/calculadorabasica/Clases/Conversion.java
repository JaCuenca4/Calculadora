package com.example.calculadorabasica.Clases;

import java.util.ArrayList;
import java.util.List;

public class Conversion {

    public Conversion(){

    }

    public List<String> convertir(String dato, String identificador){
        List<String> resultados = new ArrayList<>();
        String dato2=convertDecimal(dato,identificador);
        resultados.add(getHexa(dato2));
        resultados.add(getDecimal(dato2));
        resultados.add(getOctal(dato2));
        resultados.add(getBinario(dato2));
        return resultados;
    }
    public String convertDecimal(String dato, String identificador){
        if(identificador.equals("HEX")){
            Long decimal = Long.parseLong(dato, 16);
            return String.valueOf(decimal);
        }else if(identificador.equals("DEC")){
            return dato;
        }else if(identificador.equals("BIN")){
            long numeroDecimal = Long.parseLong(dato, 2);
            return String.valueOf(numeroDecimal);
        }else if(identificador.equals("OCT")){
            Long decimal=Long.parseLong(dato,8);
            return String.valueOf(decimal);
        }else{
            return dato;
        }
    }
    public String getHexa(String dato){
        Long dato2=Long.getLong(dato);
        String hexadecimal = Long.toHexString(dato2);
       return hexadecimal;

    }

    public String getDecimal(String dato){
        return dato;
    }

    public String getOctal(String dato){
        Long dato2=Long.getLong(dato);
        String octal = Long.toOctalString(dato2);


        return octal;
    }

    public String getBinario(String dato){
        Long dato2=Long.getLong(dato);
        String binario = Long.toBinaryString(dato2);
        return binario;
    }
}