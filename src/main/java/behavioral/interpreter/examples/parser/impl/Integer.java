package behavioral.interpreter.examples.parser.impl;

import behavioral.interpreter.examples.parser.Element;

public class Integer implements Element {
    public int value;

    public Integer(int value) {
        this.value = value;
    }

    @Override
    public int eval() {
        return value;
    }
}
