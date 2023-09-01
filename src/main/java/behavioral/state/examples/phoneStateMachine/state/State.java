package behavioral.state.examples.phoneStateMachine.state;

public enum State {
    OFF_HOOK, // starting state
    ON_HOOK,// terminal state -> the end one
    CONNECTING,
    CONNECTED,
    ON_HOLD
}
