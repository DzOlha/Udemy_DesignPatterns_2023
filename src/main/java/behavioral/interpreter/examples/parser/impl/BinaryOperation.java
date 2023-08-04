package behavioral.interpreter.examples.parser.impl;

import behavioral.interpreter.examples.parser.Element;
import behavioral.interpreter.examples.parser.OperationType;

public class BinaryOperation implements Element {
    public OperationType type;
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
