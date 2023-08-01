package hexlet.code.schemas;

import hexlet.code.constraints.numberschema.IsNumber;
import hexlet.code.constraints.numberschema.Positive;
import hexlet.code.constraints.Required;
import hexlet.code.constraints.numberschema.Range;

public class NumberSchema extends BaseSchema {
    public NumberSchema() {
        constraints.add(new IsNumber());
    }
    public NumberSchema required() {
        constraints.add(new Required());
        return this;
    }
    public NumberSchema positive() {
        constraints.add(new Positive());
        return this;
    }
    public NumberSchema range(int lowBound, int topBound) {
        constraints.add(new Range(lowBound, topBound));
        return this;
    }
}
