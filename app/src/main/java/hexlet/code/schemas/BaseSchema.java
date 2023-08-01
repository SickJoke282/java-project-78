package hexlet.code.schemas;

import hexlet.code.constraints.Constraint;

import java.util.ArrayList;
import java.util.List;

public class BaseSchema {
    List<Constraint> constraints = new ArrayList<>();
    public boolean isValid(Object value) {
        for (Constraint constraint: constraints) {
            if (!constraint.validate(value)) {
                return false;
            }
        }
        return true;
    }
}
