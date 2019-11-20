package com.example.rutinafitnn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Biceps_ejercicios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps_ejercicios);
    }
    public void Siguiente(View view) {
        Intent suiguiente = new Intent(this, Main7Activity.class);
        startActivity(suiguiente);
    }
    public void Anterior(View view) {
        Intent suiguientss = new Intent(this, Main8Activity.class);
        startActivity(suiguientss);
    }
    public void Siguientes(View view) {
        Intent suiguientes = new Intent(this, Main9Activity.class);
        startActivity(suiguientes);
    }
    public void Piemancuerna(View view) {
        Intent suiguientes = new Intent(this, Pie_mancuerna.class);
        startActivity(suiguientes);
    }
    public void Apoyomusculo(View view) {
        Intent suiguientes = new Intent(this, Main10Activity.class);
        startActivity(suiguientes);
    }
    public void Martillo(View view) {
        Intent suiguientes = new Intent(this, Main11Activity.class);
        startActivity(suiguientes);
    }
    public void Poleaalta(View view) {
        Intent suiguientes = new Intent(this, Main12Activity.class);
        startActivity(suiguientes);
    }

}
