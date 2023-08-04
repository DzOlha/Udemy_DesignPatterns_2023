package behavioral.mediator.codeMediatorTask;

public class Participant {
    public String name;
    public int value = 0;
    public Mediator mediator;

    public Participant(Mediator mediator) {
        this.mediator = mediator;
        mediator.addParticipant(this);
    }

    public void say(int n) {
        mediator.broadcast(name, n);
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
