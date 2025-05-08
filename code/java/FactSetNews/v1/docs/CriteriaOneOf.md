

# CriteriaOneOf

## oneOf schemas
* [Criteria](Criteria.md)
* [java.util.List<Criteria>](java.util.List<Criteria>.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetNews.models.CriteriaOneOf;
import com.factset.sdk.FactSetNews.models.Criteria;
import com.factset.sdk.FactSetNews.models.java.util.List<Criteria>;

public class Example {
    public static void main(String[] args) {
        CriteriaOneOf exampleCriteriaOneOf = new CriteriaOneOf();

        // create a new Criteria
        Criteria exampleCriteria = new Criteria();
        // set CriteriaOneOf to Criteria
        exampleCriteriaOneOf.setActualInstance(exampleCriteria);
        // to get back the Criteria set earlier
        Criteria testCriteria = (Criteria) exampleCriteriaOneOf.getActualInstance();

        // create a new java.util.List<Criteria>
        java.util.List<Criteria> examplejava.util.List<Criteria> = new java.util.List<Criteria>();
        // set CriteriaOneOf to java.util.List<Criteria>
        exampleCriteriaOneOf.setActualInstance(examplejava.util.List<Criteria>);
        // to get back the java.util.List<Criteria> set earlier
        java.util.List<Criteria> testjava.util.List<Criteria> = (java.util.List<Criteria>) exampleCriteriaOneOf.getActualInstance();
    }
}
```


