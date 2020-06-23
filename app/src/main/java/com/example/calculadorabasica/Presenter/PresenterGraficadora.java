package com.example.calculadorabasica.Presenter;

import com.example.calculadorabasica.Clases.Numero;
import com.example.calculadorabasica.Interfaces.InterfacesGraficadora;
import com.example.calculadorabasica.Model.ModelGraficadora;

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
    public void enviarCoordenadas(List<List<Numero>> coordenadas) {
        view.mostrarGrafica(coordenadas);
    }
}
