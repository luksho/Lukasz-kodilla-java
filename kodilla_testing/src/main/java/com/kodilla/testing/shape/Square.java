package com.kodilla.testing.shape;

public abstract class ShapeSquare implements Shape {
    private String shape;

    public ShapeSquare(String shape) {
        this.shape = shape;
    }

    public String getShapeName() {
        return null;
    }


    public Double getField(Double a) {
        Double result = a * a;
        return result;
    }
}
