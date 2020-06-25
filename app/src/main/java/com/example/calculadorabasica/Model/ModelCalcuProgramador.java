package com.example.calculadorabasica.Model;

import com.example.calculadorabasica.Clases.Conversion;
import com.example.calculadorabasica.Interfaces.InterfacesCalcuProgramador;

import java.util.List;

/**
 * The type Model calcu programador.
 */
public class ModelCalcuProgramador implements InterfacesCalcuProgramador.Model {

    /**
     * The Convertidor.
     */
    Conversion convertidor = new Conversion();

    /**
     * The Presenter.
     */
    InterfacesCalcuProgramador.Presenter presenter;

    /**
     * Instantiates a new Model calcu programador.
     *
     * @param presenter the presenter
     */
    public ModelCalcuProgramador(InterfacesCalcuProgramador.Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public List<String> calcular(String dato, String identificador) {
        return convertidor.convertir(dato,identificador);
    }
}
