package generator;

public class RandomIntGenerator implements IntGenerator {
    public int roundedRandom() {
        return (int)(Math.random() * 100);
    }

    @Override
    public int nextPositive() {
        return roundedRandom() * 42;
    }

    @Override
    public int nextNegative() {
        return roundedRandom() * -82;
    }

}
