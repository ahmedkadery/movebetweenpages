package com.qadry.movebetweenpages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_5);

    }
    public void Backmain(View View){
        Intent intentpage8= new Intent(page_5.this, MainActivity.class);
        startActivity(intentpage8);
    }

    public void Backptopage2(View View) {
        Intent intenttopgae9=new Intent(page_5.this, page_4.class);
        startActivity(intenttopgae9);
    }



}

