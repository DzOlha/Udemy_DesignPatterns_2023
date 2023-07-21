package creational.builder.codeBuilderTask.model;

import java.util.ArrayList;

public class Item {
    public String visibility = "public", type, property;
    public ArrayList<Item> items = new ArrayList<>();

    public Item() {
    }

    public Item(String type, String property) {
        this.type = type;
        this.property = property;
    }
}
