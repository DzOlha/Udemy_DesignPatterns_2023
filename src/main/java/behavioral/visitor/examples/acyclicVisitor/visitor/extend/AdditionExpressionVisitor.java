package behavioral.visitor.examples.acyclicVisitor.visitor.extend;

import behavioral.visitor.examples.acyclicVisitor.expression.impl.AdditionExpression;
import behavioral.visitor.examples.acyclicVisitor.visitor.Visitor;

public interface AdditionExpressionVisitor extends Visitor {
    void visit(AdditionExpression obj);
}
