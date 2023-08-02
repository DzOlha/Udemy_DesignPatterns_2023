package structural.proxy.codeProxyTask;

import structural.proxy.codeProxyTask.proxy.ResponsiblePerson;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person(13);
        System.out.println(person.drink());
        System.out.println(person.drive());
        System.out.println(person.drinkAndDrive());

        System.out.println("-------------------------------");
        ResponsiblePerson rp = new ResponsiblePerson(person);
        System.out.println(rp.drink());
        System.out.println(rp.drive());
        System.out.println(rp.drinkAndDrive());
    }
}
