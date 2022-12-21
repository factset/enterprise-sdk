

# OneOfQuantUniverse

## oneOf schemas
* [QuantIdentifierUniverse](QuantIdentifierUniverse.md)
* [QuantScreeningExpressionUniverse](QuantScreeningExpressionUniverse.md)
* [QuantUniversalScreenUniverse](QuantUniversalScreenUniverse.md)

## Example
```java
// Import classes:
import com.factset.sdk.QuantEngine.models.OneOfQuantUniverse;
import com.factset.sdk.QuantEngine.models.QuantIdentifierUniverse;
import com.factset.sdk.QuantEngine.models.QuantScreeningExpressionUniverse;
import com.factset.sdk.QuantEngine.models.QuantUniversalScreenUniverse;

public class Example {
    public static void main(String[] args) {
        OneOfQuantUniverse exampleOneOfQuantUniverse = new OneOfQuantUniverse();

        // create a new QuantIdentifierUniverse
        QuantIdentifierUniverse exampleQuantIdentifierUniverse = new QuantIdentifierUniverse();
        // set OneOfQuantUniverse to QuantIdentifierUniverse
        exampleOneOfQuantUniverse.setActualInstance(exampleQuantIdentifierUniverse);
        // to get back the QuantIdentifierUniverse set earlier
        QuantIdentifierUniverse testQuantIdentifierUniverse = (QuantIdentifierUniverse) exampleOneOfQuantUniverse.getActualInstance();

        // create a new QuantScreeningExpressionUniverse
        QuantScreeningExpressionUniverse exampleQuantScreeningExpressionUniverse = new QuantScreeningExpressionUniverse();
        // set OneOfQuantUniverse to QuantScreeningExpressionUniverse
        exampleOneOfQuantUniverse.setActualInstance(exampleQuantScreeningExpressionUniverse);
        // to get back the QuantScreeningExpressionUniverse set earlier
        QuantScreeningExpressionUniverse testQuantScreeningExpressionUniverse = (QuantScreeningExpressionUniverse) exampleOneOfQuantUniverse.getActualInstance();

        // create a new QuantUniversalScreenUniverse
        QuantUniversalScreenUniverse exampleQuantUniversalScreenUniverse = new QuantUniversalScreenUniverse();
        // set OneOfQuantUniverse to QuantUniversalScreenUniverse
        exampleOneOfQuantUniverse.setActualInstance(exampleQuantUniversalScreenUniverse);
        // to get back the QuantUniversalScreenUniverse set earlier
        QuantUniversalScreenUniverse testQuantUniversalScreenUniverse = (QuantUniversalScreenUniverse) exampleOneOfQuantUniverse.getActualInstance();
    }
}
```


