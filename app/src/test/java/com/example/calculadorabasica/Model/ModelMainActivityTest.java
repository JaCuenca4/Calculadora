package com.example.calculadorabasica.Model;

import com.example.calculadorabasica.Interfaces.InterfacesMainActivity;
import com.example.calculadorabasica.MainActivity;
import com.example.calculadorabasica.Presenter.PresenterMainActivity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModelMainActivityTest {

    private ModelMainActivity model;
    @Before
    public void setup(){
        model = new ModelMainActivity();
    }

    @Test
    public void sumar() {
        assertEquals(8.0 ,model.sumart(4,4),0.0);
    }

    @Test
    public void restar() {
        assertEquals(2,model.restart(6,4),0.0);
    }

    @Test
    public void multiplicar() {
        assertEquals(4,model.multiplicart(2,2),0.0);
    }

    @Test
    public void dividir() {
        assertEquals(2,model.dividirt(4,2),0.0);
    }
}