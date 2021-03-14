package com.company.task2.Transports;

public class Ship implements ITransport {
    @Override
    public void deliver() {
        System.out.println("Deliver by sea");
    }
}
