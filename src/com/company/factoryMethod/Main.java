package com.company.factoryMethod;

import com.company.factoryMethod.application.Application;

public class Main {

    public static void main(String[] args) throws Exception {

        Application application = new Application(new WindowsDialog());
        application.getDialog().render();

    }
}