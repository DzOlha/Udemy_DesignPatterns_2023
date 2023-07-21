package factories.abstractFactory.examples.factories;

import factories.abstractFactory.examples.objects.IHotDrink;

public interface IHotDrinkFactory {
    IHotDrink prepare(int amount);
}
