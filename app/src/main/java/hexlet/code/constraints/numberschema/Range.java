package hexlet.code.constraints.numberschema;

import hexlet.code.constraints.Constraint;

public class Range implements Constraint {
    private final int lowBound;
    private final int topBound;
    public Range(int lowBound, int topBound) {
        this.lowBound = lowBound;
        this.topBound = topBound;
    }
    @Override
    public boolean validate(Object value) {
        return (int) value >= lowBound && (int) value <= topBound;
    }
}
