package com.example.calculadorabasica.Interfaces;

import com.example.calculadorabasica.Clases.Numero;

import java.util.List;

public interface InterfacesGraficadora {

    interface View{
        void findElement();
        void mostrarGrafica(List<List<Numero>> coordenadas);
    }

    interface Presenter{
        void solicitarGrafica(String funcion);
        void enviarCoordenadas(List<List<Numero>> coordenadas);
    }

    interface Model{
        List<List<Numero>> calcularCoordenadas(String funcion);
    }


}
