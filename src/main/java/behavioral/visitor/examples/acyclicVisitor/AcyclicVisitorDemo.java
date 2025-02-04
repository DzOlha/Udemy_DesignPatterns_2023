package behavioral.visitor.examples.acyclicVisitor;

// really creepy implementation of acyclic visitor
import behavioral.visitor.examples.acyclicVisitor.expression.impl.AdditionExpression;
import behavioral.visitor.examples.acyclicVisitor.expression.impl.DoubleExpression;
import behavioral.visitor.examples.acyclicVisitor.visitor.extend.impl.ExpressionPrinter;

class AcyclicVisitorDemo
{
    public static void main(String[] args) {
        AdditionExpression e = new AdditionExpression(
                new DoubleExpression(1),
                new AdditionExpression(
                        new DoubleExpression(2),
                        new DoubleExpression(3)
                )
        );
        ExpressionPrinter ep = new ExpressionPrinter();
        ep.visit(e);
        System.out.println(ep.toString());
    }
}