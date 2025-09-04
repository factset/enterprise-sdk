

# TimeSeriesResponseObjectItems

## anyOf schemas
* [TimeSeriesResultObjectNonflattened](TimeSeriesResultObjectNonflattened.md)
* [UnifiedResultObjectFlattened](UnifiedResultObjectFlattened.md)

## Example
```java
// Import classes:
import com.factset.sdk.Formula.models.TimeSeriesResponseObjectItems;
import com.factset.sdk.Formula.models.TimeSeriesResultObjectNonflattened;
import com.factset.sdk.Formula.models.UnifiedResultObjectFlattened;

public class Example {
    public static void main(String[] args) {
        TimeSeriesResponseObjectItems exampleTimeSeriesResponseObjectItems = new TimeSeriesResponseObjectItems();

        // create a new TimeSeriesResultObjectNonflattened
        TimeSeriesResultObjectNonflattened exampleTimeSeriesResultObjectNonflattened = new TimeSeriesResultObjectNonflattened();
        // set TimeSeriesResponseObjectItems to TimeSeriesResultObjectNonflattened
        exampleTimeSeriesResponseObjectItems.setActualInstance(exampleTimeSeriesResultObjectNonflattened);
        // to get back the TimeSeriesResultObjectNonflattened set earlier
        TimeSeriesResultObjectNonflattened testTimeSeriesResultObjectNonflattened = (TimeSeriesResultObjectNonflattened) exampleTimeSeriesResponseObjectItems.getActualInstance();

        // create a new UnifiedResultObjectFlattened
        UnifiedResultObjectFlattened exampleUnifiedResultObjectFlattened = new UnifiedResultObjectFlattened();
        // set TimeSeriesResponseObjectItems to UnifiedResultObjectFlattened
        exampleTimeSeriesResponseObjectItems.setActualInstance(exampleUnifiedResultObjectFlattened);
        // to get back the UnifiedResultObjectFlattened set earlier
        UnifiedResultObjectFlattened testUnifiedResultObjectFlattened = (UnifiedResultObjectFlattened) exampleTimeSeriesResponseObjectItems.getActualInstance();
    }
}
```


