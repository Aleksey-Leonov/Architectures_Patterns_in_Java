package com.company.abstractFactory.factory;


import com.company.abstractFactory.button.Button;
import com.company.abstractFactory.checkbox.CheckBox;

public interface GUIFactory {
    public Button createButton();
    public CheckBox createCheckBox();
}
