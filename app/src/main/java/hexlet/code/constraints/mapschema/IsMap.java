package hexlet.code.constraints.mapschema;

import hexlet.code.constraints.Constraint;

import java.util.HashMap;

public class IsMap implements Constraint {
    @Override
    public boolean validate(Object value) {
        return value == null || value.getClass() == HashMap.class;
    }
}
