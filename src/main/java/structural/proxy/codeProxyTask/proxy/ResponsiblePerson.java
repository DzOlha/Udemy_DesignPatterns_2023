package structural.proxy.codeProxyTask.proxy;

import structural.proxy.codeProxyTask.Person;

public class ResponsiblePerson {
    private Person person;
    private final String ageWarning = "too young";
    private final String dead = "dead";

    public ResponsiblePerson(Person person) {
        this.person = person;
    }

    public void setAge(int age) {
        person.setAge(age);
    }

    public int getAge() {
        return person.getAge();
    }

    public String drink() {
        if (getAge() >= 18) {
            return person.drink();
        } else
            return ageWarning;
    }

    public String drive() {
        if (getAge() >= 16) {
            return person.drive();
        } else
            return ageWarning;
    }

    public String drinkAndDrive() {
        return dead;
    }
}
