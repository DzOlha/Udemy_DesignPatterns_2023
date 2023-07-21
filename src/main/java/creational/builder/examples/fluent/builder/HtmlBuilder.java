package creational.builder.examples.fluent.builder;

import creational.builder.examples.fluent.model.HtmlElement;

public class HtmlBuilder {
    private String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        root.name = rootName;
    }

    // not fluent
    public void addChild(String childName, String childText) {
        HtmlElement e = new HtmlElement(childName, childText);
        root.elements.add(e);
    }

    // fluent
    public HtmlBuilder addChildFluent(String childName, String childText) {
        HtmlElement e = new HtmlElement(childName, childText);
        root.elements.add(e);
        return this;
    }

    public void clear() {
        root = new HtmlElement();
        root.name = rootName;
    }

    // delegating
    @Override
    public String toString() {
        return root.toString();
    }
}
