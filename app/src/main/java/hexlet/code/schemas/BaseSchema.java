package hexlet.code.schemas;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public abstract class BaseSchema {
    protected Map<String, Predicate> checks = new HashMap<>();
    protected final void addCheck(String name, Predicate function) {
        checks.put(name, function);
    }
    public final boolean isValid(Object value) {
        for (Map.Entry<String, Predicate> entry: checks.entrySet()) {
            if (!entry.getValue().test(value)) {
                return false;
            }
        }
        return true;
    }
}
