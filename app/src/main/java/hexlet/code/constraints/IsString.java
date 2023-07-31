package hexlet.code.constraints;

public class IsString implements Constraint {
    @Override
    public boolean validate(Object value) {
        return value == null || value.getClass() == String.class;
    }
}
