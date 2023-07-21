package creational.factories.abstractFactory.examples.factories;

import creational.factories.abstractFactory.examples.objects.IHotDrink;

public interface IHotDrinkFactory {
    IHotDrink prepare(int amount);
}
