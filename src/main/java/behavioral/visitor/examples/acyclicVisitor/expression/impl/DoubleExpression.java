package behavioral.visitor.examples.acyclicVisitor.expression.impl;

import behavioral.visitor.examples.acyclicVisitor.visitor.extend.ExpressionVisitor;
import behavioral.visitor.examples.acyclicVisitor.expression.Expression;
import behavioral.visitor.examples.acyclicVisitor.visitor.Visitor;

public class DoubleExpression extends Expression {
    public double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    @Override
    public void accept(Visitor visitor) {
        if (visitor instanceof ExpressionVisitor) {
            ((ExpressionVisitor) visitor).visit(this);
        }
    }
}
