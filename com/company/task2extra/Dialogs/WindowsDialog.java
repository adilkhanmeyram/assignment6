package com.company.task2extra.Dialogs;

import com.company.task2extra.IButton;
import com.company.task2extra.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }
}
