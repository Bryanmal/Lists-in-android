package com.example.deloitte.lists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Details2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);
        WebView browser = findViewById(R.id.webView);
        int data=getIntent().getIntExtra("data",0);

        if (data==0)
        {
            browser.loadUrl("file:///android_asset/persons/1.html");
        }else if (data==1)
        {
            browser.loadUrl("file:///android_asset/persons/2.html");
        }else if (data==2)
        {
            browser.loadUrl("file:///android_asset/persons/3.html");
        }else if (data==3)
        {
            browser.loadUrl("file:///android_asset/persons/4.html");
        }else if (data==4)
        {
            browser.loadUrl("file:///android_asset/persons/5.html");
        }else if (data==5)
        {
            browser.loadUrl("file:///android_asset/persons/6.html");
        }else if (data==6)
        {
            browser.loadUrl("file:///android_asset/persons/7.html");
        }else if (data==7)
        {
            browser.loadUrl("file:///android_asset/persons/8.html");
        }else if (data==8)
        {
            browser.loadUrl("file:///android_asset/persons/9.html");
        }else if (data==9)
        {
            browser.loadUrl("file:///android_asset/persons/10.html");
        }else if (data==10)
        {
            browser.loadUrl("file:///android_asset/persons/11.html");
        }else if (data==11)
        {
            browser.loadUrl("file:///android_asset/persons/12.html");
        }else if (data==12)
        {
            browser.loadUrl("file:///android_asset/persons/13.html");
        }else if (data==13)
        {
            browser.loadUrl("file:///android_asset/persons/14.html");
        }else if (data==14)
        {
            browser.loadUrl("file:///android_asset/persons/15.html");
        }else if (data==15)
        {
            browser.loadUrl("file:///android_asset/persons/16.html");
        }else if (data==16)
        {
            browser.loadUrl("file:///android_asset/persons/17.html");
        }else if (data==17)
        {
            browser.loadUrl("file:///android_asset/persons/18.html");
        }else if (data==18)
        {
            browser.loadUrl("file:///android_asset/persons/19.html");
        }else if (data==19)
        {
            browser.loadUrl("file:///android_asset/persons/20.html");
        }else if (data==20)
        {
            browser.loadUrl("file:///android_asset/persons/21.html");
        }

    }
}
