package com.example.calculadorabasica.Interfaces;

import com.example.calculadorabasica.Clases.Numero;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.List;

public interface InterfacesGraficadora {

    interface View{
        void findElement();
        void mostrarGrafica(LineGraphSeries<DataPoint> coordenadas);
    }

    interface Presenter{
        void solicitarGrafica(String funcion);
        void enviarCoordenadas(LineGraphSeries<DataPoint> coordenadas);
    }

    interface Model{
        LineGraphSeries<DataPoint> calcularCoordenadas(String funcion);
    }
}
