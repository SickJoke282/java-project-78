package hexlet.code.constraints.mapschema;

import hexlet.code.constraints.Constraint;
import hexlet.code.schemas.BaseSchema;

import java.util.HashMap;
import java.util.Map;

public final class Shape implements Constraint {
    private final Map<String, BaseSchema> schemas;
    public Shape(Map<String, BaseSchema> schemas) {
        this.schemas = schemas;
    }
    @Override
    public boolean validate(Object value) {
        for (Map.Entry<String, Object> entry: ((HashMap<String, Object>) value).entrySet()) {
            if (!schemas.get(entry.getKey()).isValid(entry.getValue())) {
                return false;
            }
        }
        return true;
    }
}
