package behavioral.observer.examples.eventClass;

class Demo
{
    public static void main(String [] args)
    {
        Person person = new Person();
        Event<PropertyChangedEventArgs>.Subscription sub =
                person.propertyChanged.addHandler(x -> {
                    System.out.println("Person's "
                            + x.propertyName + " has changed");
                });
        person.setAge(17);
        person.setAge(18);
        sub.close();
        person.setAge(19);
    }
}
