package hexlet.code.schemas;

import hexlet.code.constraints.Required;
import hexlet.code.constraints.mapschema.IsMap;
import hexlet.code.constraints.mapschema.Sizeof;
import hexlet.code.constraints.mapschema.Shape;

import java.util.Map;

public class MapSchema extends BaseSchema {
    public MapSchema() {
        constraints.add(new IsMap());
    }
    public MapSchema required() {
        constraints.add(new Required());
        return this;
    }
    public MapSchema sizeof(int limit) {
        constraints.add(new Sizeof(limit));
        return this;
    }
    public MapSchema shape(Map<String, BaseSchema> schemas) {
        constraints.add(new Shape(schemas));
        return this;
    }
}
