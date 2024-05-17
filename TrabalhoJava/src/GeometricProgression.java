class GeometricProgression extends Progression {
    private long base;

    GeometricProgression(long start, long base) {
        super(start);
        this.base = base;
    }

    @Override
    long next() {
        current *= base;
        return current;
    }
}
