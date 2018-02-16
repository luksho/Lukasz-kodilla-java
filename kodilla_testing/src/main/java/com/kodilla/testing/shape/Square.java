package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shape;
    private Double field;

    public Square(String shape, Double field) {
        this.shape = shape;
        this.field = field;
    }

    @Override
    public String toString() {
        return "Square{" +
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
