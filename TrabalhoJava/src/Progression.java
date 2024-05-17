abstract class Progression {
    protected long current;
    Progression(long start) {
        current = start;
    }

    abstract long next();

    void reset() {
        current = 0;
    }

    long getCurrent() {
        return current;
    }
}


