package generator;

public interface IntGenerator {
    int nextPositive();

    int nextNegative();

    default String getName() {
        return this.getClass().getSimpleName();
    }
}

