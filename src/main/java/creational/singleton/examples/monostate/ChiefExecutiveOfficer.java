package creational.singleton.examples.monostate;

// monostate is a dangerous approach cause it gives no information
// for the user that they work with singleton

// it may be useful if you would like to replace some class that is already instantiated by constructor
// in many places of the program, but you need it behaves as a singleton in fact.

public class ChiefExecutiveOfficer
{
    private static String name;
    private static int age;

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        ChiefExecutiveOfficer.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        ChiefExecutiveOfficer.age = age;
    }

    @Override
    public String toString() {
        return "ChiefExecutiveOfficer{" +
                "name='" + ChiefExecutiveOfficer.name + '\'' +
                ", age=" + ChiefExecutiveOfficer.age +
                '}';
    }
}
class Demo {
    public static void main(String[] args) {
        ChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();
        ceo.setName("Adan Smith");
        ceo.setAge(55);

        ChiefExecutiveOfficer ceo2 = new ChiefExecutiveOfficer();
        System.out.println(ceo2);
        // it is already initialized because of static name and age properties
        // which are common for all instances of the class
    }
}
