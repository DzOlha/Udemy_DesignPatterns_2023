package behavioral.visitor.examples.acyclicVisitor.visitor.extend.impl;

import behavioral.visitor.examples.acyclicVisitor.expression.impl.AdditionExpression;
import behavioral.visitor.examples.acyclicVisitor.expression.impl.DoubleExpression;
import behavioral.visitor.examples.acyclicVisitor.visitor.extend.AdditionExpressionVisitor;
import behavioral.visitor.examples.acyclicVisitor.visitor.extend.DoubleExpressionVisitor;

public class ExpressionPrinter implements
        DoubleExpressionVisitor,
        AdditionExpressionVisitor {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void visit(DoubleExpression obj) {
        sb.append(obj.value);
    }

    @Override
    public void visit(AdditionExpression obj) {
        sb.append('(');
        obj.left.accept(this);
        sb.append('+');
        obj.right.accept(this);
        sb.append(')');
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
