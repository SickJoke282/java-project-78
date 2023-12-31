package hexlet.code.schemas;

import java.util.Objects;

public final class NumberSchema extends BaseSchema {
    public NumberSchema() {
        addCheck("isNumber", value -> value == null || value.getClass() == Integer.class);
    }
    public NumberSchema required() {
        addCheck("required", Objects::nonNull);
        return this;
    }
    public NumberSchema positive() {
        addCheck("positive", value -> value == null || (int) value > 0);
        return this;
    }
    public NumberSchema range(int lowBound, int topBound) {
        addCheck("range", value -> (int) value >= lowBound && (int) value <= topBound);
        return this;
    }
}
