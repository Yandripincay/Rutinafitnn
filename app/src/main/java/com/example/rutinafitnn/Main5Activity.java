package com.example.rutinafitnn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void Siguiente(View view) {
        Intent siguientE = new Intent(Main5Activity.this, Biceps_ejercicios.class);
        startActivity(siguientE);
    }
    public void Triceps(View view) {
        Intent siguientE = new Intent(Main5Activity.this, Main6Activity.class);
        startActivity(siguientE);
    }
    public void Abdomen(View view) {
        Intent siguientE = new Intent(Main5Activity.this, Main14Activity.class);
        startActivity(siguientE);
    }
    public void Pecho(View view) {
        Intent siguientE = new Intent(Main5Activity.this, Main15Activity.class);
        startActivity(siguientE);
    }
    public void Espalda(View view) {
        Intent siguientE = new Intent(Main5Activity.this, Main16Activity.class);
        startActivity(siguientE);
    }
}
