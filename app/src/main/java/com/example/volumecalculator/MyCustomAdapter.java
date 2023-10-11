package com.example.volumecalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MyCustomAdapter extends ArrayAdapter<Shape> {

    private ArrayList<Shape> shapesArrayList;
    Context context;

    public MyCustomAdapter(ArrayList<Shape> shapesArrayList, Context context) {
        super(context, R.layout.grid_item, shapesArrayList);
        this.shapesArrayList = shapesArrayList;
        this.context = context;
    }

    // View Holder: Used to cache references to the views within an item layout
    private static class MyViewHolder{
        TextView shapeName;
        ImageView shapeImg;
    }

    // GetView(): Used to create and return a view for a specific item in Grid.
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // 1- Get the shape object for the current position
        Shape shapes = getItem(position);

        // 2- Inflating Layout:
        MyViewHolder myViewHolder;

        if (convertView == null){
            // no view went off-screen --> Create a new view
            myViewHolder= new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());

            convertView = inflater.inflate(
                    R.layout.grid_item,
                    parent,
                    false
            );

            // Finding the Views
            myViewHolder.shapeName = (TextView) convertView.findViewById(R.id.textView);
            myViewHolder.shapeImg  = (ImageView) convertView.findViewById(R.id.imageView);

            convertView.setTag(myViewHolder);



        }else{
            // a view went off-screen  --> re-use it
            myViewHolder = (MyViewHolder) convertView.getTag();

        }


        // Getting the data from the model class (Shape)
        myViewHolder.shapeName.setText(shapes.getShape());
        myViewHolder.shapeImg.setImageResource(shapes.getShapeimg());

        return convertView;




    }
}