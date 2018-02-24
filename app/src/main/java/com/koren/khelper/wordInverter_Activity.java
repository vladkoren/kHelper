package com.koren.khelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.koren.khelper.R.*;

public class wordInverter_Activity extends AppCompatActivity {

    EditText inputInvertText;
    TextView outputView;
    String sInputText, sOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_word_inverter_);
        inputInvertText = findViewById(id.inputInvertField);
        outputView = findViewById(id.outputText);
        sOutput = "";

    }

    public void invertText(View view) {
        sInputText = inputInvertText.getText().toString();
        char[] arrInputText = sInputText.toCharArray();
        for(int i = (arrInputText.length - 1) ; i>-1; i--){
            sOutput = sOutput + arrInputText[i];
        }
        outputView.setText(sOutput);
        sOutput = "";
    }
}
