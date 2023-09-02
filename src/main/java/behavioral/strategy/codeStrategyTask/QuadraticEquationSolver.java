package behavioral.strategy.codeStrategyTask;

import behavioral.strategy.codeStrategyTask.numbers.Complex;
import behavioral.strategy.codeStrategyTask.numbers.Pair;
import behavioral.strategy.codeStrategyTask.strategy.DiscriminantStrategy;

import static java.lang.Double.NaN;
import static java.lang.Math.sqrt;

public class QuadraticEquationSolver {
    private DiscriminantStrategy strategy;

    public QuadraticEquationSolver(DiscriminantStrategy strategy) {
        this.strategy = strategy;
    }

    public Pair<Complex, Complex> solve(double a, double b, double c) {
        double D = strategy.calculateDiscriminant(a, b, c);
        double real = -b / (2 * a);
        double img = sqrt(D) / (2 * a);

        if (D == NaN) {
            return new Pair<>(new Complex(NaN, NaN), new Complex(NaN, NaN));
        } else {
            if (D < 0) {
                double imag = sqrt(-D) / (2 * a);
                Complex x1 = new Complex(real, imag);
                Complex x2 = new Complex(real, -imag);

                return new Pair<>(x1, x2);
            }
            Complex x1 = new Complex(real + img, 0);
            Complex x2 = new Complex(real - img, 0);

            return new Pair<>(x1, x2);
        }
    }
}
