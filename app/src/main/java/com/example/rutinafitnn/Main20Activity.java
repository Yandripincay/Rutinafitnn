package com.example.rutinafitnn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main20Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
    }
    public void Numero88(View view) {
        Intent siguientE = new Intent(Main20Activity.this, Main104Activity.class);
        startActivity(siguientE);
    }
    public void Numero89(View view) {
        Intent siguientE = new Intent(Main20Activity.this, Main105Activity.class);
        startActivity(siguientE);
    }


}
