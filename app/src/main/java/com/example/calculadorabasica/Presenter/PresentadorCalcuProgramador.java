package com.example.calculadorabasica.Presenter;

import com.example.calculadorabasica.Interfaces.InterfacesCalcuProgramador;
import com.example.calculadorabasica.Model.ModelCalcuProgramador;

import java.util.List;

public class PresentadorCalcuProgramador implements InterfacesCalcuProgramador.Presenter {

    InterfacesCalcuProgramador.Model model;
    InterfacesCalcuProgramador.View view;

    public PresentadorCalcuProgramador(InterfacesCalcuProgramador.View view){
        this.model = new ModelCalcuProgramador(this);
        this.view = view;
    }

    @Override
    public void calcular(String dato, String identificador) {
        enviarResultados(model.calcular(dato, identificador));
    }

    @Override
    public void enviarResultados(List<String> resultados) {
        view.mostrarResultados(resultados);
    }
}
