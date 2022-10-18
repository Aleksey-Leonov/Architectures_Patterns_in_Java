package com.company.generativePatterns.prototipe;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<Shape> shapeArrayList = new ArrayList();

        Circle circle = new Circle();

        for (int i = 0; i < 5; i++) {
            shapeArrayList.add(circle.clone());
        }

        for(Shape shape: shapeArrayList){
            System.out.println(shape);
        }
    }
    private ArrayList<Shape> shapes = new ArrayList<>();

    public Application() {



    }
}
