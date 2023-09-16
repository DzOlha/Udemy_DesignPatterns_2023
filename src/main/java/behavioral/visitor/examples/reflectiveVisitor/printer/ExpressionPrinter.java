package behavioral.visitor.examples.reflectiveVisitor.printer;

import behavioral.visitor.examples.reflectiveVisitor.expression.Expression;
import behavioral.visitor.examples.reflectiveVisitor.expression.impl.AdditionExpression;
import behavioral.visitor.examples.reflectiveVisitor.expression.impl.DoubleExpression;

// separation of concerns
public class ExpressionPrinter {
    public static void print(Expression e, StringBuilder sb) {
        if (e.getClass() == DoubleExpression.class) {
            sb.append(((DoubleExpression) e).value);
        } else if (e.getClass() == AdditionExpression.class) {
            AdditionExpression ae = (AdditionExpression) e;
            sb.append("(");
            print(ae.left, sb);
            sb.append("+");
            print(ae.right, sb);
            sb.append(")");
        }
    }
}
