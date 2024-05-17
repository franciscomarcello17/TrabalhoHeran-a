class ArithmeticProgression extends Progression {
    private long increment;

    ArithmeticProgression(long start, long inc) {
        super(start);
        increment = inc;
    }

    @Override
    long next() {
        current += increment;
        return current;
    }
}
