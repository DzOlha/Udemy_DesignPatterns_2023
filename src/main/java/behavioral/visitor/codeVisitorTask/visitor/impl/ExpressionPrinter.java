package behavioral.visitor.codeVisitorTask.visitor.impl;


import behavioral.visitor.codeVisitorTask.expression.impl.AdditionExpression;
import behavioral.visitor.codeVisitorTask.expression.impl.MultiplicationExpression;
import behavioral.visitor.codeVisitorTask.expression.impl.Value;
import behavioral.visitor.codeVisitorTask.visitor.ExpressionVisitor;

public class ExpressionPrinter extends ExpressionVisitor {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void visit(Value value) {
        sb.append(value);
    }

    @Override
    public void visit(AdditionExpression ae) {
        sb.append("(");
        ae.lhs.accept(this);
        sb.append("+");
        ae.rhs.accept(this);
        sb.append(")");
    }

    @Override
    public void visit(MultiplicationExpression me) {
        me.lhs.accept(this);
        sb.append("*");
        me.rhs.accept(this);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
