package behavioral.visitor.codeVisitorTask.expression.impl;


import behavioral.visitor.codeVisitorTask.expression.Expression;
import behavioral.visitor.codeVisitorTask.visitor.ExpressionVisitor;

public class AdditionExpression extends Expression {
    public Expression lhs, rhs;

    public AdditionExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public void accept(ExpressionVisitor ev) {
        ev.visit(this);
    }
}
