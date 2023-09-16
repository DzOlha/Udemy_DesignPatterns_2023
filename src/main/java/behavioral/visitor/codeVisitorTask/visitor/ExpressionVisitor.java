package behavioral.visitor.codeVisitorTask.visitor;

import behavioral.visitor.codeVisitorTask.expression.impl.AdditionExpression;
import behavioral.visitor.codeVisitorTask.expression.impl.MultiplicationExpression;
import behavioral.visitor.codeVisitorTask.expression.impl.Value;

public abstract class ExpressionVisitor {
    abstract public void visit(Value value);

    abstract public void visit(AdditionExpression ae);

    abstract public void visit(MultiplicationExpression me);
}
