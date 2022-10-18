package com.company.generativePatterns.prototipe;

public abstract class Shape {
    private int x;
    private int y;
    private String color;


    public Shape() {

    }



    public Shape(Shape source) {
        this();
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public abstract Shape clone();
}
