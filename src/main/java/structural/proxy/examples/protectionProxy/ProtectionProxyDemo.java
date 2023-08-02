package structural.proxy.examples.protectionProxy;

import structural.proxy.examples.protectionProxy.model.Driver;
import structural.proxy.examples.protectionProxy.proxy.CarProxy;

class ProtectionProxyDemo
{
    public static void main(String[] args)
    {
        Drivable car = new CarProxy(new Driver(12)); // 22
        car.drive();
    }
}

