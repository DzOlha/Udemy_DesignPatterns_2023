package structural.proxy.examples.protectionProxy.proxy;

import structural.proxy.examples.protectionProxy.impl.Car;
import structural.proxy.examples.protectionProxy.model.Driver;

public class CarProxy extends Car {
    private Driver driver;

    public CarProxy(Driver driver) {
        super(driver);
    }

    @Override
    public void drive() {
        if (driver.age >= 17)
            super.drive();
        else
            System.out.println("Driver too young");
    }
}
