package com.example.calculadorabasica;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculadorabasica.Interfaces.InterfacesCalcuProgramador;
import com.example.calculadorabasica.Interfaces.InterfacesMainActivity;
import com.example.calculadorabasica.Presenter.PresentadorCalcuProgramador;
import com.example.calculadorabasica.Presenter.PresenterMainActivity;

import java.util.List;

public class CalcuProgramador extends AppCompatActivity implements View.OnClickListener, InterfacesCalcuProgramador.View {

    TextView txtSelec;
    TextView txtInput;
    TextView txtHexa;
    TextView txtDec;
    TextView txtOct;
    TextView txtBin;
    Button btnHex;
    Button btnDec;
    Button btnOct;
    Button btnBin;
    Button btnA;
    Button btnB;
    Button btnC;
    Button btnD;
    Button btnE;
    Button btnF;
    Button btnCR;
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
    Button btnIgual;
    String dato = "";


    InterfacesCalcuProgramador.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu_programador);
        this.findElement();
        presenter = new PresentadorCalcuProgramador(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemEstandar:
                startActivity(new Intent(this, MainActivity.class));
                return true;
            case R.id.itemProgramador:
                return true;
            case R.id.itemGraficadora:
                startActivity(new Intent(this, Graficadora.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnHex:
                dato="";
                txtSelec.setText("HEX");
                btnA.setEnabled(true);
                btnB.setEnabled(true);
                btnC.setEnabled(true);
                btnD.setEnabled(true);
                btnE.setEnabled(true);
                btnF.setEnabled(true);
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);
                btn0.setEnabled(true);
                break;
            case R.id.btnDec:
                dato="";
                txtSelec.setText("DEC");
                btnA.setEnabled(false);
                btnB.setEnabled(false);
                btnC.setEnabled(false);
                btnD.setEnabled(false);
                btnE.setEnabled(false);
                btnF.setEnabled(false);
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);
                break;
            case R.id.btnOct:
                dato="";
                txtSelec.setText("OCT");
                btnA.setEnabled(false);
                btnB.setEnabled(false);
                btnC.setEnabled(false);
                btnD.setEnabled(false);
                btnE.setEnabled(false);
                btnF.setEnabled(false);
                btn8.setEnabled(false);
                btn9.setEnabled(false);
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                break;
            case R.id.btnBin:
                dato="";
                txtSelec.setText("BIN");
                btnA.setEnabled(false);
                btnB.setEnabled(false);
                btnC.setEnabled(false);
                btnD.setEnabled(false);
                btnE.setEnabled(false);
                btnF.setEnabled(false);
                btn0.setEnabled(true);
                btn1.setEnabled(true);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
                btn9.setEnabled(false);
                break;
            case R.id.btnA:
                dato += "A";
                break;
            case R.id.btnB:
                dato += "B";
                break;
            case R.id.btnC:
                dato += "C";
                break;
            case R.id.btnD:
                dato += "D";
                break;
            case R.id.btnE:
                dato += "E";
                break;
            case R.id.btnF:
                dato += "F";
                break;
            case R.id.btnCR:
                dato = "";
                break;
            case R.id.btnDelP:
                if(!dato.isEmpty()) {
                    dato = dato.substring(0, dato.length() - 1);
                }
                break;
            case R.id.btnConvertir:
                presenter.calcular(dato,txtSelec.getText().toString());
                break;
            case R.id.btn0P:
                dato += "0";
                break;
            case R.id.btn1P:
                dato += "1";
                break;
            case R.id.btn2P:
                dato += "2";
                break;
            case R.id.btn3P:
                dato += "3";
                break;
            case R.id.btn4P:
                dato += "4";
                break;
            case R.id.btn5P:
                dato += "5";
                break;
            case R.id.btn6P:
                dato += "6";
                break;
            case R.id.btn7P:
                dato += "7";
                break;
            case R.id.btn8P:
                dato += "8";
                break;
            case R.id.btn9P:
                dato += "9";
                break;
        }
        System.out.println("El dato es  "+dato);
        txtInput.setText(dato);
    }

    @Override
    public void findElement() {
         txtSelec = findViewById(R.id.txtSelec);
         txtInput = findViewById(R.id.txtInput);
         txtHexa = findViewById(R.id.txtHexa);
         txtDec = findViewById(R.id.txtDec);
         txtOct = findViewById(R.id.txtOct);
         txtBin = findViewById(R.id.txtBin);
         btnHex = findViewById(R.id.btnHex);
         btnDec = findViewById(R.id.btnDec);
         btnOct = findViewById(R.id.btnOct);
         btnBin = findViewById(R.id.btnBin);
         btnA = findViewById(R.id.btnA);
         btnB = findViewById(R.id.btnB);
         btnC = findViewById(R.id.btnC);
         btnD = findViewById(R.id.btnD);
         btnE = findViewById(R.id.btnE);
         btnF = findViewById(R.id.btnF);
         btnCR = findViewById(R.id.btnCR);
         btnDel = findViewById(R.id.btnDelP);
         btn0 = findViewById(R.id.btn0P);
         btn1 = findViewById(R.id.btn1P);
         btn2 = findViewById(R.id.btn2P);
         btn3 = findViewById(R.id.btn3P);
         btn4 = findViewById(R.id.btn4P);
         btn5 = findViewById(R.id.btn5P);
         btn6 = findViewById(R.id.btn6P);
         btn7 = findViewById(R.id.btn7P);
         btn8 = findViewById(R.id.btn8P);
         btn9 = findViewById(R.id.btn9P);
         btnIgual = findViewById(R.id.btnConvertir);
         btnHex.setOnClickListener(this);
         btnDec.setOnClickListener(this);
         btnOct.setOnClickListener(this);
         btnBin.setOnClickListener(this);
         btnA.setOnClickListener(this);
         btnB.setOnClickListener(this);
         btnC.setOnClickListener(this);
         btnD.setOnClickListener(this);
         btnE.setOnClickListener(this);
         btnF.setOnClickListener(this);
         btnCR.setOnClickListener(this);
         btnDel.setOnClickListener(this);
         btn0.setOnClickListener(this);
         btn1.setOnClickListener(this);
         btn2.setOnClickListener(this);
         btn3.setOnClickListener(this);
         btn4.setOnClickListener(this);
         btn5.setOnClickListener(this);
         btn6.setOnClickListener(this);
         btn7.setOnClickListener(this);
         btn8.setOnClickListener(this);
         btn9.setOnClickListener(this);
         btnIgual.setOnClickListener(this);
    }

    @Override
    public void mostrarResultados(List<String> resultados) {
        txtHexa.setText(resultados.get(0));
        txtDec.setText(resultados.get(1));
        txtOct.setText(resultados.get(2));
        txtBin.setText(resultados.get(3));
    }
}