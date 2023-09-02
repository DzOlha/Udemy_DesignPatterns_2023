package behavioral.strategy.examples.static_Strategy;

import behavioral.strategy.examples.static_Strategy.strategy.impl.HtmlListStrategy;
import behavioral.strategy.examples.static_Strategy.strategy.impl.MarkdownListStrategy;

import java.util.List;

public class StaticStrategyDemo
{
    public static void main(String[] args)
    {
        TextProcessor<MarkdownListStrategy> tp = new TextProcessor<>(
                MarkdownListStrategy::new);
        tp.appendList(List.of("liberte", "egalite", "fraternite"));
        System.out.println(tp);

        TextProcessor<HtmlListStrategy> tp2 = new TextProcessor<>(HtmlListStrategy::new);
        tp2.appendList(List.of("inheritance", "encapsulation", "polymorphism"));
        System.out.println(tp2);
    }
}
