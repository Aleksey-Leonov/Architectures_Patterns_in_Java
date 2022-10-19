package com.company.factoryMethod;

public class HTMLButton implements Button {

    @Override
    public void render() {
        System.out.println("Код кнопки HTML 551312");
    }

    @Override
    public void onClick() {
        System.out.println("Произошло событие кнопки HTMLe");
    }
}
