package com.company;

public class Bed {

    private Dimension dimension;
    private String color;

    public Bed(Dimension dimension, String color) {
        this.dimension = dimension;
        this.color = color;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getColor() {
        return color;
    }
}
