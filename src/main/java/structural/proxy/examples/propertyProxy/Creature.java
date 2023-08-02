package structural.proxy.examples.propertyProxy;

import structural.proxy.examples.propertyProxy.proxy.Property;

public class Creature {
    private Property<Integer> agility = new Property<>(10);

    public void setAgility(Integer value) {
        // we cannot do agility = value, sadly
        agility.setValue(value);
    }

    public Integer getAgility() {
        return agility.getValue();
    }
}
