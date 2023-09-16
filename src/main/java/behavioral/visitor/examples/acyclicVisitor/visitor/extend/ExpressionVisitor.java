package behavioral.visitor.examples.acyclicVisitor.visitor.extend;

import behavioral.visitor.examples.acyclicVisitor.expression.Expression;
import behavioral.visitor.examples.acyclicVisitor.visitor.Visitor;

public interface ExpressionVisitor extends Visitor {
    void visit(Expression obj);
}
