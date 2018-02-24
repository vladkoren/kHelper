package com.koren.khelper;

import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mathBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mathBtn = findViewById(R.id.mathBtn);
    }

    public void mathBtnPresssed(View view) {
        Intent intent = new Intent(MainActivity.this, MathSelectActivity.class);
        startActivity(intent);
    }

    public void infoBtnPressed(View view) {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        startActivity(intent);
        
    }

    public void toPhysActivity(View view) {
        Intent intent = new Intent(MainActivity.this, physicsSelectActivity.class);
        startActivity(intent);
    }

    public void toOtherActivity(View view) {
        Intent intent = new Intent(MainActivity.this, otherSelectActivity.class);
        startActivity(intent);
    }
}
