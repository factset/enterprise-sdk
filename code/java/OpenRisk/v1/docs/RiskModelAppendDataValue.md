

# RiskModelAppendDataValue

Value for field at respective integer key index

## oneOf schemas
* [BigDecimal](BigDecimal.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.factset.sdk.OpenRisk.models.RiskModelAppendDataValue;
import com.factset.sdk.OpenRisk.models.BigDecimal;
import com.factset.sdk.OpenRisk.models.String;

public class Example {
    public static void main(String[] args) {
        RiskModelAppendDataValue exampleRiskModelAppendDataValue = new RiskModelAppendDataValue();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set RiskModelAppendDataValue to BigDecimal
        exampleRiskModelAppendDataValue.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleRiskModelAppendDataValue.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set RiskModelAppendDataValue to String
        exampleRiskModelAppendDataValue.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleRiskModelAppendDataValue.getActualInstance();
    }
}
```


