package com.example.calculadorabasica.Presenter;

import com.example.calculadorabasica.Interfaces.InterfacesMainActivity;
import com.example.calculadorabasica.Model.ModelMainActivity;

/**
 * Clase que opera de intermediario entre el modelo y la vista
 */
public class PresenterMainActivity implements InterfacesMainActivity.Presenter {
    InterfacesMainActivity.View view;
    InterfacesMainActivity.Model model;

    /**
     * Constructor
     * @param view Vista
     */
    public PresenterMainActivity(InterfacesMainActivity.View view) {
        this.view=view;
        this.model=new ModelMainActivity(this);
    }

    @Override
    public void calcular(String operacion) {
        model.calcular(operacion);
    }

    @Override
    public void factorial(String operacion) {
        model.factorial(operacion);
    }

    @Override
    public void limparMemoria() {

    }

    @Override
    public void sumarMemoria() {

    }

    @Override
    public void restarMemoria() {

    }

    @Override
    public void recuperarMemoria() {

    }

    @Override
    public void enviarResultado(String result) {
        view.showResult(result);
    }
}
