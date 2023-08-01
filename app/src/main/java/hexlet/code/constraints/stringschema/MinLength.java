package hexlet.code.constraints.stringschema;

import hexlet.code.constraints.Constraint;

public class MinLength implements Constraint {
    private final int minLen;
    public MinLength(int minLen) {
        this.minLen = minLen;
    }
    @Override
    public boolean validate(Object value) {
        return value.toString().length() >= minLen;
    }
}
