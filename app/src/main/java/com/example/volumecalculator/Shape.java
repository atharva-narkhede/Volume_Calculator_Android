package com.example.volumecalculator;

public class Shape {

    int shapeimg;
    String shape;
    public Shape(int shapeimg, String shape) {
        this.shapeimg = shapeimg;
        this.shape = shape;
    }

    public int getShapeimg() {
        return shapeimg;
    }

    public String getShape() {
        return shape;
    }

    public void setShapeimg(int shapeimg) {
        this.shapeimg = shapeimg;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}

