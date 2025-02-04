package behavioral.visitor.examples.classicVisitor_doubleDispatch.visitor.impl;

import behavioral.visitor.examples.classicVisitor_doubleDispatch.expression.impl.AdditionExpression;
import behavioral.visitor.examples.classicVisitor_doubleDispatch.expression.impl.DoubleExpression;
import behavioral.visitor.examples.classicVisitor_doubleDispatch.visitor.ExpressionVisitor;

public class ExpressionCalculator implements ExpressionVisitor {
    public double result;

    @Override
    public void visit(DoubleExpression e) {
        result = e.value;
    }

    @Override
    public void visit(AdditionExpression e) // this is a test too
    {
        e.left.accept(this);
        double a = result;
        e.right.accept(this);
        double b = result;
        result = a + b; // this is a test
    }
}
