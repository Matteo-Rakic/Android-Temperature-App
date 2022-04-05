package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtInstruction, txtTempOut;
    EditText edtInput;
    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInstruction = findViewById(R.id.txtInstruction);
        txtInstruction.setText("Please input temperature in degrees Celcius: ");
        txtTempOut = findViewById(R.id.txtTempOut);
        edtInput = findViewById(R.id.edtInput);
        btnCalc = findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int out, in;

                in = Integer.parseInt(String.valueOf(edtInput.getText()));
                out = (in*9/5) + 32;
                txtTempOut.setText(in + " degrees Celcius converted to degrees Farenheit: "+out);
            }
        });
    }
}