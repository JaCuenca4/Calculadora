package com.example.calculadorabasica.Model;

import com.example.calculadorabasica.Clases.Numero;
import com.example.calculadorabasica.Clases.Operacion;
import com.example.calculadorabasica.Interfaces.InterfacesMainActivity;

/**
 * Clase destinada para la funcionalidad de la app
 */
public class ModelMainActivity implements InterfacesMainActivity.Model {

    Numero memoria = new Numero();
    Numero resultado = new Numero();
    Operacion operador = new Operacion();


    InterfacesMainActivity.Presenter presenter;

    public ModelMainActivity(InterfacesMainActivity.Presenter presenter) {
        this.presenter = presenter;
    }

    public ModelMainActivity() {
    }

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

    @Override
    public void enviarResultado() {
        presenter.enviarResultado(String.valueOf(resultado.getNumero()));
        resultado = new Numero();
    }

    @Override
    public void mostrarMemoria() {
        presenter.enviarResultado(String.valueOf(memoria.getNumero()));
    }
}
