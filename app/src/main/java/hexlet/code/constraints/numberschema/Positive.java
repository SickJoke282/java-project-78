package hexlet.code.constraints.numberschema;

import hexlet.code.constraints.Constraint;

public final class Positive implements Constraint {
    @Override
    public boolean validate(Object value) {
        return value == null || (int) value > 0;
    }
}
