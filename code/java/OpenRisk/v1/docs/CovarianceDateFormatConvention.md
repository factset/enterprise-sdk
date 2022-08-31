

# CovarianceDateFormatConvention

Factor covariance matrix date.

## oneOf schemas
* [LocalDate](LocalDate.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.factset.sdk.OpenRisk.models.CovarianceDateFormatConvention;
import com.factset.sdk.OpenRisk.models.LocalDate;
import com.factset.sdk.OpenRisk.models.String;

public class Example {
    public static void main(String[] args) {
        CovarianceDateFormatConvention exampleCovarianceDateFormatConvention = new CovarianceDateFormatConvention();

        // create a new LocalDate
        LocalDate exampleLocalDate = new LocalDate();
        // set CovarianceDateFormatConvention to LocalDate
        exampleCovarianceDateFormatConvention.setActualInstance(exampleLocalDate);
        // to get back the LocalDate set earlier
        LocalDate testLocalDate = (LocalDate) exampleCovarianceDateFormatConvention.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set CovarianceDateFormatConvention to String
        exampleCovarianceDateFormatConvention.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleCovarianceDateFormatConvention.getActualInstance();
    }
}
```


