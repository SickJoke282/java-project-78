package hexlet.code.constraints.stringschema;

import hexlet.code.constraints.Constraint;

public class IsString implements Constraint {
    @Override
    public boolean validate(Object value) {
        return value == null || value.getClass() == String.class;
    }
}
