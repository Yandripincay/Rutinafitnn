package com.example.rutinafitnn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main4Activity extends AppCompatActivity {
    ImageButton mImageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        mImageButton=(ImageButton)findViewById(R.id.imageButton2);
        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main4Activity.this,Main5Activity.class);
                startActivity(i);
            }
        });
        mImageButton=(ImageButton)findViewById(R.id.imageButton3);
        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main4Activity.this,Main6Activity.class);
                startActivity(i);
            }
        });


    }

}
