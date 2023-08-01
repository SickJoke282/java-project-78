package hexlet.code;

import hexlet.code.constraints.Constraint;
import hexlet.code.constraints.IsString;
import hexlet.code.constraints.MinLength;
import hexlet.code.constraints.Required;
import hexlet.code.constraints.Contains;

import java.util.ArrayList;
import java.util.List;

public class StringSchema {
    List<Constraint> constraints = new ArrayList<>();
    StringSchema() {
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
    public boolean isValid(Object value) {
        for (Constraint constraint: constraints) {
            if (!constraint.validate(value)) {
                return false;
            }
        }
        return true;
    }
}
