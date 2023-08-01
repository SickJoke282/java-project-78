package hexlet.code.constraints.stringschema;

import hexlet.code.constraints.Constraint;

public final class MinLength implements Constraint {
    private final int minLen;
    public MinLength(int length) {
        this.minLen = length;
    }
    @Override
    public boolean validate(Object value) {
        return value.toString().length() >= minLen;
    }
}
