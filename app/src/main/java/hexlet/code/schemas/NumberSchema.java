package hexlet.code.schemas;

import hexlet.code.constraints.numberschema.IsNumber;
import hexlet.code.constraints.numberschema.Positive;
import hexlet.code.constraints.Required;
import hexlet.code.constraints.numberschema.Range;

public final class NumberSchema extends BaseSchema {
    public NumberSchema() {
        addConstraints(new IsNumber());
    }
    public NumberSchema required() {
        addConstraints(new Required());
        return this;
    }
    public NumberSchema positive() {
        addConstraints(new Positive());
        return this;
    }
    public NumberSchema range(int lowBound, int topBound) {
        addConstraints(new Range(lowBound, topBound));
        return this;
    }
}
