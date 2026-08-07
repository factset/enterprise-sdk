

# LiquidityValue

Value of the data metric requested. Depending on the metric, can be either a string or a numeric (double) value. 

## oneOf schemas
* [Double](Double.md)
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import com.factset.sdk.FactSetDebtCapitalStructure.models.LiquidityValue;
import com.factset.sdk.FactSetDebtCapitalStructure.models.Double;
import com.factset.sdk.FactSetDebtCapitalStructure.models.String;

public class Example {
    public static void main(String[] args) {
        LiquidityValue exampleLiquidityValue = new LiquidityValue();

        // create a new Double
        Double exampleDouble = new Double();
        // set LiquidityValue to Double
        exampleLiquidityValue.setActualInstance(exampleDouble);
        // to get back the Double set earlier
        Double testDouble = (Double) exampleLiquidityValue.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set LiquidityValue to String
        exampleLiquidityValue.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleLiquidityValue.getActualInstance();
    }
}
```


