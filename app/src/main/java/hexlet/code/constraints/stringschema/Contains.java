package hexlet.code.constraints.stringschema;

import hexlet.code.constraints.Constraint;

public final class Contains implements Constraint {
    private final String expected;
    public Contains(String substring) {
        this.expected = substring;
    }
    @Override
    public boolean validate(Object value) {
        return value.toString().contains(expected);
    }
}
