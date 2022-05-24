

# DataPointMeta

## anyOf schemas
* [DataPointMetaAnyOf](DataPointMetaAnyOf.md)

## Example
```java
// Import classes:
import com.factset.sdk.OverviewReportBuilder.models.DataPointMeta;
import com.factset.sdk.OverviewReportBuilder.models.DataPointMetaAnyOf;

public class Example {
    public static void main(String[] args) {
        DataPointMeta exampleDataPointMeta = new DataPointMeta();

        // create a new DataPointMetaAnyOf
        DataPointMetaAnyOf exampleDataPointMetaAnyOf = new DataPointMetaAnyOf();
        // set DataPointMeta to DataPointMetaAnyOf
        exampleDataPointMeta.setActualInstance(exampleDataPointMetaAnyOf);
        // to get back the DataPointMetaAnyOf set earlier
        DataPointMetaAnyOf testDataPointMetaAnyOf = (DataPointMetaAnyOf) exampleDataPointMeta.getActualInstance();
    }
}
```


