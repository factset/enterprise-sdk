

# FundamentalValue

Value of the data metric requested. Note that the type of value is 'object', and depending on the data metric requested, the value could be an object representation of a string or double. 

## oneOf schemas
* [Double](Double.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetFundamentals.models.FundamentalValue;
import com.factset.sdk.FactSetFundamentals.models.Double;
import com.factset.sdk.FactSetFundamentals.models.String;

public class Example {
    public static void main(String[] args) {
        FundamentalValue exampleFundamentalValue = new FundamentalValue();

        // create a new Double
        Double exampleDouble = new Double();
        // set FundamentalValue to Double
        exampleFundamentalValue.setActualInstance(exampleDouble);
        // to get back the Double set earlier
        Double testDouble = (Double) exampleFundamentalValue.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set FundamentalValue to String
        exampleFundamentalValue.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleFundamentalValue.getActualInstance();
    }
}
```


