package factories.abstractFactory.examples.factories.impl;

import factories.abstractFactory.examples.factories.IHotDrinkFactory;
import factories.abstractFactory.examples.objects.IHotDrink;
import factories.abstractFactory.examples.objects.impl.Coffee;

public class CoffeeFactory implements IHotDrinkFactory {
    @Override
    public IHotDrink prepare(int amount) {
        System.out.println(
                "Grind some beans, boil water, pour "
                        + amount + " ml, add cream and sugar, enjoy!"
        );
        return new Coffee();
    }
}
