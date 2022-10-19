package com.company.structuralPatterns.composite;

public class Dot implements Graphic{
    private int x;
    private int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x +=x;
        this.y +=y;
    }

    @Override
    public void draw() {
        System.out.println("точка находится в координатах " + x + " и " + y);
    }
}
