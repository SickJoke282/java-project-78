package hexlet.code.constraints.stringschema;

import hexlet.code.constraints.Constraint;

public class Contains implements Constraint {
    private final String expected;
    public Contains(String expected) {
        this.expected = expected;
    }
    @Override
    public boolean validate(Object value) {
        return value.toString().contains(expected);
    }
}
