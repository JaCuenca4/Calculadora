package com.example.calculadorabasica.Presenter;

import com.example.calculadorabasica.Interfaces.InterfacesMainActivity;
import com.example.calculadorabasica.MainActivity;
import com.example.calculadorabasica.Model.ModelMainActivity;

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

    /**
     * Funcion encaragda de solicitar la suma al modelo
     * @param numero1 numero entero
     * @param numero2 numero entero
     */
    @Override
    public void operacion_sumar(int numero1, int numero2) {
        this.model.sumar(numero1, numero2);
    }

    /**
     * Funcion encaragda de solicitar la resta al modelo
     * @param numero1 numero entero
     * @param numero2 numero entero
     */
    @Override
    public void operacion_restar(int numero1, int numero2) {
        this.model.restar(numero1, numero2);
    }

    /**
     * Funcion encaragda de solicitar la multiplicacion al modelo
     * @param numero1 numero entero
     * @param numero2 numero entero
     */
    @Override
    public void operacion_multiplicar(int numero1, int numero2) {
        this.model.multiplicar(numero1, numero2);
    }

    /**
     * Funcion encargada de solcitar la division al modelo
     * @param numero1 numero entero
     * @param numero2 numero entero
     */
    @Override
    public void operacion_dividir(int numero1, int numero2) {
        this.model.dividir(numero1, numero2);
    }

    /**
     * Funcion encargada de enviar el resultado al View
     * @param numero numero flotante
     */
    @Override
    public void enviar_resultado(float numero) {
        this.view.showResult(String.valueOf(numero));
    }

}
