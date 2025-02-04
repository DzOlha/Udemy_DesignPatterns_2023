package behavioral.mediator.examples.reactiveExtensionEventBroker;

class Demo
{
    public static void main(String [] args)
    {
        EventBroker broker = new EventBroker();
        FootballPlayer player = new FootballPlayer(broker, "jones");
        FootballCoach coach = new FootballCoach(broker);

        player.score();
        player.score();
        player.score();
    }
}
