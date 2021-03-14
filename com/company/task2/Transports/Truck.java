package com.company.task2.Transports;

public class Truck implements ITransport {
    @Override
    public void deliver() {
        System.out.println("Deliver by land");
    }
}
