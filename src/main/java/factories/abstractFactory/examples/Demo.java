package factories.abstractFactory.examples;

import factories.abstractFactory.examples.objects.IHotDrink;

public class Demo {
    public static void main(String[] args) throws Exception
    {
        HotDrinkMachine machine = new HotDrinkMachine();
        IHotDrink tea = machine.makeDrink(HotDrinkMachine.AvailableDrink.TEA, 200);
        tea.consume();

        // interactive
        IHotDrink drink = machine.makeDrink();
        drink.consume();
    }
}
