class FibonacciProgression extends Progression {
    private long prev;

    FibonacciProgression(long first, long second) {
        super(first);
    }

    @Override
    long next() {
        long temp = prev;
        prev = current;
        current += temp;
        return current;
    }
}
