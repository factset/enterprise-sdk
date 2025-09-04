

# BatchData

The schema for the batched result is determined by the endpoint you used with the _batch_ parameter. Please see the schema for that endpoint for the definition. 

## oneOf schemas
* [CrossSectionalResultObjectNonflattened](CrossSectionalResultObjectNonflattened.md)
* [TimeSeriesResultObjectNonflattened](TimeSeriesResultObjectNonflattened.md)
* [UnifiedResultObjectFlattened](UnifiedResultObjectFlattened.md)

## Example
```java
// Import classes:
import com.factset.sdk.Formula.models.BatchData;
import com.factset.sdk.Formula.models.CrossSectionalResultObjectNonflattened;
import com.factset.sdk.Formula.models.TimeSeriesResultObjectNonflattened;
import com.factset.sdk.Formula.models.UnifiedResultObjectFlattened;

public class Example {
    public static void main(String[] args) {
        BatchData exampleBatchData = new BatchData();

        // create a new CrossSectionalResultObjectNonflattened
        CrossSectionalResultObjectNonflattened exampleCrossSectionalResultObjectNonflattened = new CrossSectionalResultObjectNonflattened();
        // set BatchData to CrossSectionalResultObjectNonflattened
        exampleBatchData.setActualInstance(exampleCrossSectionalResultObjectNonflattened);
        // to get back the CrossSectionalResultObjectNonflattened set earlier
        CrossSectionalResultObjectNonflattened testCrossSectionalResultObjectNonflattened = (CrossSectionalResultObjectNonflattened) exampleBatchData.getActualInstance();

        // create a new TimeSeriesResultObjectNonflattened
        TimeSeriesResultObjectNonflattened exampleTimeSeriesResultObjectNonflattened = new TimeSeriesResultObjectNonflattened();
        // set BatchData to TimeSeriesResultObjectNonflattened
        exampleBatchData.setActualInstance(exampleTimeSeriesResultObjectNonflattened);
        // to get back the TimeSeriesResultObjectNonflattened set earlier
        TimeSeriesResultObjectNonflattened testTimeSeriesResultObjectNonflattened = (TimeSeriesResultObjectNonflattened) exampleBatchData.getActualInstance();

        // create a new UnifiedResultObjectFlattened
        UnifiedResultObjectFlattened exampleUnifiedResultObjectFlattened = new UnifiedResultObjectFlattened();
        // set BatchData to UnifiedResultObjectFlattened
        exampleBatchData.setActualInstance(exampleUnifiedResultObjectFlattened);
        // to get back the UnifiedResultObjectFlattened set earlier
        UnifiedResultObjectFlattened testUnifiedResultObjectFlattened = (UnifiedResultObjectFlattened) exampleBatchData.getActualInstance();
    }
}
```


