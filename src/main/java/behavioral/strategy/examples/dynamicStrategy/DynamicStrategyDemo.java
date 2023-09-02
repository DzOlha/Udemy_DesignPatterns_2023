package behavioral.strategy.examples.dynamicStrategy;

import java.util.List;

public class DynamicStrategyDemo {
    public static void main(String[] args)
    {
        TextProcessor tp = new TextProcessor(OutputFormat.MARKDOWN);
        tp.appendList(List.of("liberte", "egalite", "fraternite"));
        System.out.println(tp);

        tp.clear();
        tp.setOutputFormat(OutputFormat.HTML);
        tp.appendList(List.of("inheritance", "encapsulation", "polymorphism"));
        System.out.println(tp);
    }
}
