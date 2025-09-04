

# UnifiedResultObjectFlattenedAddl

The Key in the Key-Value pair will be the formula. If the `displayName` parameter is used, then the Key will be displayName specified for that formula. The Value in the Key-Value pair will be the result of the formula for that \"row\". 

## oneOf schemas
* [Double](Double.md)
* [Integer](Integer.md)
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import com.factset.sdk.Formula.models.UnifiedResultObjectFlattenedAddl;
import com.factset.sdk.Formula.models.Double;
import com.factset.sdk.Formula.models.Integer;
import com.factset.sdk.Formula.models.String;

public class Example {
    public static void main(String[] args) {
        UnifiedResultObjectFlattenedAddl exampleUnifiedResultObjectFlattenedAddl = new UnifiedResultObjectFlattenedAddl();

        // create a new Double
        Double exampleDouble = new Double();
        // set UnifiedResultObjectFlattenedAddl to Double
        exampleUnifiedResultObjectFlattenedAddl.setActualInstance(exampleDouble);
        // to get back the Double set earlier
        Double testDouble = (Double) exampleUnifiedResultObjectFlattenedAddl.getActualInstance();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set UnifiedResultObjectFlattenedAddl to Integer
        exampleUnifiedResultObjectFlattenedAddl.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleUnifiedResultObjectFlattenedAddl.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set UnifiedResultObjectFlattenedAddl to String
        exampleUnifiedResultObjectFlattenedAddl.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleUnifiedResultObjectFlattenedAddl.getActualInstance();
    }
}
```


