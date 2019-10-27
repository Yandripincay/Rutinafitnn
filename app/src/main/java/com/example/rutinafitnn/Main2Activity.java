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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class Main2Activity extends AppCompatActivity {
    private EditText mEditTextName;
    private EditText mEditTextMail;
    private EditText mEditTextPassword;
    private Button mButtonRegister;
    private String name="";
    private String email="";
    private String password="";
    DatabaseReference mDatabase;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mAuth= FirebaseAuth.getInstance();
        mDatabase= FirebaseDatabase.getInstance().getReference();
        mEditTextName= (EditText) findViewById(R.id.textname);
        mEditTextMail= (EditText) findViewById(R.id.textuser);
        mEditTextPassword= (EditText) findViewById(R.id.textpass);
        mButtonRegister= (Button) findViewById(R.id.buttonregister);

        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            name=mEditTextName.getText().toString();
            email=mEditTextMail.getText().toString();
            password=mEditTextPassword.getText().toString();

            if (!name.isEmpty()&& !email.isEmpty() && !password.isEmpty()) {
                if (password.length() >= 6){

                }
                else{
                    Toast.makeText(Main2Activity.this, "el password debe tener almenos 6 caracteres", Toast.LENGTH_SHORT).show();
                }
                registerUser();
            }
            else {
                Toast.makeText(Main2Activity.this, "debe completar los campos", Toast.LENGTH_SHORT).show();

            }
            }
        });
    }

    private void registerUser(){
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Map<String,Object> map=new HashMap<>();
                    map.put("name",name);
                    map.put("email",email);
                    map.put("password",password);
                    String id=mAuth.getCurrentUser().getUid();
                    mDatabase.child("Users").child(id).setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task2) {
                            if (task2.isSuccessful()){
                             startActivity(new Intent(Main2Activity.this, Main3Activity.class));
                             finish();
                            }
                            else {
                                Toast.makeText(Main2Activity.this, "no se pudieron crear los datos de registro", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
                else {
                    Toast.makeText(Main2Activity.this, "no se pudo registrar este usuario", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    public void Anterior(View view) {
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}
