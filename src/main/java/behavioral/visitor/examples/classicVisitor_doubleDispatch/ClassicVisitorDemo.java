package behavioral.visitor.examples.classicVisitor_doubleDispatch;


import behavioral.visitor.examples.classicVisitor_doubleDispatch.expression.impl.AdditionExpression;
import behavioral.visitor.examples.classicVisitor_doubleDispatch.expression.impl.DoubleExpression;
import behavioral.visitor.examples.classicVisitor_doubleDispatch.visitor.impl.ExpressionCalculator;
import behavioral.visitor.examples.classicVisitor_doubleDispatch.visitor.impl.ExpressionPrinter;

class ClassicVisitorDemo
{
    public static void main(String[] args)
    {
        // 1+(2+3)
        AdditionExpression e = new AdditionExpression(
                new DoubleExpression(1),
                new AdditionExpression(
                        new DoubleExpression(2),
                        new DoubleExpression(3)
                ));
        ExpressionPrinter ep = new ExpressionPrinter();
        ep.visit(e);
        System.out.println(ep);

        ExpressionCalculator calc = new ExpressionCalculator();
        calc.visit(e);
        System.out.println(ep + " = " + calc.result);
    }
}
