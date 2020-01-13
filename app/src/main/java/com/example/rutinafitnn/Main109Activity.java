package com.example.rutinafitnn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.rutinafitnn.Tabbetabdomen.Main112Activity;
import com.example.rutinafitnn.Tabbetbiceps.Main110Activity;
import com.example.rutinafitnn.Tabbetespalda.Main114Activity;
import com.example.rutinafitnn.Tabbetgluteos.Main115Activity;
import com.example.rutinafitnn.Tabbethombro.Main113Activity;
import com.example.rutinafitnn.Tabbettriceps.Main111Activity;

public class Main109Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main109);
    }
    public void Siguiente(View view) {
        Intent siguientE = new Intent(Main109Activity.this, Main110Activity.class);
        startActivity(siguientE);
    }
    public void Triceps(View view) {
        Intent siguientE = new Intent(Main109Activity.this, Main111Activity.class);
        startActivity(siguientE);
    }
    public void Abdomen(View view) {
        Intent siguientE = new Intent(Main109Activity.this, Main112Activity.class);
        startActivity(siguientE);
    }
    public void Pecho(View view) {
        Intent siguientE = new Intent(Main109Activity.this, Main108Activity.class);
        startActivity(siguientE);
    }
    public void Espalda(View view) {
        Intent siguientE = new Intent(Main109Activity.this, Main114Activity.class);
        startActivity(siguientE);
    }
    public void Hombro (View view) {
        Intent siguientE = new Intent(Main109Activity.this, Main113Activity.class);
        startActivity(siguientE);
    }
    public void Gluteos(View view) {
        Intent siguientE = new Intent(Main109Activity.this, Main115Activity.class);
        startActivity(siguientE);
    }


}
