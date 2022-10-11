package com.company.factory.method.application;

import com.company.factory.method.Dialog;
import com.company.factory.method.WebDialog;
import com.company.factory.method.WindowsDialog;

public class Application {
    private Dialog dialog;

    public Application(Dialog dialog) {
        this.dialog = dialog;
    }

    public Dialog getDialog() {
        return dialog;
    }



}
