package com.qadry.movebetweenpages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }

    public void Back_main2(View View){
        Intent intentpage3= new Intent(page3.this, MainActivity.class);
        startActivity(intentpage3);
    }

    public void Backptopage2(View view) {
        Intent intenttopgae2=new Intent(page3.this, page2.class);
        startActivity(intenttopgae2);
    }
}
