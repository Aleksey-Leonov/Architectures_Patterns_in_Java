package com.company.abstractFactory.factory;

import com.company.abstractFactory.button.Button;
import com.company.abstractFactory.button.MacButton;
import com.company.abstractFactory.checkbox.CheckBox;
import com.company.abstractFactory.checkbox.MacCheckBox;
import com.company.abstractFactory.checkbox.WinCheckBox;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        Button button = new MacButton();
        return button;
    }

    @Override
    public CheckBox createCheckBox() {
        CheckBox checkBox = new MacCheckBox();
        return checkBox;
    }
}
