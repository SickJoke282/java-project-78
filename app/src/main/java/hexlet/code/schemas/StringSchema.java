package hexlet.code.schemas;

import hexlet.code.constraints.stringschema.IsString;
import hexlet.code.constraints.stringschema.MinLength;
import hexlet.code.constraints.Required;
import hexlet.code.constraints.stringschema.Contains;

public final class StringSchema extends BaseSchema {
    public StringSchema() {
        addConstraints(new IsString());
    }
    public StringSchema required() {
        addConstraints(new Required());
        return this;
    }
    public StringSchema minLength(int minLength) {
        addConstraints(new MinLength(minLength));
        return this;
    }
    public StringSchema contains(String str) {
        addConstraints(new Contains(str));
        return this;
    }
}
