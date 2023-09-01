package behavioral.state.examples.classImpl.state.impl;

import behavioral.state.examples.classImpl.LightSwitch;
import behavioral.state.examples.classImpl.state.State;
import behavioral.state.examples.classImpl.state.impl.OffState;

public class OnState extends State {
    public OnState() {
        System.out.println("Light turned on!");
    }

    @Override
    public void off(LightSwitch ls) {
        System.out.println("Switching light off...");
        ls.setState(new OffState());
    }
}
