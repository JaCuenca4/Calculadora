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
    EditText txtNumero1, txtNumero2;
    Button btnSuma, btnResta,btnMultiplicacion,btnDivision;
    Button btnM, btnMmas,btnMmenos, btnMS;
    TextView lblResul;
    InterfacesMainActivity.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.findElement();
        presenter =new PresenterMainActivity(this);
    }

    /**
     * Función que asigna el evento click a los botones
     * @param v Vista de la app
     */
    @Override
    public void onClick(View v) {
        String number_a= txtNumero1.getText().toString(), number_b=txtNumero2.getText().toString();
        if (stepsValidation(number_a) & stepsValidation(number_b)){
            Float first_number = parseNumber(number_a);
            Float second_number = parseNumber(number_b);
            switch (v.getId()) {
                case R.id.btnSumar:
                    presenter.operacionSumar(first_number, second_number);
                    break;
                case R.id.btnRestar:
                    presenter.operacionRestar(first_number, second_number);
                    break;
                case R.id.btnMultiplicar:
                    presenter.operacionMultiplicar(first_number, second_number);
                    break;
                case R.id.btnDividir:
                    presenter.operacionDividir(first_number, second_number);
                    break;
                case R.id.btnM:
                    presenter.guardarMemoria(lblResul.getText().toString());
                    break;
                case R.id.btnMmas:
                case R.id.btnMmenos:
                case R.id.btnMS:
                    presenter.borrarMemoria();
                    break;
                case R.id.lblResultado:
                    String label_result = lblResul.getText().toString();
                    txtNumero1.setText(label_result);
                    break;
                }
        }else{
                Toast.makeText(getApplicationContext(),R.string.registrar_numero, Toast.LENGTH_LONG).show();
        }
    }

    private boolean stepsValidation(String number){
        return !number.equals("");
    }
    private Float parseNumber(String number){
        return Float.parseFloat(number);
    }

    /**
     * Función void que asigna a cada elemento del layout su respectiva instancia
     */
    @Override
    public void findElement() {
        txtNumero1=findViewById(R.id.txtNum1);
        txtNumero2=findViewById(R.id.txtNum2);
        lblResul= findViewById(R.id.lblResultado);
        lblResul.setOnClickListener(this);
        btnSuma=findViewById(R.id.btnSumar);
        btnSuma.setOnClickListener(this);
        btnResta=findViewById(R.id.btnRestar);
        btnResta.setOnClickListener(this);
        btnMultiplicacion=findViewById(R.id.btnMultiplicar);
        btnMultiplicacion.setOnClickListener(this);
        btnDivision=findViewById(R.id.btnDividir);
        btnDivision.setOnClickListener(this);
        btnM= findViewById(R.id.btnM);
        btnM.setOnClickListener(this);
        btnMmas = findViewById(R.id.btnMmas);
        btnMmas.setOnClickListener(this);
        btnMmenos = findViewById(R.id.btnMmenos);
        btnMmenos.setOnClickListener(this);
        btnMS = findViewById(R.id.btnMS);
        btnMS.setOnClickListener(this);
    }

    @Override
    public void showResult(String result) {
        lblResul.setText(result);
    }
}