package com.company.task2.logistics;

import com.company.task2.Transports.ITransport;

public abstract class Logistics {
    public abstract ITransport createTransport();
    public void planDelivery() {
        ITransport transport = createTransport();
        transport.deliver();
    }
}
