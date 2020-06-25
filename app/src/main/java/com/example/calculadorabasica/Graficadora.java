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

import com.example.calculadorabasica.Clases.Numero;
import com.example.calculadorabasica.Interfaces.InterfacesGraficadora;
import com.example.calculadorabasica.Presenter.PresenterGraficadora;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.List;

/**
 * The type Graficadora.
 */
public class Graficadora extends AppCompatActivity implements InterfacesGraficadora.View, View.OnClickListener{

    /**
     * The Seno.
     */
    Button seno;
    /**
     * The Coseno.
     */
    Button coseno;

    /**
     * The Presenter.
     */
    InterfacesGraficadora.Presenter presenter;
    /**
     * The Graph.
     */
    GraphView graph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graficadora);
        findElement();
        presenter = new PresenterGraficadora(this);
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
                startActivity(new Intent(this, CalcuProgramador.class));
                return true;
            case R.id.itemGraficadora:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSenGraf:
                graph.removeAllSeries();
                presenter.solicitarGrafica("seno");
                break;
            case R.id.btnCosGraf:
                graph.removeAllSeries();
                presenter.solicitarGrafica("coseno");
                break;
        }
    }

    @Override
    public void findElement() {
        seno = findViewById(R.id.btnSenGraf);
        coseno = findViewById(R.id.btnCosGraf);
        seno.setOnClickListener(this);
        coseno.setOnClickListener(this);
        graph = findViewById(R.id.grafica);
    }

    @Override
    public void mostrarGrafica(LineGraphSeries<DataPoint> coordenadas) {
        graph.addSeries(coordenadas);
    }

}