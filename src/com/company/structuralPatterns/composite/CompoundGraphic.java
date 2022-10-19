package com.company.structuralPatterns.composite;

import java.util.ArrayList;

public class CompoundGraphic implements Graphic {
    private ArrayList<Graphic> children;

    public void add(Graphic child) {
        children.add(child);
    }

    public void remove(Graphic child) {
        children.remove(child);
    }


    @Override
    public void move(int x, int y) {
        for(Graphic child: children){
            child.move(x,y);
        }
    }

    @Override
    public void draw() {
        for(Graphic g: children){
            g.draw();
        }
    }
}
