package com.example.calculadorabasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calculadorabasica.Interfaces.InterfacesMainActivity;
import com.example.calculadorabasica.Presenter.PresenterMainActivity;

/**
 * Clase encargada de manejear los elementos de la vista
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener, InterfacesMainActivity.View {
    //Atributos
    TextView txtMemoria;
    TextView txtOperacion;
    TextView txtResultado;
    Button btnMc;
    Button btnMmas;
    Button btnMmenos;
    Button btnMr;
    Button btnCuadrado;
    Button btnCubo;
    Button btnPotencia;
    Button btnFact;
    Button btnParentesisA;
    Button btnParentesisC;
    Button btnC;
    Button btnDel;
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnPunto;
    Button btnIgual;
    Button btnResta;
    Button btnSuma;
    Button btnMultiplica;
    Button btnDivision;

    InterfacesMainActivity.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.findElement();
        presenter = new PresenterMainActivity(this);
    }

    /**
     * Función que asigna el evento click a los botones
     *
     * @param v Vista de la app
     */
    @Override
    public void onClick(View v) {
        String operacion = "";
        switch (v.getId()) {
            case R.id.btnMc:
                break;
            case R.id.btnMmas:
                break;
            case R.id.btnMmenos:
                break;
            case R.id.btnMr:
                break;
            case R.id.btnCuadrado:
                operacion += "^2";
                break;
            case R.id.btnCubo:
                operacion += "^3";
                break;
            case R.id.btnPotencia:
                operacion += "^";
                break;
            case R.id.btnFact:
                presenter.factorial(operacion);
                break;
            case R.id.btnParentesisA:
                operacion += "(";
                break;
            case R.id.btnParentesisC:
                operacion += ")";
                break;
            case R.id.btnC:
                if(!operacion.isEmpty()) {
                    operacion += operacion.substring(0, operacion.length() - 1);
                }
                break;
            case R.id.btnDel:
                operacion = "";
                break;
            case R.id.btnResta:
                operacion += "-";
                break;
            case R.id.btnSuma:
                operacion += "+";
                break;
            case R.id.btnMultiplica:
                operacion += "x";
                break;
            case R.id.btnDivision:
                operacion += "÷";
                break;
            case R.id.btnIgual:
                presenter.calcular(operacion);
                break;
            case R.id.btnPunto:
                operacion += ".";
                break;
            case R.id.btn0:
                operacion += "0";
                break;
            case R.id.btn1:
                operacion += "1";
                break;
            case R.id.btn2:
                operacion += "2";
                break;
            case R.id.btn3:
                operacion += "3";
                break;
            case R.id.btn4:
                operacion += "4";
                break;
            case R.id.btn5:
                operacion += "5";
                break;
            case R.id.btn6:
                operacion += "6";
                break;
            case R.id.btn7:
                operacion += "7";
                break;
            case R.id.btn8:
                operacion += "8";
                break;
            case R.id.btn9:
                operacion += "9";
                break;
        }
        txtResultado.setText(operacion);
    }

    /**
     * Función void que asigna a cada elemento del layout su respectiva instancia
     */
    @Override
    public void findElement() {
        txtMemoria = findViewById(R.id.txtMemoria);
        txtOperacion = findViewById(R.id.txtOperacion);
        txtResultado = findViewById(R.id.txtResultado);
        btnMc = findViewById(R.id.btnMc);
        btnMmas = findViewById(R.id.btnMmas);
        btnMmenos = findViewById(R.id.btnMmenos);
        btnMr = findViewById(R.id.btnMr);
        btnCuadrado = findViewById(R.id.btnCuadrado);
        btnCubo = findViewById(R.id.btnCubo);
        btnPotencia = findViewById(R.id.btnPotencia);
        btnFact = findViewById(R.id.btnFact);
        btnParentesisA = findViewById(R.id.btnParentesisA);
        btnParentesisC = findViewById(R.id.btnParentesisC);
        btnC = findViewById(R.id.btnC);
        btnDel = findViewById(R.id.btnDel);
        btnResta = findViewById(R.id.btnResta);
        btnSuma = findViewById(R.id.btnSuma);
        btnMultiplica = findViewById(R.id.btnMultiplica);
        btnDivision = findViewById(R.id.btnDivision);
        btnIgual = findViewById(R.id.btnIgual);
        btnPunto = findViewById(R.id.btnPunto);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnMc.setOnClickListener(this);
        btnMmas.setOnClickListener(this);
        btnMmenos.setOnClickListener(this);
        btnMr.setOnClickListener(this);
        btnCuadrado.setOnClickListener(this);
        btnCubo.setOnClickListener(this);
        btnPotencia.setOnClickListener(this);
        btnFact.setOnClickListener(this);
        btnParentesisA.setOnClickListener(this);
        btnParentesisC.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnResta.setOnClickListener(this);
        btnSuma.setOnClickListener(this);
        btnMultiplica.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnIgual.setOnClickListener(this);
        btnPunto.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
    }

    @Override
    public void showResult(String result) {
    }

    @Override
    public void showMemory(String result) {
    }
}