package hexlet.code.constraints.numberschema;

import hexlet.code.constraints.Constraint;

public final class IsNumber implements Constraint {
    @Override
    public boolean validate(Object value) {
        return value == null || value.getClass() == Integer.class;
    }
}
