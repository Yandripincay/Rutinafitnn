package com.example.rutinafitnn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main106Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main106);
    }
    public void Siguiente(View view) {
        Intent siguientE = new Intent(Main106Activity.this, Main109Activity.class);
        startActivity(siguientE);
    }
}
