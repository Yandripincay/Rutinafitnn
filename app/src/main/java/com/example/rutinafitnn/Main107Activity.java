package com.example.rutinafitnn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.rutinafitnn.biceps.Main10Activity;
import com.example.rutinafitnn.biceps.Main11Activity;
import com.example.rutinafitnn.biceps.Main12Activity;

public class Main107Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main107);
    }
    public void Siguiente(View view) {
        Intent siguientE = new Intent(Main107Activity.this, Main108Activity.class);
        startActivity(siguientE);
    }
    public void Triceps(View view) {
        Intent siguientE = new Intent(Main107Activity.this, Main10Activity.class);
        startActivity(siguientE);
    }
    public void Abdomen(View view) {
        Intent siguientE = new Intent(Main107Activity.this, Main10Activity.class);
        startActivity(siguientE);
    }
    public void Pecho(View view) {
        Intent siguientE = new Intent(Main107Activity.this, Main11Activity.class);
        startActivity(siguientE);
    }
    public void Espalda(View view) {
        Intent siguientE = new Intent(Main107Activity.this, Main12Activity.class);
        startActivity(siguientE);
    }
    public void Hombro (View view) {
        Intent siguientE = new Intent(Main107Activity.this, Main13Activity.class);
        startActivity(siguientE);
    }
    public void Gluteos(View view) {
        Intent siguientE = new Intent(Main107Activity.this, Main14Activity.class);
        startActivity(siguientE);
    }
    public void Piernadelantera(View view) {
        Intent siguientE = new Intent(Main107Activity.this, Main15Activity.class);
        startActivity(siguientE);
    }
    public void Antebrazo(View view) {
        Intent siguientE = new Intent(Main107Activity.this, Main16Activity.class);
        startActivity(siguientE);
    }
}

