package com.example.rutinafitnn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void Siguiente(View view) {
        Intent siguiente = new Intent(this, Main5Activity.class);
        startActivity(siguiente);
    }
    public void Anterior(View view) {
        Intent siguient = new Intent(this, Main6Activity.class);
        startActivity(siguient);
    }
}
