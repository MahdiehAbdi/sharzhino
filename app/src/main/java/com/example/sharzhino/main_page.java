package com.example.sharzhino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main_page extends AppCompatActivity {
    private Button buy_btn;
    private Button inquiry_btn1;
    private Thread v2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        buy_btn=findViewById(R.id.buy_btn);
        inquiry_btn1=findViewById(R.id.inquiry_btn1);
    }
    public void click1(View v1) {
        if (v1.getId() == R.id.buy_btn) {
            Intent intent1 = new Intent(main_page.this, buy_page.class);
            startActivity(intent1);
        } else if (v1.getId() == R.id.inquiry_btn1) {
            Intent intent1 = new Intent(main_page.this, inquiry_page.class);
            startActivity(intent1);
        }
    }
}