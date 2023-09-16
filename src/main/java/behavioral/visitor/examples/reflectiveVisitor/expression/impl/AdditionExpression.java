package behavioral.visitor.examples.reflectiveVisitor.expression.impl;

import behavioral.visitor.examples.reflectiveVisitor.expression.Expression;

public class AdditionExpression extends Expression {
    public Expression left, right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
