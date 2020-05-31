package com.example.calculadorabasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String calcular(float num1, float num2, char operacion){
        switch (operacion){
            case '+': return String.valueOf(num1+num2);
            case '-': return String.valueOf(num1-num2);
            case '*': return String.valueOf(num1*num2);
            case '/': return String.valueOf(num1/num2);
            default: return null;
        }
    }
}