package com.example.calculadorabasica.Clases;


import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;
import java.util.List;

public class Graficador {

    public Graficador(){}

    public LineGraphSeries<DataPoint> coordenadasSeno(){
        LineGraphSeries<DataPoint> coordenadas = new LineGraphSeries<>();
        double y,x;
        x = -0.1;
        for(int i = 0; i< 200 ;i++){
            x += 0.1;
            y = Math.sin(x);
            coordenadas.appendData(new DataPoint(x,y), true,200);
        }
        return  coordenadas;
    }

    public LineGraphSeries<DataPoint> coordenadasCoseno(){
        LineGraphSeries<DataPoint> coordenadas = new LineGraphSeries<>();
        double y,x;
        x = -0.1;
        for(int i = 0; i< 200 ;i++){
            x += 0.1;
            y = Math.cos(x);
            coordenadas.appendData(new DataPoint(x,y), true,200);
        }
        return  coordenadas;
    }
}
