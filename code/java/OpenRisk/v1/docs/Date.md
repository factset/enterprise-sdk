

# Date

Date of risk model and holdings data to fetch and use. For the use of Relative Date argument, refer to [OA:1964](https://my.apps.factset.com/oa/pages/1964#rel). Ignored only for composite asset definitions provided as inputs via 'compositeAssets' field.

## oneOf schemas
* [LocalDate](LocalDate.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.factset.sdk.OpenRisk.models.Date;
import com.factset.sdk.OpenRisk.models.LocalDate;
import com.factset.sdk.OpenRisk.models.String;

public class Example {
    public static void main(String[] args) {
        Date exampleDate = new Date();

        // create a new LocalDate
        LocalDate exampleLocalDate = new LocalDate();
        // set Date to LocalDate
        exampleDate.setActualInstance(exampleLocalDate);
        // to get back the LocalDate set earlier
        LocalDate testLocalDate = (LocalDate) exampleDate.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set Date to String
        exampleDate.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleDate.getActualInstance();
    }
}
```


