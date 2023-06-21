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
    private Button back_btn2;
    private String GetEditText3;
    private String GetEditText4;
    private String url ="https://ghabzino.com/phone";
    private WebView wv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry_page);
        fixedLine_et=findViewById(R.id.fixedLine_et);
        inquiry_btn2=findViewById(R.id.inquiry_btn2);
        back_btn2=findViewById(R.id.back_btn2);
        wv2=(WebView)findViewById(R.id.webView);
        wv2.setWebViewClient(new MyBrowser());
    }
GetEditText3 = amount_et.getText().toString();
if(TextUtils.isEmpty(GetEditText3)){

}
GetEditText4 = mobile_et.getText().toString();
if(TextUtils.isEmpty(GetEditText4)){

}
    public void click1(View v1) {
        if (v1.getId() == R.id.inquiry_btn2) {
            wv2.getSettings().setLoadsImagesAutomatically(true);
            wv2.getSettings().setJavaScriptEnabled(true);
            wv2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            wv2.loadUrl(url);
        } else if (v1.getId() == R.id.back_btn2) {
            Intent intent4 = new Intent(inquiry_page.this, main_page.class);
            startActivity(intent4);
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