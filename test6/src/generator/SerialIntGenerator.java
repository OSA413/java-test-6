package generator;

public class SerialIntGenerator implements IntGenerator{
    private static int positive = 0;
    private static int negative = 0;

    @Override
    public int nextPositive() {
        return ++positive;
    }

    @Override
    public int nextNegative() {
        return --negative;
    }
}
