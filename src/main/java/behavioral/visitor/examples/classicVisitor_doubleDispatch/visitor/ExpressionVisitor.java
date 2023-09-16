package behavioral.visitor.examples.classicVisitor_doubleDispatch.visitor;

import behavioral.visitor.examples.classicVisitor_doubleDispatch.expression.impl.AdditionExpression;
import behavioral.visitor.examples.classicVisitor_doubleDispatch.expression.impl.DoubleExpression;

public interface ExpressionVisitor {
    void visit(DoubleExpression e);

    void visit(AdditionExpression e);
}
