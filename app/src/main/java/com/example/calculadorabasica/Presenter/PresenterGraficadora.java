package com.example.calculadorabasica.Presenter;

import com.example.calculadorabasica.Clases.Numero;
import com.example.calculadorabasica.Interfaces.InterfacesGraficadora;
import com.example.calculadorabasica.Model.ModelGraficadora;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.List;

public class PresenterGraficadora implements InterfacesGraficadora.Presenter {

    InterfacesGraficadora.View view;
    InterfacesGraficadora.Model model;

    public PresenterGraficadora(InterfacesGraficadora.View view){
        this.view = view;
        this.model = new ModelGraficadora(this);
    }

    @Override
    public void solicitarGrafica(String funcion) {
        enviarCoordenadas(model.calcularCoordenadas(funcion));
    }

    @Override
    public void enviarCoordenadas(LineGraphSeries<DataPoint> coordenadas) {
        view.mostrarGrafica(coordenadas);
    }
}
