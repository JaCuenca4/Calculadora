package com.example.calculadorabasica.Model;

import com.example.calculadorabasica.Clases.Numero;
import com.example.calculadorabasica.Clases.Operacion;
import com.example.calculadorabasica.Interfaces.InterfacesMainActivity;

/**
 * Clase destinada para la funcionalidad de la app
 */
public class ModelMainActivity implements InterfacesMainActivity.Model {

    /**
     * The Memoria.
     */
    Numero memoria = new Numero();
    /**
     * The Resultado.
     */
    Numero resultado = new Numero();
    /**
     * The Operador.
     */
    Operacion operador = new Operacion();
    /**
     * The Memoria a.
     */
    float memoriaA = 0.0f;


    /**
     * The Presenter.
     */
    InterfacesMainActivity.Presenter presenter;

    /**
     * Instantiates a new Model main activity.
     *
     * @param presenter the presenter
     */
    public ModelMainActivity(InterfacesMainActivity.Presenter presenter) {
        this.presenter = presenter;
    }

    /**
     * Instantiates a new Model main activity.
     */
    public ModelMainActivity() {
    }
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
     * Función que calcula los resultados
     * @param operacion es un String
     */
    @Override
    public void calcular(String operacion) {
        this.resultado = operador.calcularOperacion(operacion);
        System.out.println("operacion = " + operacion);
        System.out.println("resultado = " + resultado.getNumero());
        enviarResultado();
    }

    @Override
    public void factorial(String operacion) {
        this.resultado = operador.calFactorial(operacion);
        enviarResultado();
    }
    /**
     * Función que envía el resultado
     */
    @Override
    public void enviarResultado() {
        presenter.enviarResultado(String.valueOf(resultado.getNumero()));
        resultado = new Numero();
    }
    /**
     * Función que calcula el factorial
     * @param numero es un numero tipo double
     */
    public double mfactorial(double numero){

        if(numero==0){
            return 1;
        }else {
            return numero * mfactorial(numero-1);
        }
    }
    /**
     * Función que calcula el exponencial
     * @param numero es un numero entero
     * @param exponente es un numero entero
     */
    public int mExponente(int numero, int exponente){
        int acumulador=1;
        if(exponente==0){
            return 1;
        }else{
            while(exponente>=1){
                acumulador*=numero;
                exponente--;
            }

            return acumulador;
        }

    }
    public double mresiduo(double num1,double num2) {
        double residuo = num1%num2;
        if (residuo > 0 &&num1 < 0)
        {
            residuo -= num2;
        }else if(residuo < 0){
            residuo=residuo;
        }
        return residuo;

    }

    /**
     * Funcion para recuperar de la memoria
     */
    @Override
    public void recuperarMemoria() {
        try{
            this.presenter.enviarResultadoOperaciones(String.valueOf(memoriaA));
        }catch (Exception e){
            this.presenter.enviarResultadoOperaciones("Error al recuperar memoria");
        }
    }
    /**
     * Funcion para sumar un numero a la memoria
     * @param num numero que se va a sumar
     */
    @Override
    public void sumarMemoria(String num) {
        try{
            memoriaA += Float.parseFloat(num);
            this.presenter.enviarResultadoMemoria(String.valueOf(memoriaA));
        }catch (Exception e){
            this.presenter.enviarResultadoMemoria("Error al sumar en memoria");
        }
    }
    /**
     * Funcion para limpiar a la memoria
     */
    @Override
    public void limpiarMemoria() {
        try{
            memoriaA =0;
            this.presenter.enviarResultadoMemoria(String.valueOf(memoriaA));
        }catch (Exception e){
            this.presenter.enviarResultadoMemoria("Error al sumar en memoria");
        }
    }
    /**
     * Funcion para restar un numero a la memoria
     * @param num numero que se va a restar
     */
    @Override
    public void restarMemoria(String num) {
        try{
            memoriaA -= Float.parseFloat(num);
            this.presenter.enviarResultadoMemoria(String.valueOf(memoriaA));
        }catch (Exception e){
            this.presenter.enviarResultadoMemoria("Error al restar en memoria");
        }
    }

}
