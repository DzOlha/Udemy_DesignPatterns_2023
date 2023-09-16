package behavioral.visitor.codeVisitorTask.expression.impl;

import behavioral.visitor.codeVisitorTask.visitor.ExpressionVisitor;
import behavioral.visitor.codeVisitorTask.expression.Expression;

public class MultiplicationExpression extends Expression {
    public Expression lhs, rhs;

    public MultiplicationExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public void accept(ExpressionVisitor ev) {
        ev.visit(this);
    }
}
