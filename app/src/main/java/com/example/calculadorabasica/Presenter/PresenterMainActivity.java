package com.example.calculadorabasica.Presenter;

import com.example.calculadorabasica.Interfaces.InterfacesMainActivity;
import com.example.calculadorabasica.Model.ModelMainActivity;

/**
 * Clase que opera de intermediario entre el modelo y la vista
 */
public class PresenterMainActivity implements InterfacesMainActivity.Presenter {
    /**
     * The View.
     */
    InterfacesMainActivity.View view;
    /**
     * The Model.
     */
    InterfacesMainActivity.Model model;

    /**
     * Constructor
     *
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
    public void limpiarMemoria() {
        model.limpiarMemoria();
    }

    @Override
    public void sumarMemoria(String num) {
        model.sumarMemoria(num);
    }

    @Override
    public void restarMemoria(String num){
        model.restarMemoria(num);
    }

    @Override
    public void recuperarMemoria() {
        model.recuperarMemoria();
    }

    @Override
    public void enviarResultado(String result) {
        view.showResult(result);
    }

    @Override
    public void enviarResultadoMemoria(String result) {
        view.showMemoria(result);
    }
    @Override
    public void enviarResultadoOperaciones(String result) {
        view.showOperaciones(result);
    }
}
