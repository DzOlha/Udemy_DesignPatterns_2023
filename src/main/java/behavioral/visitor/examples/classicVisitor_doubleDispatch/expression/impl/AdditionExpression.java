package behavioral.visitor.examples.classicVisitor_doubleDispatch.expression.impl;

import behavioral.visitor.examples.classicVisitor_doubleDispatch.visitor.ExpressionVisitor;
import behavioral.visitor.examples.classicVisitor_doubleDispatch.expression.Expression;

public class AdditionExpression extends Expression {
    public Expression left, right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
