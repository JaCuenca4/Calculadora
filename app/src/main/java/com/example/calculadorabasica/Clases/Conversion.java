package com.example.calculadorabasica.Clases;

import java.util.ArrayList;
import java.util.List;

public class Conversion {

    public Conversion(){

    }

    public List<String> convertir(String dato, String identificador){
        List<String> resultados = new ArrayList<>();

        resultados.add(getHexadecimal(dato,identificador));
        resultados.add(getDecimal(dato,identificador));
        resultados.add(getOctal(dato,identificador));
        resultados.add(getBinario(dato,identificador));

        return null;
    }

    public String getHexadecimal(String dato,String identificador){
        //Codigo para convertir
        if(identificador.equals("HEX")){
            return dato;
        }else if(identificador.equals("DEC")){
            int decimal=Integer.parseInt(dato,16);
            return String.valueOf(decimal);
        }else if(identificador.equals("OCT")){
            return null;
        }else if(identificador.equals("BIN")){
            return null;
        }else{
            return null;
        }

    }

    public String getDecimal(String dato, String identificador){
        //Codigo para convertir
        return null;
    }

    public String getOctal(String dato,String identificador){
        //Codigo para convertir
        return null;
    }

    public String getBinario(String dato,String identificador){
        //Codigo para convertir
        return null;
    }
}