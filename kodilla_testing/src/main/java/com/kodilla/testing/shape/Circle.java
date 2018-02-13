package com.kodilla.testing.shape;

import static java.lang.Math.*;

public class ShapeCircle implements Shape {
    private String shape;
    private Double field;

    public ShapeCircle(String shape, Double field) {
        this.shape = shape;
        this.field = field;
    }


    @Override
    public String getShapeName() {
        return this.shape;
    }

    @Override
    public Double getField() {
        return this.field;
    }
    @Override
    public Double getField(Double r) {
        Double result = 2 * PI * r;
        return result;
    }
}
