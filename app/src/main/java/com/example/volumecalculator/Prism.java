package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prism extends AppCompatActivity {
    TextView textView;
    EditText l,b,h;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        button=findViewById(R.id.calc);
        l=findViewById(R.id.length);
        b=findViewById(R.id.width);
        h=findViewById(R.id.height);
        textView=findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lt=l.getText().toString();
                String bt=b.getText().toString();
                String ht=h.getText().toString();
                double lv=Double.parseDouble(lt);
                double bv=Double.parseDouble(bt);
                double hv=Double.parseDouble(ht);

                double volume=lv*bv*hv;
                textView.setText("= "+volume);
            }
        });

    }
}