package hexlet.code.constraints;

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
