package behavioral.strategy.examples.dynamicStrategy;

import behavioral.strategy.examples.static_Strategy.strategy.ListStrategy;
import behavioral.strategy.examples.static_Strategy.strategy.impl.HtmlListStrategy;
import behavioral.strategy.examples.static_Strategy.strategy.impl.MarkdownListStrategy;

import java.util.List;

public class TextProcessor {
    private StringBuilder sb = new StringBuilder();
    private ListStrategy listStrategy;

    public TextProcessor(OutputFormat format) {
        setOutputFormat(format);
    }
    public void setOutputFormat(OutputFormat format) {
        switch (format) {
            case MARKDOWN:
                listStrategy = new MarkdownListStrategy();
                break;
            case HTML:
                listStrategy = new HtmlListStrategy();
                break;
        }
    }

    // the skeleton algorithm is here
    public void appendList(List<String> items) {
        listStrategy.start(sb);
        for (String item : items)
            listStrategy.addListItem(sb, item);
        listStrategy.end(sb);
    }

    public void clear() {
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
