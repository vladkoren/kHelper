package com.koren.khelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class otherSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_select);
    }

    public void toInvertActivity(View view) {
        Intent intent = new Intent(otherSelectActivity.this, wordInverter_Activity.class);
        startActivity(intent);
    }
}
