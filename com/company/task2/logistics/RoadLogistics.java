package com.company.task2.logistics;

import com.company.task2.Transports.ITransport;
import com.company.task2.Transports.Truck;

public class RoadLogistics extends Logistics{
    public ITransport createTransport() {
        return new Truck();
    }
}
