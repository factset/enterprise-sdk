

# StringOrNumberTagValue

## oneOf schemas
* [BigDecimal](BigDecimal.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.factset.sdk.AnalyticsDatastore.models.StringOrNumberTagValue;
import com.factset.sdk.AnalyticsDatastore.models.BigDecimal;
import com.factset.sdk.AnalyticsDatastore.models.String;

public class Example {
    public static void main(String[] args) {
        StringOrNumberTagValue exampleStringOrNumberTagValue = new StringOrNumberTagValue();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set StringOrNumberTagValue to BigDecimal
        exampleStringOrNumberTagValue.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleStringOrNumberTagValue.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set StringOrNumberTagValue to String
        exampleStringOrNumberTagValue.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleStringOrNumberTagValue.getActualInstance();
    }
}
```


