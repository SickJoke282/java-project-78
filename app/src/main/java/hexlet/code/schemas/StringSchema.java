package hexlet.code.schemas;

import hexlet.code.constraints.stringschema.IsString;
import hexlet.code.constraints.stringschema.MinLength;
import hexlet.code.constraints.Required;
import hexlet.code.constraints.stringschema.Contains;

public class StringSchema extends BaseSchema {
    public StringSchema() {
        constraints.add(new IsString());
    }
    public StringSchema required() {
        constraints.add(new Required());
        return this;
    }
    public StringSchema minLength(int minLength) {
        constraints.add(new MinLength(minLength));
        return this;
    }
    public StringSchema contains(String str) {
        constraints.add(new Contains(str));
        return this;
    }
}
