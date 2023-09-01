package behavioral.state.examples.springStateMachine.model;

// plural because SSM defines a class called State already
public enum States {
    OFF_HOOK, // starting
    ON_HOOK, // terminal
    CONNECTING,
    CONNECTED,
    ON_HOLD
}
