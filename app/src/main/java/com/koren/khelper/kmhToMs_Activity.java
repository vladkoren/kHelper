package com.koren.khelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class kmhToMs_Activity extends AppCompatActivity {

    EditText inputField;
    TextView outputField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kmh_to_ms_);
        inputField = findViewById(R.id.inputField);
        outputField = findViewById(R.id.outPutTextV);
    }

    public void convert(View view) {
        double temp = Integer.parseInt(inputField.getText().toString());
        double output = (temp*5)/18;
        outputField.setText(String.format("%s", output));
    }
}
