package com.example.calculadorabasica.Interfaces;

import java.util.List;

public interface InterfacesCalcuProgramador {

    interface View{
        void findElement();
        void mostrarResultados(List<String> resultados);
    }

    interface Presenter{
        void calcular(String dato);
        void enviarResultados(List<String> resultados);
    }

    interface Model{
        List<String> calcular(String dato);
    }
}
