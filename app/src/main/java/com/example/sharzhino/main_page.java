package com.example.sharzhino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main_page extends AppCompatActivity {
    private Button buy_btn;
    private Button inquiry_btn1;
    private Button about_btn;
    private Button exit_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        buy_btn=findViewById(R.id.buy_btn);
        inquiry_btn1=findViewById(R.id.inquiry_btn1);
        about_btn=findViewById(R.id.about_btn);
        exit_btn=findViewById(R.id.exit_btn);
    }
    public void click1(View v1) {
        if (v1.getId() == R.id.buy_btn) {
            Intent intent1 = new Intent(main_page.this, buy_page.class);
            startActivity(intent1);
        } else if (v1.getId() == R.id.inquiry_btn1) {
            Intent intent2 = new Intent(main_page.this, inquiry_page.class);
            startActivity(intent2);
        } else if (v1.getId() == R.id.about_btn) {
            Intent intent5 = new Intent(main_page.this, about_page.class);
            startActivity(intent5);
        } else if (v1.getId() == R.id.exit_btn) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }
}