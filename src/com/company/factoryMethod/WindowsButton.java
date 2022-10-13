package com.company.factoryMethod;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Код кнопки Виндовс12311");
    }

    @Override
    public void onClick() {
        System.out.println("Произошло событие кнопки Виндовс");
    }
}
