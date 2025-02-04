package behavioral.visitor.examples.classicVisitor_doubleDispatch.visitor.impl;

import behavioral.visitor.examples.classicVisitor_doubleDispatch.expression.impl.AdditionExpression;
import behavioral.visitor.examples.classicVisitor_doubleDispatch.expression.impl.DoubleExpression;
import behavioral.visitor.examples.classicVisitor_doubleDispatch.visitor.ExpressionVisitor;

// separation of concerns
public class ExpressionPrinter implements ExpressionVisitor {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void visit(DoubleExpression e) {
        sb.append(e.value);
    }

    @Override
    public void visit(AdditionExpression e) {
        sb.append("(");
        e.left.accept(this);
        sb.append("+");
        e.right.accept(this);
        sb.append(")");
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
