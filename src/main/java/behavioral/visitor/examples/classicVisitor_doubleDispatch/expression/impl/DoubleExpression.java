package behavioral.visitor.examples.classicVisitor_doubleDispatch.expression.impl;

import behavioral.visitor.examples.classicVisitor_doubleDispatch.visitor.ExpressionVisitor;
import behavioral.visitor.examples.classicVisitor_doubleDispatch.expression.Expression;

public class DoubleExpression extends Expression {
    public double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
