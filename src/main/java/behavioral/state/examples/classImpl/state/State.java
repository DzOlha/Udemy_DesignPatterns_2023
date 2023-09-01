package behavioral.state.examples.classImpl.state;

import behavioral.state.examples.classImpl.LightSwitch;

public class State {
    public void on(LightSwitch ls) {
        System.out.println("Light is already on!");
    }
    public void off(LightSwitch ls) {
        System.out.println("Light is already off!");
    }
}
