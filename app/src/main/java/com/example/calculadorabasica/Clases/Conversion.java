package com.example.calculadorabasica.Clases;

import java.util.ArrayList;
import java.util.List;

public class Conversion {

    public Conversion(){

    }

    public List<String> convertir(String dato, String identificador){
        List<String> resultados = new ArrayList<>();

        dato=convertDecimal(dato,identificador);
        resultados.add(getHexa(dato));
        resultados.add(getDecimal(dato));
        resultados.add(getOctal(dato));
        resultados.add(getBinario(dato));

        return null;
    }
    public String convertDecimal(String dato, String identificador){
        if(identificador.equals("HEX")){
            int decimal = Integer.parseInt(dato, 16);
            return String.valueOf(decimal);
        }else if(identificador.equals("DEC")){
            return dato;
        }else if(identificador.equals("BIN")){
            long numeroDecimal = Long.parseLong(dato, 2);
            return String.valueOf(numeroDecimal);
        }else if(identificador.equals("OCT")){
            int decimal=Integer.parseInt(dato,8);
            return String.valueOf(decimal);
        }else{
            return dato;
        }
    }
    public String getHexa(String dato){
        int dato2=Integer.getInteger(dato);
        String hexadecimal = Integer.toHexString(dato2);
       return hexadecimal;

    }

    public String getDecimal(String dato){
        return dato;
    }

    public String getOctal(String dato){
        int dato2=Integer.getInteger(dato);
        String octal = Integer.toOctalString(dato2);


        return octal;
    }

    public String getBinario(String dato){
        int dato2=Integer.getInteger(dato);
        String binario = Long.toBinaryString(dato2);
        return binario;
    }
}