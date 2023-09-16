package behavioral.visitor.codeVisitorTask.expression;

import behavioral.visitor.codeVisitorTask.visitor.ExpressionVisitor;

public abstract class Expression {
    abstract public void accept(ExpressionVisitor ev);
}
