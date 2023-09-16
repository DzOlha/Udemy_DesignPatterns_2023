package behavioral.visitor.examples.acyclicVisitor.expression.impl;

import behavioral.visitor.examples.acyclicVisitor.expression.Expression;
import behavioral.visitor.examples.acyclicVisitor.visitor.Visitor;
import behavioral.visitor.examples.acyclicVisitor.visitor.extend.AdditionExpressionVisitor;

public class AdditionExpression extends Expression {
    public Expression left, right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void accept(Visitor visitor) {
        if (visitor instanceof AdditionExpressionVisitor) {
            ((AdditionExpressionVisitor) visitor).visit(this);
        }
    }
}
