package behavioral.chainOfResponsibility.examples.brokerChain.model;

import behavioral.chainOfResponsibility.examples.brokerChain.query.Query;

public class Game {
    public Event<Query> queries = new Event<>();
}
