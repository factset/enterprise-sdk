

# OneOfQuantFormulas

## oneOf schemas
* [QuantAllUniversalScreenParameters](QuantAllUniversalScreenParameters.md)
* [QuantFqlExpression](QuantFqlExpression.md)
* [QuantScreeningExpression](QuantScreeningExpression.md)
* [QuantUniversalScreenParameter](QuantUniversalScreenParameter.md)

## Example
```java
// Import classes:
import com.factset.sdk.QuantEngine.models.OneOfQuantFormulas;
import com.factset.sdk.QuantEngine.models.QuantAllUniversalScreenParameters;
import com.factset.sdk.QuantEngine.models.QuantFqlExpression;
import com.factset.sdk.QuantEngine.models.QuantScreeningExpression;
import com.factset.sdk.QuantEngine.models.QuantUniversalScreenParameter;

public class Example {
    public static void main(String[] args) {
        OneOfQuantFormulas exampleOneOfQuantFormulas = new OneOfQuantFormulas();

        // create a new QuantAllUniversalScreenParameters
        QuantAllUniversalScreenParameters exampleQuantAllUniversalScreenParameters = new QuantAllUniversalScreenParameters();
        // set OneOfQuantFormulas to QuantAllUniversalScreenParameters
        exampleOneOfQuantFormulas.setActualInstance(exampleQuantAllUniversalScreenParameters);
        // to get back the QuantAllUniversalScreenParameters set earlier
        QuantAllUniversalScreenParameters testQuantAllUniversalScreenParameters = (QuantAllUniversalScreenParameters) exampleOneOfQuantFormulas.getActualInstance();

        // create a new QuantFqlExpression
        QuantFqlExpression exampleQuantFqlExpression = new QuantFqlExpression();
        // set OneOfQuantFormulas to QuantFqlExpression
        exampleOneOfQuantFormulas.setActualInstance(exampleQuantFqlExpression);
        // to get back the QuantFqlExpression set earlier
        QuantFqlExpression testQuantFqlExpression = (QuantFqlExpression) exampleOneOfQuantFormulas.getActualInstance();

        // create a new QuantScreeningExpression
        QuantScreeningExpression exampleQuantScreeningExpression = new QuantScreeningExpression();
        // set OneOfQuantFormulas to QuantScreeningExpression
        exampleOneOfQuantFormulas.setActualInstance(exampleQuantScreeningExpression);
        // to get back the QuantScreeningExpression set earlier
        QuantScreeningExpression testQuantScreeningExpression = (QuantScreeningExpression) exampleOneOfQuantFormulas.getActualInstance();

        // create a new QuantUniversalScreenParameter
        QuantUniversalScreenParameter exampleQuantUniversalScreenParameter = new QuantUniversalScreenParameter();
        // set OneOfQuantFormulas to QuantUniversalScreenParameter
        exampleOneOfQuantFormulas.setActualInstance(exampleQuantUniversalScreenParameter);
        // to get back the QuantUniversalScreenParameter set earlier
        QuantUniversalScreenParameter testQuantUniversalScreenParameter = (QuantUniversalScreenParameter) exampleOneOfQuantFormulas.getActualInstance();
    }
}
```


