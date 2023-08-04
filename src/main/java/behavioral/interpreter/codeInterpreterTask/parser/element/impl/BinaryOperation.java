package behavioral.interpreter.codeInterpreterTask.parser.element.impl;

import behavioral.interpreter.codeInterpreterTask.parser.element.Element;

public class BinaryOperation implements Element {
    public enum OperationType {
        ADDITION,
        SUBTRACTION
    }

    public BinaryOperation.OperationType type;
    public Element left, right;

    @Override
    public int eval() {
        switch (type) {
            case ADDITION:
                return left.eval() + right.eval();
            case SUBTRACTION:
                return left.eval() - right.eval();
            default:
                return 0;
        }
    }
}
