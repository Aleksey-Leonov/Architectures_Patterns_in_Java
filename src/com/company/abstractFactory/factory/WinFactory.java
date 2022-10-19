package com.company.abstractFactory.factory;

import com.company.abstractFactory.button.Button;
import com.company.abstractFactory.button.WinButton;
import com.company.abstractFactory.checkbox.CheckBox;
import com.company.abstractFactory.checkbox.WinCheckBox;

public class WinFactory implements GUIFactory{
    @Override
    public Button createButton() {
        Button button = new WinButton();
        return button;
    }

    @Override
    public CheckBox createCheckBox() {
        CheckBox checkBox = new WinCheckBox();
        return checkBox;
    }
}
