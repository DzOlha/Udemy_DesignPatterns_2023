package structural.proxy.examples.dynamicProxy.model.impl;

import structural.proxy.examples.dynamicProxy.model.Human;

public class Person implements Human {
    @Override
    public void walk() {
        System.out.println("I am walking");
    }

    @Override
    public void talk() {
        System.out.println("I am talking");
    }
}
