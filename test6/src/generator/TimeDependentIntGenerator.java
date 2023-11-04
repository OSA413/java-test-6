package generator;

public class TimeDependentIntGenerator implements IntGenerator {

    private double magicFormula() {
        double t = System.currentTimeMillis();
        int prime = 7757;
        return (t % prime) / prime * Integer.MAX_VALUE;
    }
    @Override
    public int nextPositive() {
        return (int)magicFormula();
    }

    @Override
    public int nextNegative() {
        return -(int)magicFormula();
    }
}
