package com.example.calculadorabasica.Clases;

import java.util.ArrayList;
import java.util.List;

public class Conversion {

    public Conversion(){

    }

    public List<String> convertir(String dato){
        List<String> resultados = new ArrayList<>();

        resultados.add(getHexadecimal(dato));
        resultados.add(getDecimal(dato));
        resultados.add(getOctal(dato));
        resultados.add(getBinario(dato));

        return null;
    }

    public String getHexadecimal(String dato){
        //Codigo para convertir

        return null;
    }

    public String getDecimal(String dato){
        //Codigo para convertir
        return null;
    }

    public String getOctal(String dato){
        //Codigo para convertir
        return null;
    }

    public String getBinario(String dato){
        //Codigo para convertir
        return null;
    }
}
