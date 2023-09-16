package behavioral.visitor.codeVisitorTask;

import behavioral.visitor.codeVisitorTask.expression.impl.AdditionExpression;
import behavioral.visitor.codeVisitorTask.expression.impl.Value;
import behavioral.visitor.codeVisitorTask.visitor.impl.ExpressionPrinter;

import static org.junit.Assert.assertEquals;

public class Demo {
    public static void main(String[] args) {
        AdditionExpression simple = new AdditionExpression(new Value(2), new Value(3));
        ExpressionPrinter ep = new ExpressionPrinter();
        ep.visit(simple);
        System.out.println(ep.toString());
        assertEquals("(2+3)", ep.toString());
    }
}
