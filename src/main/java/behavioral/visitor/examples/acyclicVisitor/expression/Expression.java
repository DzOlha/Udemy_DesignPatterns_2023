package behavioral.visitor.examples.acyclicVisitor.expression;

import behavioral.visitor.examples.acyclicVisitor.visitor.extend.ExpressionVisitor;
import behavioral.visitor.examples.acyclicVisitor.visitor.Visitor;

public abstract class Expression {
    // optional
    public void accept(Visitor visitor) {
        if (visitor instanceof ExpressionVisitor) {
            ((ExpressionVisitor) visitor).visit(this);
        }
    }
}
