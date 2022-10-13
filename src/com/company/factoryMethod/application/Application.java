package com.company.factoryMethod.application;

import com.company.factoryMethod.Dialog;

public class Application {
    private Dialog dialog;

    public Application(Dialog dialog) {
        this.dialog = dialog;
    }

    public Dialog getDialog() {
        return dialog;
    }



}
