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

    /**
     * Funcion encargada de solicitar la suma al modelo
     * @param numero1 numero flotante
     * @param numero2 numero flotante
     */
    @Override
    public void operacionSumar(float numero1, float numero2) {
        this.model.sumar(numero1, numero2);
    }

    /**
     * Funcion encargada de solicitar la resta al modelo
     * @param numero1 numero flotante
     * @param numero2 numero flotante
     */
    @Override
    public void operacionRestar(float numero1, float numero2) {
        this.model.restar(numero1, numero2);
    }

    /**
     * Funcion encargada de solicitar la multiplicacion al modelo
     * @param numero1 numero flotante
     * @param numero2 numero flotante
     */
    @Override
    public void operacionMultiplicar(float numero1, float numero2) {
        this.model.multiplicar(numero1, numero2);
    }

    /**
     * Funcion encargada de solcitar la division al modelo
     * @param numero1 numero flotante
     * @param numero2 numero flotante
     */
    @Override
    public void operacionDividir(float numero1, float numero2) {
        this.model.dividir(numero1, numero2);
    }
    /**
     * Funcion encargada de guardar en memoria
     * @param numero String
     */
    @Override
    public void guardarMemoria(String numero) {
        model.guardarMemoria(numero);
    }
    /**
     * Funcion encargada de mostrar el numero en memoria
     */
    @Override
    public void mostrarMemoria() {
        model.mostrarMemoria();
    }
    /**
     * Funcion encargada de sumar numeros en memoria
     * @param numero String
     */
    @Override
    public void operacionSumarMemoria(String numero) {
        model.sumarMemoria(numero);
    }
    /**
     * Funcion encargada de restar numeros en memoria
     * @param numero String
     */
    @Override
    public void operacionRestarMemoria(String numero) {
        model.restarMemoria(numero);
    }
    /**
     * Funcion encargada de enviar el resultado al View
     * @param result String
     */
    @Override
    public void enviarResultado(String result) {
        this.view.showResult(result);
    }

    /**
     * Funcion encargada de enviar el resultado de memoria al View
     * @param result String
     */
    @Override
    public void enviarResultadoMemoria(String result) {
        this.view.showResultMemory(result);
    }
}
