

# PatchOperationValue

The content that should be added or replaced in a PATCH operation. This is required for \"add\" and \"replace\" operations and is not applicable for \"remove\" operations.

## anyOf schemas
* [BigDecimal](BigDecimal.md)
* [Boolean](Boolean.md)
* [Object](Object.md)
* [String](String.md)
* [java.util.List<Object>](java.util.List<Object>.md)

## Example
```java
// Import classes:
import com.factset.sdk.ProcuretoPayAPISCIM.models.PatchOperationValue;
import com.factset.sdk.ProcuretoPayAPISCIM.models.BigDecimal;
import com.factset.sdk.ProcuretoPayAPISCIM.models.Boolean;
import com.factset.sdk.ProcuretoPayAPISCIM.models.Object;
import com.factset.sdk.ProcuretoPayAPISCIM.models.String;
import com.factset.sdk.ProcuretoPayAPISCIM.models.java.util.List<Object>;

public class Example {
    public static void main(String[] args) {
        PatchOperationValue examplePatchOperationValue = new PatchOperationValue();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set PatchOperationValue to BigDecimal
        examplePatchOperationValue.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) examplePatchOperationValue.getActualInstance();

        // create a new Boolean
        Boolean exampleBoolean = new Boolean();
        // set PatchOperationValue to Boolean
        examplePatchOperationValue.setActualInstance(exampleBoolean);
        // to get back the Boolean set earlier
        Boolean testBoolean = (Boolean) examplePatchOperationValue.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set PatchOperationValue to Object
        examplePatchOperationValue.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) examplePatchOperationValue.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set PatchOperationValue to String
        examplePatchOperationValue.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) examplePatchOperationValue.getActualInstance();

        // create a new java.util.List<Object>
        java.util.List<Object> examplejava.util.List<Object> = new java.util.List<Object>();
        // set PatchOperationValue to java.util.List<Object>
        examplePatchOperationValue.setActualInstance(examplejava.util.List<Object>);
        // to get back the java.util.List<Object> set earlier
        java.util.List<Object> testjava.util.List<Object> = (java.util.List<Object>) examplePatchOperationValue.getActualInstance();
    }
}
```


