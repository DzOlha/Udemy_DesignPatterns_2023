package behavioral.visitor.examples.classicVisitor_doubleDispatch.expression;

import behavioral.visitor.examples.classicVisitor_doubleDispatch.visitor.ExpressionVisitor;

public abstract class Expression {
    public abstract void accept(ExpressionVisitor visitor);
}
