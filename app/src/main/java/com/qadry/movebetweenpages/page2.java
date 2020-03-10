package com.qadry.movebetweenpages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }
    public  void btn_backmain (View View){
        Intent intentpage2=new Intent(page2.this, MainActivity.class);
        startActivity(intentpage2);
    }

    public void btn_page3(View View) {
        Intent intenttopage3=new Intent(page2.this,page3.class);
        startActivity(intenttopage3);
    }

}
