package com.koren.khelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class physicsSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_select);
    }

    public void kmHtoMsBtn(View view) {
        Intent intent = new Intent(physicsSelectActivity.this, kmhToMs_Activity.class);
        startActivity(intent);
    }
}
