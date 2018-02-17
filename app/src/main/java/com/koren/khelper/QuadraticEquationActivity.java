package com.koren.khelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class QuadraticEquationActivity extends AppCompatActivity {

    double kA, kB, kC, D, x1, x2;
    EditText aEditText, bEditText, cEditText;
    TextView resultsField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadratic_equation);
        aEditText = findViewById(R.id.aEditText);
        bEditText = findViewById(R.id.bEditText);
        cEditText = findViewById(R.id.cEditText);
        resultsField = findViewById(R.id.resultsText);
    }

    public void solveIt(View view) {
        kA = Integer.parseInt(aEditText.getText().toString());
        kB = Integer.parseInt(bEditText.getText().toString());
        kC = Integer.parseInt(cEditText.getText().toString());
        if(kA!=0){
            D = (Math.pow(kB, 2) - (4*kA*kC));
            if(D>=0){
                x1 = ((-1*kB)+Math.sqrt(D))/(2*kA);
                x2 = ((-1*kB)-Math.sqrt(D))/(2*kA);
                resultsField.setText("D = " + D + " x1 = " + x1 + " x2 = " + x2);
            }
            else {
                resultsField.setText(getResources().getString(R.string.noSolutions));
            }
        }
        else{
            resultsField.setText(getResources().getString(R.string.aEquals0));
        }

    }
}
