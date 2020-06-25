package com.example.calculadorabasica.Presenter;

import com.example.calculadorabasica.Interfaces.InterfacesCalcuProgramador;
import com.example.calculadorabasica.Model.ModelCalcuProgramador;

import java.util.List;

/**
 * The type Presentador calcu programador.
 */
public class PresentadorCalcuProgramador implements InterfacesCalcuProgramador.Presenter {

    /**
     * The Model.
     */
    InterfacesCalcuProgramador.Model model;
    /**
     * The View.
     */
    InterfacesCalcuProgramador.View view;

    /**
     * Instantiates a new Presentador calcu programador.
     *
     * @param view the view
     */
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
