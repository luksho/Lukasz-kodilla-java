package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shape;
    private Double field;

    public Triangle(String shape, Double field) {
        this.shape = shape;
        this.field = field;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shape='" + shape + '\'' +
                ", field=" + field +
                '}';
    }

    @Override
    public String getShapeName() {
        return shape;
    }

    @Override
    public Double getField() {
        return field;
    }
}
