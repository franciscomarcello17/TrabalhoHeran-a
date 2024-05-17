public class Main {
    public static void main(String[] args) {
        Progression arithmetic = new ArithmeticProgression(2, 3);
        System.out.println("Progressão Aritmética:");
        for (int i = 0; i < 5; i++) {
            System.out.println(arithmetic.next());
        }

        Progression geometric = new GeometricProgression(2, 3);
        System.out.println("\nProgressão Geométrica:");
        for (int i = 0; i < 5; i++) {
            System.out.println(geometric.next());
        }

        Progression fibonacci = new FibonacciProgression(0, 1);
        System.out.println("\nProgressão de Fibonacci:");
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacci.next());
        }
    }
}
