package com.example.calculadorabasica.Model;

import com.example.calculadorabasica.Interfaces.InterfacesMainActivity;
import com.example.calculadorabasica.Presenter.PresenterMainActivity;

public class ModelMainActivity implements InterfacesMainActivity.Model {
    InterfacesMainActivity.Presenter presenter;
    public ModelMainActivity(InterfacesMainActivity.Presenter presenter) {
        this.presenter=presenter;
    }

    @Override
    public void sumar(int numero1, int numero2) {
        this.presenter.enviar_resultado(numero1 + numero2);
    }

    @Override
    public void restar(int numero1, int numero2) {
        this.presenter.enviar_resultado(numero1 - numero2);
    }

    @Override
    public void multiplicar(int numero1, int numero2) {
        this.presenter.enviar_resultado(numero1 * numero2);
    }

    @Override
    public void dividir(int numero1, int numero2) {
        this.presenter.enviar_resultado(numero1 / numero2);
    }
}
