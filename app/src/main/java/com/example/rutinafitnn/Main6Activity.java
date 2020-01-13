package com.example.rutinafitnn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.rutinafitnn.triceps.Main21Activity;
import com.example.rutinafitnn.triceps.Main22Activity;
import com.example.rutinafitnn.triceps.Main23Activity;
import com.example.rutinafitnn.triceps.Main24Activity;
import com.example.rutinafitnn.triceps.Main26Activity;
import com.example.rutinafitnn.triceps.Main27Activity;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
    public void Numero1(View view) {
        Intent siguientE = new Intent(Main6Activity.this, Main21Activity.class);
        startActivity(siguientE);
    }
    public void Numero2(View view) {
        Intent siguientE = new Intent(Main6Activity.this, Main22Activity.class);
        startActivity(siguientE);
    }
    public void Numero3(View view) {
        Intent siguientE = new Intent(Main6Activity.this, Main23Activity.class);
        startActivity(siguientE);
    }
    public void Numero4(View view) {
        Intent siguientE = new Intent(Main6Activity.this, Main24Activity.class);
        startActivity(siguientE);
    }

    public void Numero6(View view) {
        Intent siguientE = new Intent(Main6Activity.this, Main26Activity.class);
        startActivity(siguientE);
    }
    public void Numero7(View view) {
        Intent siguientE = new Intent(Main6Activity.this, Main27Activity.class);
        startActivity(siguientE);
    }
}
