package behavioral.visitor.examples.intrusiveVisitor.expression.impl;

import behavioral.visitor.examples.intrusiveVisitor.expression.Expression;

public class DoubleExpression extends Expression {
    private double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    @Override
    public void print(StringBuilder sb) {
        sb.append(value);
    }
}
