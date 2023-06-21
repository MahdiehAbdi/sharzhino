package com.example.sharzhino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class about_page extends AppCompatActivity {
    private Button back_btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);
        back_btn3=findViewById(R.id.back_btn3);
    }
    public void click1(View v1) {
        if (v1.getId() == R.id.back_btn3) {
            Intent intent6 = new Intent(about_page.this, main_page.class);
            startActivity(intent6);
        }
    }
}