package com.company.task2extra;

public class HTMLButton implements IButton{
    @Override
    public void render() {
        System.out.println("HTML button");
    }

    @Override
    public void onclick(String f) {
        System.out.println("Web event");
    }
}
