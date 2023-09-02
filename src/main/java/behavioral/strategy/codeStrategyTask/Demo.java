package behavioral.strategy.codeStrategyTask;

import behavioral.strategy.codeStrategyTask.numbers.Complex;
import behavioral.strategy.codeStrategyTask.numbers.Pair;
import behavioral.strategy.codeStrategyTask.strategy.impl.OrdinaryDiscriminantStrategy;
import behavioral.strategy.codeStrategyTask.strategy.impl.RealDiscriminantStrategy;

public class Demo {
    public static void main(String[] args) {
        QuadraticEquationSolver ordinarySolver = new QuadraticEquationSolver(new OrdinaryDiscriminantStrategy());
        Pair<Complex, Complex> result1 =  ordinarySolver.solve(1, 1, 4);
        System.out.println(result1);

        QuadraticEquationSolver realSolver = new QuadraticEquationSolver(new RealDiscriminantStrategy());
        Pair<Complex, Complex> result2 =  realSolver.solve(1, 1, 4);
        System.out.println(result2);
    }
}
