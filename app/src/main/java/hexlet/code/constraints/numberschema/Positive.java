package hexlet.code.constraints;

public class Positive implements Constraint{
    @Override
    public boolean validate(Object value) {
        return value == null || (int) value > 0;
    }
}
