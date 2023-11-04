import equation.QuadraticEquation;
import generator.IntGenerator;
import generator.RandomIntGenerator;
import generator.SerialIntGenerator;
import generator.TimeDependentIntGenerator;

public class Main {
    public static void demoQuadraticEquation() {
        QuadraticEquation[] list = new QuadraticEquation[] {
                new QuadraticEquation(46, 81, 13),
                new QuadraticEquation(0, 81, 13),
                new QuadraticEquation(46, 0, 13),
                new QuadraticEquation(46, 81, 0),
                new QuadraticEquation(46, 0, 0),
                new QuadraticEquation(0, 81, 0),
                new QuadraticEquation(0, 0, 13),
        };

        for (QuadraticEquation q : list) {
            System.out.println(q.toString() + " (isQuadratic: " + q.isQuadratic() + ")");
        }
    }

    public static void demoIntGenerator() {
        IntGenerator[] list = new IntGenerator[] {
                new RandomIntGenerator(),
                new SerialIntGenerator(),
                new TimeDependentIntGenerator()
        };

        for (IntGenerator g : list) {
            System.out.println(g.getName());
            for (int i = 0; i < 7; i++)
                System.out.print(g.nextPositive() + " ");
            System.out.println();
            for (int i = 0; i < 7; i++)
                System.out.print(g.nextNegative() + " ");
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        demoQuadraticEquation();
        System.out.println("\n\n");
        demoIntGenerator();
    }
}