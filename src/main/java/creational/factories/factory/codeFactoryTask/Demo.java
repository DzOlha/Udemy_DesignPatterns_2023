package creational.factories.factory.codeFactoryTask;

public class Demo {
    public static void main(String[] args) {
        PersonFactory factory = new PersonFactory();
        Person me = factory.createPerson("Olha");
        System.out.println(me.id);

        Person you = factory.createPerson("Jane");
        System.out.println(you.id);
    }
}
