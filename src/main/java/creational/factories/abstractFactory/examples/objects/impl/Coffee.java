package creational.factories.abstractFactory.examples.objects.impl;

import creational.factories.abstractFactory.examples.objects.IHotDrink;

public class Coffee implements IHotDrink {
    @Override
    public void consume() {
        System.out.println("This coffee is delicious");
    }
}
