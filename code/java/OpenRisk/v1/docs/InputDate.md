

# InputDate

Date of risk model and holdings data to fetch and use. For the use of Relative Date argument, refer to [OA:1964](https://my.apps.factset.com/oa/pages/1964#rel). Ignored only for composite asset definitions provided as inputs via 'compositeAssets' field.

## oneOf schemas
* [LocalDate](LocalDate.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.factset.sdk.OpenRisk.models.InputDate;
import com.factset.sdk.OpenRisk.models.LocalDate;
import com.factset.sdk.OpenRisk.models.String;

public class Example {
    public static void main(String[] args) {
        InputDate exampleInputDate = new InputDate();

        // create a new LocalDate
        LocalDate exampleLocalDate = new LocalDate();
        // set InputDate to LocalDate
        exampleInputDate.setActualInstance(exampleLocalDate);
        // to get back the LocalDate set earlier
        LocalDate testLocalDate = (LocalDate) exampleInputDate.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set InputDate to String
        exampleInputDate.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleInputDate.getActualInstance();
    }
}
```


