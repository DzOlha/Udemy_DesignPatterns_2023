package creational.factories.abstractFactory.examples.objects.impl;

import creational.factories.abstractFactory.examples.objects.IHotDrink;

public class Tea implements IHotDrink {
    @Override
    public void consume() {
        System.out.println("This tea is nice but I'd prefer it with milk.");
    }
}
