

# ErrorDetail

## oneOf schemas
* [Object](Object.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.factset.sdk.OPENOPTIMIZER.models.ErrorDetail;
import com.factset.sdk.OPENOPTIMIZER.models.Object;
import com.factset.sdk.OPENOPTIMIZER.models.String;

public class Example {
    public static void main(String[] args) {
        ErrorDetail exampleErrorDetail = new ErrorDetail();

        // create a new Object
        Object exampleObject = new Object();
        // set ErrorDetail to Object
        exampleErrorDetail.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleErrorDetail.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set ErrorDetail to String
        exampleErrorDetail.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleErrorDetail.getActualInstance();
    }
}
```


