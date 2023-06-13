

# BatchResult

## oneOf schemas
* [Fundamental](Fundamental.md)
* [Segment](Segment.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetFundamentals.models.BatchResult;
import com.factset.sdk.FactSetFundamentals.models.Fundamental;
import com.factset.sdk.FactSetFundamentals.models.Segment;

public class Example {
    public static void main(String[] args) {
        BatchResult exampleBatchResult = new BatchResult();

        // create a new Fundamental
        Fundamental exampleFundamental = new Fundamental();
        // set BatchResult to Fundamental
        exampleBatchResult.setActualInstance(exampleFundamental);
        // to get back the Fundamental set earlier
        Fundamental testFundamental = (Fundamental) exampleBatchResult.getActualInstance();

        // create a new Segment
        Segment exampleSegment = new Segment();
        // set BatchResult to Segment
        exampleBatchResult.setActualInstance(exampleSegment);
        // to get back the Segment set earlier
        Segment testSegment = (Segment) exampleBatchResult.getActualInstance();
    }
}
```


