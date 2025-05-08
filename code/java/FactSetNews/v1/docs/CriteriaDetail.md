

# CriteriaDetail

## oneOf schemas
* [String](String.md)
* [java.util.List<BigDecimal>](java.util.List<BigDecimal>.md)
* [java.util.List<String>](java.util.List<String>.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetNews.models.CriteriaDetail;
import com.factset.sdk.FactSetNews.models.String;
import com.factset.sdk.FactSetNews.models.java.util.List<BigDecimal>;
import com.factset.sdk.FactSetNews.models.java.util.List<String>;

public class Example {
    public static void main(String[] args) {
        CriteriaDetail exampleCriteriaDetail = new CriteriaDetail();

        // create a new String
        String exampleString = new String();
        // set CriteriaDetail to String
        exampleCriteriaDetail.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleCriteriaDetail.getActualInstance();

        // create a new java.util.List<BigDecimal>
        java.util.List<BigDecimal> examplejava.util.List<BigDecimal> = new java.util.List<BigDecimal>();
        // set CriteriaDetail to java.util.List<BigDecimal>
        exampleCriteriaDetail.setActualInstance(examplejava.util.List<BigDecimal>);
        // to get back the java.util.List<BigDecimal> set earlier
        java.util.List<BigDecimal> testjava.util.List<BigDecimal> = (java.util.List<BigDecimal>) exampleCriteriaDetail.getActualInstance();

        // create a new java.util.List<String>
        java.util.List<String> examplejava.util.List<String> = new java.util.List<String>();
        // set CriteriaDetail to java.util.List<String>
        exampleCriteriaDetail.setActualInstance(examplejava.util.List<String>);
        // to get back the java.util.List<String> set earlier
        java.util.List<String> testjava.util.List<String> = (java.util.List<String>) exampleCriteriaDetail.getActualInstance();
    }
}
```


