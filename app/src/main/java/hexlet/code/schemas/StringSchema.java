package hexlet.code.schemas;

public final class StringSchema extends BaseSchema {
    public StringSchema() {
        addCheck("isString", value -> value == null || value.getClass() == String.class);
    }
    public StringSchema required() {
        addCheck("required", value -> !(value == null
                || value instanceof String && ((String) value).isEmpty()));
        return this;
    }
    public StringSchema minLength(int minLength) {
        addCheck("minLength", value -> ((String) value).length() >= minLength);
        return this;
    }
    public StringSchema contains(String str) {
        addCheck("contains", value -> ((String) value).contains(str));
        return this;
    }
}
