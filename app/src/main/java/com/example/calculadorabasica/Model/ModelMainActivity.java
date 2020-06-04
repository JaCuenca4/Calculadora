package com.example.calculadorabasica.Model;

import com.example.calculadorabasica.Interfaces.InterfacesMainActivity;

/**
 * Clase destinada para la funcionalidad de la app
 */
public class ModelMainActivity implements InterfacesMainActivity.Model {

    float memoria = 0.0f;

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
    public float mRestar(float numero1, float numero2) {
        return (numero1 - numero2);
    }

    /**
     * Función que retorna el resultado de la suma de dos numeros
     * @param numero1 es un int
     * @param numero2 es un int
     * @return un numero float
     */
    public float mSumar(float numero1, float numero2) {
        return (numero1 + numero2);
    }

    /**
     * Función que retorna el resultado de la multiplicación de dos numeros
     * @param numero1 es un int
     * @param numero2 es un int
     * @return un numero float
     */
    public float mMultiplicar(float numero1, float numero2) {
        return (numero1 * numero2);
    }

    /**
     * Función que retorna el resultado de la división de dos numeros
     * @param numero1 es un int
     * @param numero2 es un int
     * @return un numero float
     */
    public float mDividir(float numero1, float numero2) {
        return (numero1 / numero2);
    }

    /**
     * Funcion encargada de enviar el resultado de la suma
     * @param numero1 numero int
     * @param numero2 numero int
     */
    @Override
    public void sumar(float numero1, float numero2) {
        try{
            String result = String.valueOf(mSumar(numero1, numero2));
            this.presenter.enviarResultado(result);
        }catch (Exception e){
            this.presenter.enviarResultado("Error de Sintaxis");
        }

    }

    /**
     * Funcion encargada de enviar el resultado de la resta
     * @param numero1 numero int
     * @param numero2 numero int
     */
    @Override
    public void restar(float numero1, float numero2) {
        try {
            String result = String.valueOf(mRestar(numero1, numero2));
            this.presenter.enviarResultado(result);
        }catch (Exception e){
            this.presenter.enviarResultado("Error de Sintaxis");
        }

    }

    /**
     * Funcion encargada de enviar el resultado de la multiplicar
     * @param numero1 numero int
     * @param numero2 numero int
     */
    @Override
    public void multiplicar(float numero1, float numero2) {
        try{
            String result = String.valueOf(mMultiplicar(numero1 , numero2));
            this.presenter.enviarResultado(result);
        }catch(Exception e){
            this.presenter.enviarResultado("Error de Sintaxis");
        }

    }

    /**
     * Funcion encargada de enviar el resultado de la division
     * @param numero1 numero int
     * @param numero2 numero int
     */
    @Override
    public void dividir(float numero1, float numero2) {
        try{
            if (numero2==0){
                this.presenter.enviarResultado("No se puede dividir para 0");
            }else{
                String result = String.valueOf(mDividir(numero1,numero2));
                this.presenter.enviarResultado(result);
            }
        }catch (Exception e){
            this.presenter.enviarResultado("Error de Sintaxis");
        }

    }

    /**
     * Funcion para guardar un numero en memoria
     * @param num numero que se va a guardar
     */
    @Override
    public void guardarMemoria(String num) {
        try{
            memoria = Float.parseFloat(num);
            this.presenter.enviarResultado("Guardado en memoria");
        }catch (Exception e){
            this.presenter.enviarResultado("Error al guardar en memoria");
        }
    }

    /**
     * Funcion para limpiar la memoria
     */
    @Override
    public void borrarMemoria() {
        try{
            memoria = 0.0f;
            this.presenter.enviarResultado("Memoria borrada");
        }catch (Exception e){
            this.presenter.enviarResultado("Error al limpiar memoria");
        }
    }
}
