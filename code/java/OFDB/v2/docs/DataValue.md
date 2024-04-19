

# DataValue

## oneOf schemas
* [Double](Double.md)
* [Integer](Integer.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.factset.sdk.OFDB.models.DataValue;
import com.factset.sdk.OFDB.models.Double;
import com.factset.sdk.OFDB.models.Integer;
import com.factset.sdk.OFDB.models.String;

public class Example {
    public static void main(String[] args) {
        DataValue exampleDataValue = new DataValue();

        // create a new Double
        Double exampleDouble = new Double();
        // set DataValue to Double
        exampleDataValue.setActualInstance(exampleDouble);
        // to get back the Double set earlier
        Double testDouble = (Double) exampleDataValue.getActualInstance();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set DataValue to Integer
        exampleDataValue.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleDataValue.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set DataValue to String
        exampleDataValue.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleDataValue.getActualInstance();
    }
}
```


