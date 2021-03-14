package com.company.task2extra.Dialogs;

import com.company.task2extra.IButton;

public abstract class Dialog {

    public abstract IButton createButton();
    public void render() {
        IButton okButton = createButton();
        okButton.render();
        okButton.onclick("ok");


    }
}
