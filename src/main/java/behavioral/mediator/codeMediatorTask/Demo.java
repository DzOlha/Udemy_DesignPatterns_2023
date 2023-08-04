package behavioral.mediator.codeMediatorTask;

public class Demo {
    public static void main(String[] args) {
        Mediator room = new Mediator();
        Participant p1 = new Participant(room);
        p1.name = "Jane";

        Participant p2 = new Participant(room);
        p2.name = "John";

        System.out.println(room);

        p1.say(3);
        System.out.println(room);

        p2.say(2);
        System.out.println(room);
    }
}
