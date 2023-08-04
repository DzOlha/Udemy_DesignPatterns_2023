package behavioral.interpreter.codeInterpreterTask.parser.element.impl;

import behavioral.interpreter.codeInterpreterTask.parser.element.Element;

public class IntegerElement implements Element {
    public int value;

    public IntegerElement(int value) {
        this.value = value;
    }

    @Override
    public int eval() {
        return value;
    }
}
