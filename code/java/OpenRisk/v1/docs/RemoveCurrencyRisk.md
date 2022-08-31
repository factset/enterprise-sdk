

# RemoveCurrencyRisk

Controls removal (or not) of the contribution of currency to risk. **Note:** If this input is not provided in the request, then currency risk will be removed automatically based upon asset type when valid 'assetTypes' are specified in the request.

## oneOf schemas
* [Boolean](Boolean.md)
* [java.util.Map<String, Boolean>](java.util.Map<String, Boolean>.md)

## Example
```java
// Import classes:
import com.factset.sdk.OpenRisk.models.RemoveCurrencyRisk;
import com.factset.sdk.OpenRisk.models.Boolean;
import com.factset.sdk.OpenRisk.models.java.util.Map<String, Boolean>;

public class Example {
    public static void main(String[] args) {
        RemoveCurrencyRisk exampleRemoveCurrencyRisk = new RemoveCurrencyRisk();

        // create a new Boolean
        Boolean exampleBoolean = new Boolean();
        // set RemoveCurrencyRisk to Boolean
        exampleRemoveCurrencyRisk.setActualInstance(exampleBoolean);
        // to get back the Boolean set earlier
        Boolean testBoolean = (Boolean) exampleRemoveCurrencyRisk.getActualInstance();

        // create a new java.util.Map<String, Boolean>
        java.util.Map<String, Boolean> examplejava.util.Map<String, Boolean> = new java.util.Map<String, Boolean>();
        // set RemoveCurrencyRisk to java.util.Map<String, Boolean>
        exampleRemoveCurrencyRisk.setActualInstance(examplejava.util.Map<String, Boolean>);
        // to get back the java.util.Map<String, Boolean> set earlier
        java.util.Map<String, Boolean> testjava.util.Map<String, Boolean> = (java.util.Map<String, Boolean>) exampleRemoveCurrencyRisk.getActualInstance();
    }
}
```


