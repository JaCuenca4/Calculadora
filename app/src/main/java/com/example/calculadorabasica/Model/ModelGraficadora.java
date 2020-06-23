package com.example.calculadorabasica.Model;

import com.example.calculadorabasica.Clases.Graficador;
import com.example.calculadorabasica.Clases.Numero;
import com.example.calculadorabasica.Interfaces.InterfacesGraficadora;

import java.util.List;

public class ModelGraficadora implements InterfacesGraficadora.Model {

    InterfacesGraficadora.Presenter presenter;
    Graficador graficador;

    public ModelGraficadora(InterfacesGraficadora.Presenter presenter){
        this.presenter = presenter;
        this.graficador = new Graficador();
    }

    @Override
    public List<List<Numero>> calcularCoordenadas(String tipo) {
        try{
            switch (tipo){
                case "seno":
                    return graficador.coordCos();
                case "coseno":
                    return  graficador.coordSeno();
            }
            return null;
        }catch (Exception ex){
            return null;
        }
    }
}
