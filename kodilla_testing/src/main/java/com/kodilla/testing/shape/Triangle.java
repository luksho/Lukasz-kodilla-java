package com.kodilla.testing.shape;

public abstract class ShapeTriangle implements Shape {
    private String shape;

    public ShapeTriangle(String triangle) {
        this.shape = shape;
    }

    public String getShapeName() {
        return null;
    }

    public Double getField(Double a, Double b, Double c) {
        Double result = a + b + c;
        return result;
    }
}
