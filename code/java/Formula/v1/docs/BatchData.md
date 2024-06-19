

# BatchData

The schema for the batched result is determined by the endpoint you used with the _batch_ parameter. Please see the schema for that endpoint for the definition. 

## anyOf schemas
* [CrossSectionalResponseObjectItems](CrossSectionalResponseObjectItems.md)
* [TimeSeriesResponseObjectItems](TimeSeriesResponseObjectItems.md)

## Example
```java
// Import classes:
import com.factset.sdk.Formula.models.BatchData;
import com.factset.sdk.Formula.models.CrossSectionalResponseObjectItems;
import com.factset.sdk.Formula.models.TimeSeriesResponseObjectItems;

public class Example {
    public static void main(String[] args) {
        BatchData exampleBatchData = new BatchData();

        // create a new CrossSectionalResponseObjectItems
        CrossSectionalResponseObjectItems exampleCrossSectionalResponseObjectItems = new CrossSectionalResponseObjectItems();
        // set BatchData to CrossSectionalResponseObjectItems
        exampleBatchData.setActualInstance(exampleCrossSectionalResponseObjectItems);
        // to get back the CrossSectionalResponseObjectItems set earlier
        CrossSectionalResponseObjectItems testCrossSectionalResponseObjectItems = (CrossSectionalResponseObjectItems) exampleBatchData.getActualInstance();

        // create a new TimeSeriesResponseObjectItems
        TimeSeriesResponseObjectItems exampleTimeSeriesResponseObjectItems = new TimeSeriesResponseObjectItems();
        // set BatchData to TimeSeriesResponseObjectItems
        exampleBatchData.setActualInstance(exampleTimeSeriesResponseObjectItems);
        // to get back the TimeSeriesResponseObjectItems set earlier
        TimeSeriesResponseObjectItems testTimeSeriesResponseObjectItems = (TimeSeriesResponseObjectItems) exampleBatchData.getActualInstance();
    }
}
```


