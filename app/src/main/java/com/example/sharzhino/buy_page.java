package com.example.sharzhino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class buy_page extends AppCompatActivity {
    private EditText amount_et;
    private EditText mobile_et;
    private Button MCI_btn;
    private Button irancell_btn;
    private Button rightel_btn;
    private Button payment_btn1;
    private Button back_btn1;
    private String GetEditText1;
    private String GetEditText2;
    private String url ="https://shop.mci.ir/charge";
    private WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_page);
        amount_et=findViewById(R.id.amount_et);
        mobile_et=findViewById(R.id.mobile_et);
        MCI_btn=findViewById(R.id.MCI_btn);
        irancell_btn=findViewById(R.id.irancell_btn);
        rightel_btn=findViewById(R.id.rightel_btn);
        payment_btn1=findViewById(R.id.payment_btn1);
        back_btn1=findViewById(R.id.back_btn1);
        wv1=(WebView)findViewById(R.id.webView);
        wv1.setWebViewClient(new MyBrowser());
    }
GetEditText1 = amount_et.getText().toString();
if(TextUtils.isEmpty(GetEditText1)){

}
GetEditText2 = mobile_et.getText().toString();
if(TextUtils.isEmpty(GetEditText2)){

}
    public void click1(View v1) {
        if (v1.getId() == R.id.payment_btn1) {
            wv1.getSettings().setLoadsImagesAutomatically(true);
            wv1.getSettings().setJavaScriptEnabled(true);
            wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            wv1.loadUrl(url);
        } else if (v1.getId() == R.id.MCI_btn) {
            MCI_btn.setText("انتخاب شد");
            irancell_btn.setText("ایرانسل");
            rightel_btn.setText("رایتل");
        } else if (v1.getId() == R.id.irancell_btn) {
            MCI_btn.setText("همراه اول");
            irancell_btn.setText("انتخاب شد");
            rightel_btn.setText("رایتل");
        } else if (v1.getId() == R.id.rightel_btn) {
            MCI_btn.setText("همراه اول");
            irancell_btn.setText("ایرانسل");
            rightel_btn.setText("انتخاب شد");
        } else if (v1.getId() == R.id.back_btn1) {
            Intent intent3 = new Intent(buy_page.this, main_page.class);
            startActivity(intent3);
        }
    }
private class MyBrowser extends WebViewClient {
      @Override
      public boolean shouldOverrideUrlLoading(WebView view, String url) {
         view.loadUrl(url);
         return true;
}
}
}