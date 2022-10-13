package com.company.abstractFactory.button;

import com.company.abstractFactory.button.Button;

public class WinButton extends Button {

    @Override
    public void paint() {
        System.out.println("кнопка windows");
    }
}
