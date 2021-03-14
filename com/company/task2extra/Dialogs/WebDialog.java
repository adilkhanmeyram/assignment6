package com.company.task2extra.Dialogs;

import com.company.task2extra.HTMLButton;
import com.company.task2extra.IButton;

public class WebDialog extends Dialog {
    @Override
    public IButton createButton() {
        return new HTMLButton();
    }
}
