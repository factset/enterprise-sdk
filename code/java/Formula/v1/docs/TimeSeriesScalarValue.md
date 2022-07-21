

# TimeSeriesScalarValue

The `result` attribute in the Time-Series Non-Flattened Response Object will be a SCALAR.

## oneOf schemas
* [Double](Double.md)
* [Integer](Integer.md)
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import com.factset.sdk.Formula.models.TimeSeriesScalarValue;
import com.factset.sdk.Formula.models.Double;
import com.factset.sdk.Formula.models.Integer;
import com.factset.sdk.Formula.models.String;

public class Example {
    public static void main(String[] args) {
        TimeSeriesScalarValue exampleTimeSeriesScalarValue = new TimeSeriesScalarValue();

        // create a new Double
        Double exampleDouble = new Double();
        // set TimeSeriesScalarValue to Double
        exampleTimeSeriesScalarValue.setActualInstance(exampleDouble);
        // to get back the Double set earlier
        Double testDouble = (Double) exampleTimeSeriesScalarValue.getActualInstance();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set TimeSeriesScalarValue to Integer
        exampleTimeSeriesScalarValue.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleTimeSeriesScalarValue.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set TimeSeriesScalarValue to String
        exampleTimeSeriesScalarValue.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleTimeSeriesScalarValue.getActualInstance();
    }
}
```


