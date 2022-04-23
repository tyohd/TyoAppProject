package com.example.tugas1akbif_310119108;


import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void Daftar(View view){

        Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void Masuk(View view){
        Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
        startActivity(intent);
    }

}

