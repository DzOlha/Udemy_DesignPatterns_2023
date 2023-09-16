package behavioral.visitor.codeVisitorTask.expression.impl;

import behavioral.visitor.codeVisitorTask.visitor.ExpressionVisitor;
import behavioral.visitor.codeVisitorTask.expression.Expression;

public class Value extends Expression {
    public int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public void accept(ExpressionVisitor ev) {
        ev.visit(this);
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
