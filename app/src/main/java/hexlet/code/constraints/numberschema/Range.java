package hexlet.code.constraints.numberschema;

import hexlet.code.constraints.Constraint;

public final class Range implements Constraint {
    private final int lowBound;
    private final int topBound;
    public Range(int low, int top) {
        this.lowBound = low;
        this.topBound = top;
    }
    @Override
    public boolean validate(Object value) {
        return (int) value >= lowBound && (int) value <= topBound;
    }
}
