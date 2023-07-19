package builder.codeBuilderTask.builder;

import builder.codeBuilderTask.model.Item;

public class CodeBuilder {
    private final Item root = new Item();

    public CodeBuilder(String className) {
        root.type = "class";
        root.property = className;
    }

    public CodeBuilder addField(String name, String type) {
        Item item = new Item(type, name);
        root.items.add(item);
        return this;
    }

    @Override
    public String toString() {
        String result = root.visibility + " " + root.type + " " + root.property + "\n{\n";
        for (Item i : root.items) {
            result += "  " + i.visibility + " " + i.type + " " + i.property + ";\n";
        }
        result += "}";
        return result;
    }
}
