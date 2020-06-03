package com.example.calculadorabasica.Model;

import com.example.calculadorabasica.Interfaces.InterfacesMainActivity;
import com.example.calculadorabasica.Presenter.PresenterMainActivity;

/**
 * Clase destinada para la funcionalidad de la app
 */
public class ModelMainActivity implements InterfacesMainActivity.Model {
    InterfacesMainActivity.Presenter presenter;
    public ModelMainActivity(InterfacesMainActivity.Presenter presenter) {
        this.presenter=presenter;
    }

    public ModelMainActivity(){}

    /**
     * Función que retorna el resultado de la resta de dos numeros
     * @param numero1 es un int
     * @param numero2 es un int
     * @return un numero float
     */
    public float restart(int numero1, int numero2) {
        return (float)(numero1 - numero2);
    }

    /**
     * Función que retorna el resultado de la suma de dos numeros
     * @param numero1 es un int
     * @param numero2 es un int
     * @return un numero float
     */
    public float sumart(int numero1, int numero2) {
        return (float)(numero1 + numero2);
    }

    /**
     * Función que retorna el resultado de la multiplicación de dos numeros
     * @param numero1 es un int
     * @param numero2 es un int
     * @return un numero float
     */
    public float multiplicart(int numero1, int numero2) {
        return (float)(numero1 * numero2);
    }

    /**
     * Función que retorna el resultado de la división de dos numeros
     * @param numero1 es un int
     * @param numero2 es un int
     * @return un numero float
     */
    public float dividirt(int numero1, int numero2) {
        return (float) (numero1 / numero2);
    }

    /**
     * Funcion encargada de enviar el resultado de la suma
     * @param numero1 numero int
     * @param numero2 numero int
     */
    @Override
    public void sumar(int numero1, int numero2) {
        this.presenter.enviar_resultado(sumart(numero1, numero2));
    }

    /**
     * Funcion encargada de enviar el resultado de la resta
     * @param numero1 numero int
     * @param numero2 numero int
     */
    @Override
    public void restar(int numero1, int numero2) {
        this.presenter.enviar_resultado(restart(numero1, numero2));
    }

    /**
     * Funcion encargada de enviar el resultado de la multiplicar
     * @param numero1 numero int
     * @param numero2 numero int
     */
    @Override
    public void multiplicar(int numero1, int numero2) {
        this.presenter.enviar_resultado(multiplicart(numero1 , numero2));
    }

    /**
     * Funcion encargada de enviar el resultado de la division
     * @param numero1 numero int
     * @param numero2 numero int
     */
    @Override
    public void dividir(int numero1, int numero2) {
        this.presenter.enviar_resultado(dividirt(numero1,numero2));
    }
}
