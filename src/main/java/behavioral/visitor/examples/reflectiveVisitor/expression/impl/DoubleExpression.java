package behavioral.visitor.examples.reflectiveVisitor.expression.impl;

import behavioral.visitor.examples.reflectiveVisitor.expression.Expression;

public class DoubleExpression extends Expression {
    public double value;

    public DoubleExpression(double value) {
        this.value = value;
    }
}
