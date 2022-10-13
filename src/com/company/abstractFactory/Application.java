package com.company.abstractFactory;

import com.company.abstractFactory.button.Button;
import com.company.abstractFactory.checkbox.CheckBox;
import com.company.abstractFactory.factory.GUIFactory;

public class Application {
    private GUIFactory factory;
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI(){
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void paint(){
        button.paint();
    }

    public void paintCheckbox(){
        checkBox.paint();
    }
}
