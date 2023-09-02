package behavioral.strategy.codeStrategyTask.strategy.impl;

import behavioral.strategy.codeStrategyTask.strategy.DiscriminantStrategy;

import static java.lang.Double.NaN;

public class RealDiscriminantStrategy implements DiscriminantStrategy {
    @Override
    public double calculateDiscriminant(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            return NaN;
        }
        return discriminant;
    }
}
