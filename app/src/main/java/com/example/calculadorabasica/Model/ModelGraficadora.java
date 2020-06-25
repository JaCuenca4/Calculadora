package com.example.calculadorabasica.Model;

import com.example.calculadorabasica.Clases.Graficador;
import com.example.calculadorabasica.Clases.Numero;
import com.example.calculadorabasica.Interfaces.InterfacesGraficadora;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.List;

/**
 * The type Model graficadora.
 */
public class ModelGraficadora implements InterfacesGraficadora.Model {

    /**
     * The Presenter.
     */
    InterfacesGraficadora.Presenter presenter;
    /**
     * The Graficador.
     */
    Graficador graficador;

    /**
     * Instantiates a new Model graficadora.
     *
     * @param presenter the presenter
     */
    public ModelGraficadora(InterfacesGraficadora.Presenter presenter){
        this.presenter = presenter;
        this.graficador = new Graficador();
    }

    @Override
    public LineGraphSeries<DataPoint> calcularCoordenadas(String tipo) {
        try{
            switch (tipo){
                case "seno":
                    return graficador.coordenadasSeno();
                case "coseno":
                    return  graficador.coordenadasCoseno();
            }
            return null;
        }catch (Exception ex){
            return null;
        }
    }
}
