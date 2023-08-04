package behavioral.mediator.codeMediatorTask;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    List<Participant> people = new ArrayList<>();

    public void broadcast(String source, int increment) {
        for (Participant person : people)
            if (!person.name.equals(source))
                person.value += increment;
    }

    public void addParticipant(Participant p) {
        people.add(p);
    }

    @Override
    public String toString() {
        return "Mediator{" +
                "people=" + people +
                '}';
    }
}
