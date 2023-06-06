package com.example.sharzhino;

import static com.example.sharzhino.R.id.payment_btn2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class inquiry_page extends AppCompatActivity {
    private EditText fixedLine_et;
    private Button inquiry_btn2;
    private TextView payment_tv1;
    private TextView payment_tv2;
    private TextView bill_tv1;
    private TextView bill_tv2;
    private TextView intermediate_tv1;
    private TextView intermediate_tv2;
    private TextView endOfCourse_tv1;
    private TextView endOfCourse_tv2;
    private Button payment_btn2;
    private Button back_btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry_page);
        fixedLine_et=findViewById(R.id.fixedLine_et);
        inquiry_btn2=findViewById(R.id.inquiry_btn2);
        payment_tv1=findViewById(R.id.payment_tv1);
        payment_tv2=findViewById(R.id.payment_tv2);
        bill_tv1=findViewById(R.id.bill_tv1);
        bill_tv2=findViewById(R.id.bill_tv2);
        intermediate_tv1=findViewById(R.id.intermediate_tv1);
        intermediate_tv2=findViewById(R.id.intermediate_tv2);
        endOfCourse_tv1=findViewById(R.id.endOfCourse_tv1);
        endOfCourse_tv2=findViewById(R.id.endOfCourse_tv2);
        payment_btn2=findViewById(R.id.payment_btn2);
        back_btn2=findViewById(R.id.back_btn2);
        payment_tv1.setVisibility(View.INVISIBLE);
        payment_tv2.setVisibility(View.INVISIBLE);
        bill_tv1.setVisibility(View.INVISIBLE);
        bill_tv2.setVisibility(View.INVISIBLE);
        intermediate_tv1.setVisibility(View.INVISIBLE);
        intermediate_tv2.setVisibility(View.INVISIBLE);
        endOfCourse_tv1.setVisibility(View.INVISIBLE);
        endOfCourse_tv2.setVisibility(View.INVISIBLE);
    }
    public void click1(View v1) {
        if (v1.getId() == R.id.inquiry_btn2) {
            payment_tv1.setVisibility(View.VISIBLE);
            payment_tv2.setVisibility(View.VISIBLE);
            bill_tv1.setVisibility(View.VISIBLE);
            bill_tv2.setVisibility(View.VISIBLE);
            intermediate_tv1.setVisibility(View.VISIBLE);
            intermediate_tv2.setVisibility(View.VISIBLE);
            endOfCourse_tv1.setVisibility(View.VISIBLE);
            endOfCourse_tv2.setVisibility(View.VISIBLE);
        } else if(v1.getId()==R.id.payment_btn2) {

        } else if (v1.getId() == R.id.back_btn2) {
            Intent intent1 = new Intent(inquiry_page.this, main_page.class);
            startActivity(intent1);
        }
    }
}