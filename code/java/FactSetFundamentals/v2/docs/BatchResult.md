

# BatchResult

## oneOf schemas
* [Fundamental](Fundamental.md)
* [FundamentalsPITData](FundamentalsPITData.md)
* [PeriodInfo](PeriodInfo.md)
* [Segment](Segment.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetFundamentals.models.BatchResult;
import com.factset.sdk.FactSetFundamentals.models.Fundamental;
import com.factset.sdk.FactSetFundamentals.models.FundamentalsPITData;
import com.factset.sdk.FactSetFundamentals.models.PeriodInfo;
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

        // create a new FundamentalsPITData
        FundamentalsPITData exampleFundamentalsPITData = new FundamentalsPITData();
        // set BatchResult to FundamentalsPITData
        exampleBatchResult.setActualInstance(exampleFundamentalsPITData);
        // to get back the FundamentalsPITData set earlier
        FundamentalsPITData testFundamentalsPITData = (FundamentalsPITData) exampleBatchResult.getActualInstance();

        // create a new PeriodInfo
        PeriodInfo examplePeriodInfo = new PeriodInfo();
        // set BatchResult to PeriodInfo
        exampleBatchResult.setActualInstance(examplePeriodInfo);
        // to get back the PeriodInfo set earlier
        PeriodInfo testPeriodInfo = (PeriodInfo) exampleBatchResult.getActualInstance();

        // create a new Segment
        Segment exampleSegment = new Segment();
        // set BatchResult to Segment
        exampleBatchResult.setActualInstance(exampleSegment);
        // to get back the Segment set earlier
        Segment testSegment = (Segment) exampleBatchResult.getActualInstance();
    }
}
```


