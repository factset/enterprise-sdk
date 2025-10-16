

# SegmentValue

Value of the data metric requested. Note that the type of value is `object`, and depending on the data metric requested, the value could be an object representation of a `string` or `double`.

## oneOf schemas
* [Double](Double.md)
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import com.factset.sdk.FactSetFundamentals.models.SegmentValue;
import com.factset.sdk.FactSetFundamentals.models.Double;
import com.factset.sdk.FactSetFundamentals.models.String;

public class Example {
    public static void main(String[] args) {
        SegmentValue exampleSegmentValue = new SegmentValue();

        // create a new Double
        Double exampleDouble = new Double();
        // set SegmentValue to Double
        exampleSegmentValue.setActualInstance(exampleDouble);
        // to get back the Double set earlier
        Double testDouble = (Double) exampleSegmentValue.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set SegmentValue to String
        exampleSegmentValue.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleSegmentValue.getActualInstance();
    }
}
```


