package factories.abstractFactory.examples.factories.impl;

import factories.abstractFactory.examples.factories.IHotDrinkFactory;
import factories.abstractFactory.examples.objects.IHotDrink;
import factories.abstractFactory.examples.objects.impl.Tea;

public class TeaFactory implements IHotDrinkFactory {
    @Override
    public IHotDrink prepare(int amount) {
        System.out.println(
                "Put in tea bag, boil water, pour "
                        + amount + "ml, add lemon, enjoy!"
        );
        return new Tea();
    }
}
