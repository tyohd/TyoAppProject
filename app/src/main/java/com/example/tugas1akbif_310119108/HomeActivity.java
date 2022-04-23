package com.example.tugas1akbif_310119108;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void Profile(View view)
    {
        Intent intent = new Intent(HomeActivity.this,ProfileActivity.class);
        startActivity(intent);
    }
    public  void Logout(View view)
    {
        Intent intent = new Intent(HomeActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
