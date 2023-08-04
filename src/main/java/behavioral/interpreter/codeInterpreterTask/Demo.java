package behavioral.interpreter.codeInterpreterTask;

public class Demo {
    public static void main(String[] args) {
        ExpressionProcessor ep = new ExpressionProcessor();
        ep.variables.put('x', 3);

        //should return 6
        System.out.println("1+2+3 = " + ep.calculate("1+2+3"));

        //should return 0
        System.out.println("1+2+xy = " + ep.calculate("1+2+xy"));

        //when x=3 is in variables should return 5
        System.out.println("10-2-x = " + ep.calculate("10-2-x"));
    }
}
