package behavioral.strategy.examples.static_Strategy.strategy.impl;

import behavioral.strategy.examples.static_Strategy.strategy.ListStrategy;

public class MarkdownListStrategy implements ListStrategy {
    @Override
    public void addListItem(StringBuilder stringBuilder, String item) {
        stringBuilder.append(" * ").append(item)
                .append(System.lineSeparator());
    }
}
