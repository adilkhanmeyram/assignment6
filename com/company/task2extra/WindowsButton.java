package com.company.task2extra;

public class WindowsButton implements IButton{

    @Override
    public void render() {
        System.out.println("Button in Windows Style");
    }

    @Override
    public void onclick(String f) {
        System.out.println("Windows event");
    }
}
