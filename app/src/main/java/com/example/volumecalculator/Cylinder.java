package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cylinder extends AppCompatActivity {

    EditText editText1,editText2;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        textView=findViewById(R.id.textView);
        button=findViewById(R.id.button);
        editText1=findViewById(R.id.radiustext);
        editText2=findViewById(R.id.heighttext);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radius=editText1.getText().toString();
                String height=editText2.getText().toString();
                double h=Double.parseDouble(height);
                double r=Double.parseDouble(radius);
                double volume=3.14159*r*r*h;
                textView.setText("= "+volume);
            }
        });
    }
}