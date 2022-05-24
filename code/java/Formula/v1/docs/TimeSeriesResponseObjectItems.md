

# TimeSeriesResponseObjectItems

## anyOf schemas
* [TimeSeriesResultObjectFlattened](TimeSeriesResultObjectFlattened.md)
* [TimeSeriesResultObjectNonflattened](TimeSeriesResultObjectNonflattened.md)

## Example
```java
// Import classes:
import com.factset.sdk.Formula.models.TimeSeriesResponseObjectItems;
import com.factset.sdk.Formula.models.TimeSeriesResultObjectFlattened;
import com.factset.sdk.Formula.models.TimeSeriesResultObjectNonflattened;

public class Example {
    public static void main(String[] args) {
        TimeSeriesResponseObjectItems exampleTimeSeriesResponseObjectItems = new TimeSeriesResponseObjectItems();

        // create a new TimeSeriesResultObjectFlattened
        TimeSeriesResultObjectFlattened exampleTimeSeriesResultObjectFlattened = new TimeSeriesResultObjectFlattened();
        // set TimeSeriesResponseObjectItems to TimeSeriesResultObjectFlattened
        exampleTimeSeriesResponseObjectItems.setActualInstance(exampleTimeSeriesResultObjectFlattened);
        // to get back the TimeSeriesResultObjectFlattened set earlier
        TimeSeriesResultObjectFlattened testTimeSeriesResultObjectFlattened = (TimeSeriesResultObjectFlattened) exampleTimeSeriesResponseObjectItems.getActualInstance();

        // create a new TimeSeriesResultObjectNonflattened
        TimeSeriesResultObjectNonflattened exampleTimeSeriesResultObjectNonflattened = new TimeSeriesResultObjectNonflattened();
        // set TimeSeriesResponseObjectItems to TimeSeriesResultObjectNonflattened
        exampleTimeSeriesResponseObjectItems.setActualInstance(exampleTimeSeriesResultObjectNonflattened);
        // to get back the TimeSeriesResultObjectNonflattened set earlier
        TimeSeriesResultObjectNonflattened testTimeSeriesResultObjectNonflattened = (TimeSeriesResultObjectNonflattened) exampleTimeSeriesResponseObjectItems.getActualInstance();
    }
}
```


