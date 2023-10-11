package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Shape> shapearray;
    MyCustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        shapearray=new ArrayList<>();
        Shape s1=new Shape(R.drawable.sphere,"Sphere");
        Shape s2=new Shape(R.drawable.cube,"Cube");
        Shape s3=new Shape(R.drawable.cylinder,"Cylinder");
        Shape s4=new Shape(R.drawable.prism,"Prism");
        shapearray.add(s1);
        shapearray.add(s2);
        shapearray.add(s3);
        shapearray.add(s4);
        customAdapter=new MyCustomAdapter(shapearray,getApplicationContext());
        gridView.setAdapter(customAdapter);
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i) {
                    case 0:
                        startActivity(new Intent(getApplicationContext(), Sphere.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(), Cube.class));
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(), Cylinder.class));
                        break;
                    case 3:
                        startActivity(new Intent(getApplicationContext(), Prism.class));
                        break;
                    // Add more cases for other activities as needed
                }
            }
        });



    }
}