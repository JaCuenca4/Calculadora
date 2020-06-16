package com.example.calculadorabasica.Model;

import com.example.calculadorabasica.Clases.Conversion;
import com.example.calculadorabasica.Interfaces.InterfacesCalcuProgramador;

import java.util.List;

public class ModelCalcuProgramador implements InterfacesCalcuProgramador.Model {

    Conversion convertidor = new Conversion();

    InterfacesCalcuProgramador.Presenter presenter;

    public ModelCalcuProgramador(InterfacesCalcuProgramador.Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public List<String> calcular(String dato, String identificador) {
        return convertidor.convertir(dato,identificador);
    }
}
