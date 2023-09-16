package behavioral.visitor.examples.acyclicVisitor.visitor.extend;

import behavioral.visitor.examples.acyclicVisitor.expression.impl.DoubleExpression;
import behavioral.visitor.examples.acyclicVisitor.visitor.Visitor;

public interface DoubleExpressionVisitor extends Visitor {
    void visit(DoubleExpression obj);
}
