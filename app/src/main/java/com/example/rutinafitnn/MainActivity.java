package com.example.rutinafitnn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private EditText mEditTextMail;
    private EditText mEditTextPassword;
    private Button mButtonLogin;

    private String email="";
    private String password="";

    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth=FirebaseAuth.getInstance();
        mEditTextMail= (EditText) findViewById(R.id.editText);
        mEditTextPassword= (EditText) findViewById(R.id.editText3);
        mButtonLogin= (Button) findViewById(R.id.button2);
        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
    email=mEditTextMail.getText().toString();
    password=mEditTextPassword.getText().toString();
    if (!email.isEmpty() && !password.isEmpty()){
loginUser();
    }
    else {
        Toast.makeText(MainActivity.this, "Complete los campos", Toast.LENGTH_SHORT).show();
    }
            }
        });
    }
    public void Siguiente(View view) {
        Intent siguiente = new Intent(this, Main2Activity.class);
        startActivity(siguiente);
    }
    private void loginUser(){
    mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
        @Override
        public void onComplete(@NonNull Task<AuthResult> task) {
            if (task.isSuccessful()){
                startActivity(new Intent(MainActivity.this,Main4Activity.class));
                finish();
            }
            else {
                Toast.makeText(MainActivity.this, "no se pudo iniciar sesion compruebe datos", Toast.LENGTH_SHORT).show();
            }
        }
    });
    }
}
