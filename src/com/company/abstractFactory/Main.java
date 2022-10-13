package com.company.abstractFactory;

import com.company.abstractFactory.factory.WinFactory;

public class Main {

    public static void main(String[] args) {
        Application application = new Application(new WinFactory());

        application.createUI();
        application.paint();
        System.out.println("asdasd");
        application.paintCheckbox();
    }
}
