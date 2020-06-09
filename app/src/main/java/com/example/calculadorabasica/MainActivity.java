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

    /**
     * The Txt memoria.
     */
    TextView txtMemoria;
    TextView txtOperacion;
    /**
     * The Txt resultado.
     */
    TextView txtResultado;
    /**
     * The Btn mc.
     */
    Button btnMc;
    /**
     * The Btn mmas.
     */
    Button btnMmas;
    /**
     * The Btn mmenos.
     */
    Button btnMmenos;
    /**
     * The Btn mr.
     */
    Button btnMr;
    /**
     * The Btn cuadrado.
     */
    Button btnCuadrado;
    /**
     * The Btn cubo.
     */
    Button btnCubo;
    /**
     * The Btn potencia.
     */
    Button btnPotencia;
    /**
     * The Btn fact.
     */
    Button btnFact;

    Button btnMod;
    /**
     * The Btn parentesis a.
     */
    Button btnParentesisA;
    /**
     * The Btn parentesis c.
     */
    Button btnParentesisC;
    /**
     * The Btn c.
     */
    Button btnC;
    /**
     * The Btn del.
     */
    Button btnDel;
    /**
     * The Btn 0.
     */
    Button btn0;
    /**
     * The Btn 1.
     */
    Button btn1;
    /**
     * The Btn 2.
     */
    Button btn2;
    /**
     * The Btn 3.
     */
    Button btn3;
    /**
     * The Btn 4.
     */
    Button btn4;
    /**
     * The Btn 5.
     */
    Button btn5;
    /**
     * The Btn 6.
     */
    Button btn6;
    /**
     * The Btn 7.
     */
    Button btn7;
    /**
     * The Btn 8.
     */
    Button btn8;
    /**
     * The Btn 9.
     */
    Button btn9;
    /**
     * The Btn punto.
     */
    Button btnPunto;
    /**
     * The Btn igual.
     */
    Button btnIgual;
    /**
     * The Btn resta.
     */
    Button btnResta;
    /**
     * The Btn suma.
     */
    Button btnSuma;
    /**
     * The Btn multiplica.
     */
    Button btnMultiplica;
    /**
     * The Btn division.
     */
    Button btnDivision;
    /**
     * The Operacion.
     */
    String operacion = "";

    /**
     * The Presenter.
     */
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
        switch (v.getId()) {
            case R.id.btnMc:
                presenter.limpiarMemoria();
                break;
            case R.id.btnMmas:
                presenter.sumarMemoria(txtResultado.getText().toString());
                break;
            case R.id.btnMmenos:
                presenter.restarMemoria(txtResultado.getText().toString());
                break;
            case R.id.btnMr:
                presenter.recuperarMemoria();
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
            case R.id.btnMod:
                operacion += "%";
                break;
            case R.id.btnFact:
                presenter.factorial(txtOperacion.getText().toString());
                break;
            case R.id.btnParentesisA:
                operacion += "(";
                break;
            case R.id.btnParentesisC:
                operacion += ")";
                break;
            case R.id.btnC:
                operacion = "";
                txtResultado.setText("0");
                break;
            case R.id.btnDel:
                if(!operacion.isEmpty()) {
                    operacion = operacion.substring(0, operacion.length() - 1);
                }
                break;
            case R.id.btnResta:
                operacion += "-";
                break;
            case R.id.btnSuma:
                operacion += "+";
                break;
            case R.id.btnMultiplica:
                operacion += "*";
                break;
            case R.id.btnDivision:
                operacion += "/";
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
        txtOperacion.setText(operacion);
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
        btnMod = findViewById(R.id.btnMod);
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
        btnMod.setOnClickListener(this);
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
        txtResultado.setText(result);
    }

    @Override
    public void showMemoria(String result) {
        txtMemoria.setText(result);
    }
    @Override
    public void showOperaciones(String result) {
        txtMemoria.setText(result);

    }
}