package hexlet.code.schemas;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class MapSchema extends BaseSchema {
    public MapSchema() {
        addCheck("isMap", value -> value == null || value.getClass() == HashMap.class);
    }
    public MapSchema required() {
        addCheck("required", Objects::nonNull);
        return this;
    }
    public MapSchema sizeof(int limit) {
        addCheck("sizeof", value -> ((HashMap<?, ?>) value).size() == limit);
        return this;
    }
    public MapSchema shape(Map<String, BaseSchema> schemas) {
        addCheck("shape", value -> {
            for (Map.Entry<String, Object> entry: ((HashMap<String, Object>) value).entrySet()) {
                if (!schemas.get(entry.getKey()).isValid(entry.getValue())) {
                    return false;
                }
            }
            return true;
        });
        return this;
    }
}
