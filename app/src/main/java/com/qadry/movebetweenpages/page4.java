package com.qadry.movebetweenpages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class page4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
    }

    public void Back_main2(View View) {
        Intent intentpage2 = new Intent(page4.this, MainActivity.class);
        startActivity(intentpage2);
    }

    public void Backptopage3(View View) {
        Intent intenttopage3 = new Intent(page4.this, page3.class);
        startActivity(intenttopage3);
    }
}
