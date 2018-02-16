package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shape;
    private Double field;

    public Circle(String shape, Double field) {
        this.shape = shape;
        this.field = field;
    }

    @Override
    public String toString() {
        return "Circle{" +
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
