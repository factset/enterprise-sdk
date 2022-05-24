

# TimeSeriesResultObjectFlattenedAddl

The Key in the Key-Value pair will be the formula. If the `displayName` parameter is used, then the Key will be displayName specified for that formula. The Value in the Key-Value pair will be the result of the formula for that \"row\". 

## oneOf schemas
* [Double](Double.md)
* [Integer](Integer.md)
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import com.factset.sdk.Formula.models.TimeSeriesResultObjectFlattenedAddl;
import com.factset.sdk.Formula.models.Double;
import com.factset.sdk.Formula.models.Integer;
import com.factset.sdk.Formula.models.String;

public class Example {
    public static void main(String[] args) {
        TimeSeriesResultObjectFlattenedAddl exampleTimeSeriesResultObjectFlattenedAddl = new TimeSeriesResultObjectFlattenedAddl();

        // create a new Double
        Double exampleDouble = new Double();
        // set TimeSeriesResultObjectFlattenedAddl to Double
        exampleTimeSeriesResultObjectFlattenedAddl.setActualInstance(exampleDouble);
        // to get back the Double set earlier
        Double testDouble = (Double) exampleTimeSeriesResultObjectFlattenedAddl.getActualInstance();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set TimeSeriesResultObjectFlattenedAddl to Integer
        exampleTimeSeriesResultObjectFlattenedAddl.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleTimeSeriesResultObjectFlattenedAddl.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set TimeSeriesResultObjectFlattenedAddl to String
        exampleTimeSeriesResultObjectFlattenedAddl.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleTimeSeriesResultObjectFlattenedAddl.getActualInstance();
    }
}
```


