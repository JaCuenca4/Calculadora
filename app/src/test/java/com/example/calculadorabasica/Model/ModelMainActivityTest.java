package com.example.calculadorabasica.Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Clase creada para realizar las pruebas a cada uno de los metodos que opera la clase modelo
 */
public class ModelMainActivityTest {

    private ModelMainActivity model;
    @Before
    public void setup(){
        model = new ModelMainActivity();
    }

    @Test
    public void sumar() {
        assertEquals(8.0 ,model.mSumar(4f,4f),0.0);
    }

    @Test
    public void restar() {
        assertEquals(2,model.mRestar(6f,4f),0.0);
    }

    @Test
    public void multiplicar() {
        assertEquals(4,model.mMultiplicar(2f,2f),0.0);
    }

    @Test
    public void dividir() {
        assertEquals(2,model.mDividir(4f,2f),0.0);
    }
}