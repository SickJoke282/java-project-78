package hexlet.code.constraints;

public class Required implements Constraint {
    @Override
    public boolean validate(Object value) {
        return !(value == null || value instanceof String && ((String) value).isEmpty());
    }
}
