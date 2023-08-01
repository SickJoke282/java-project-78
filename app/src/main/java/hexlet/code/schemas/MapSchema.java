package hexlet.code.schemas;

import hexlet.code.constraints.Required;
import hexlet.code.constraints.mapschema.IsMap;
import hexlet.code.constraints.mapschema.Sizeof;
import hexlet.code.constraints.mapschema.Shape;

import java.util.Map;

public final class MapSchema extends BaseSchema {
    public MapSchema() {
        addConstraints(new IsMap());
    }
    public MapSchema required() {
        addConstraints(new Required());
        return this;
    }
    public MapSchema sizeof(int limit) {
        addConstraints(new Sizeof(limit));
        return this;
    }
    public MapSchema shape(Map<String, BaseSchema> schemas) {
        addConstraints(new Shape(schemas));
        return this;
    }
}
