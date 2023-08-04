package behavioral.interpreter.codeInterpreterTask.parser.element.impl;

import behavioral.interpreter.codeInterpreterTask.parser.element.Element;

public class Zero implements Element {
    @Override
    public int eval() {
        return 0;
    }
}
