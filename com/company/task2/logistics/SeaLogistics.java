package com.company.task2.logistics;

import com.company.task2.Transports.ITransport;
import com.company.task2.Transports.Ship;

public class SeaLogistics extends Logistics {
    public ITransport createTransport() {
        return new Ship();
    }
}
