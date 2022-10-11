package com.company.factory.method;

import com.company.factory.method.application.Application;

public class Main {

    public static void main(String[] args) throws Exception {

        Application application = new Application(new WindowsDialog());

        application.getDialog().render();



    }
}