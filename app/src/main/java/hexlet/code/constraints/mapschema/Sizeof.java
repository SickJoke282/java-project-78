package hexlet.code.constraints.mapschema;

import hexlet.code.constraints.Constraint;

import java.util.HashMap;

public class Sizeof implements Constraint {
    private final int limit;
    public Sizeof(int limit) {
        this.limit = limit;
    }
    @Override
    public boolean validate(Object value) {
        return ((HashMap<?, ?>) value).size() == limit;
    }
}
