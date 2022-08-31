

# ExposureDateFormatConvention

Factor exposure matrix date.

## oneOf schemas
* [LocalDate](LocalDate.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.factset.sdk.OpenRisk.models.ExposureDateFormatConvention;
import com.factset.sdk.OpenRisk.models.LocalDate;
import com.factset.sdk.OpenRisk.models.String;

public class Example {
    public static void main(String[] args) {
        ExposureDateFormatConvention exampleExposureDateFormatConvention = new ExposureDateFormatConvention();

        // create a new LocalDate
        LocalDate exampleLocalDate = new LocalDate();
        // set ExposureDateFormatConvention to LocalDate
        exampleExposureDateFormatConvention.setActualInstance(exampleLocalDate);
        // to get back the LocalDate set earlier
        LocalDate testLocalDate = (LocalDate) exampleExposureDateFormatConvention.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set ExposureDateFormatConvention to String
        exampleExposureDateFormatConvention.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleExposureDateFormatConvention.getActualInstance();
    }
}
```


