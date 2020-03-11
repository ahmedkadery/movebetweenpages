package com.qadry.movebetweenpages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_4);
    }

    public void Backtolastpage(View view) {
        Intent intenttopage6=new Intent(page_4.this,page3.class);
        startActivity(intenttopage6);

    }

    public void NextPage(View view) {
        Intent Intenttopage7=new  Intent(page_4.this,page_5.class);
        startActivity(Intenttopage7);
    }
}
