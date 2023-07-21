package creational.builder.examples.recursiveGenerics.builder;

public class EmployeeBuilder
        extends PersonBuilder<EmployeeBuilder> {
    public EmployeeBuilder worksAs(String position) {
        person.position = position;
        return self();
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}
