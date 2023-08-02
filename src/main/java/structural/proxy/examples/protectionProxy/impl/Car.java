package structural.proxy.examples.protectionProxy.impl;

import structural.proxy.examples.protectionProxy.Drivable;
import structural.proxy.examples.protectionProxy.model.Driver;

public class Car implements Drivable {
    protected Driver driver;

    public Car(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void drive() {
        System.out.println("Car being driven");
    }
}
