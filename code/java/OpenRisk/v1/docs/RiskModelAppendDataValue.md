

# RiskModelAppendDataValue

Value for field at respective integer key index

## oneOf schemas
* [Double](Double.md)
* [Integer](Integer.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.factset.sdk.OpenRisk.models.RiskModelAppendDataValue;
import com.factset.sdk.OpenRisk.models.Double;
import com.factset.sdk.OpenRisk.models.Integer;
import com.factset.sdk.OpenRisk.models.String;

public class Example {
    public static void main(String[] args) {
        RiskModelAppendDataValue exampleRiskModelAppendDataValue = new RiskModelAppendDataValue();

        // create a new Double
        Double exampleDouble = new Double();
        // set RiskModelAppendDataValue to Double
        exampleRiskModelAppendDataValue.setActualInstance(exampleDouble);
        // to get back the Double set earlier
        Double testDouble = (Double) exampleRiskModelAppendDataValue.getActualInstance();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set RiskModelAppendDataValue to Integer
        exampleRiskModelAppendDataValue.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleRiskModelAppendDataValue.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set RiskModelAppendDataValue to String
        exampleRiskModelAppendDataValue.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleRiskModelAppendDataValue.getActualInstance();
    }
}
```


