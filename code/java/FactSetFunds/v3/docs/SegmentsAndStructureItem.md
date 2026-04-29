

# SegmentsAndStructureItem

Response item that can be one of: Classifications, SimilarFunds, BenchmarkDetails, or FundStructure. The actual schema depends on the `structureType` parameter. 

## oneOf schemas
* [BenchmarkDetails](BenchmarkDetails.md)
* [Classifications](Classifications.md)
* [FundStructure](FundStructure.md)
* [SimilarFunds](SimilarFunds.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetFunds.models.SegmentsAndStructureItem;
import com.factset.sdk.FactSetFunds.models.BenchmarkDetails;
import com.factset.sdk.FactSetFunds.models.Classifications;
import com.factset.sdk.FactSetFunds.models.FundStructure;
import com.factset.sdk.FactSetFunds.models.SimilarFunds;

public class Example {
    public static void main(String[] args) {
        SegmentsAndStructureItem exampleSegmentsAndStructureItem = new SegmentsAndStructureItem();

        // create a new BenchmarkDetails
        BenchmarkDetails exampleBenchmarkDetails = new BenchmarkDetails();
        // set SegmentsAndStructureItem to BenchmarkDetails
        exampleSegmentsAndStructureItem.setActualInstance(exampleBenchmarkDetails);
        // to get back the BenchmarkDetails set earlier
        BenchmarkDetails testBenchmarkDetails = (BenchmarkDetails) exampleSegmentsAndStructureItem.getActualInstance();

        // create a new Classifications
        Classifications exampleClassifications = new Classifications();
        // set SegmentsAndStructureItem to Classifications
        exampleSegmentsAndStructureItem.setActualInstance(exampleClassifications);
        // to get back the Classifications set earlier
        Classifications testClassifications = (Classifications) exampleSegmentsAndStructureItem.getActualInstance();

        // create a new FundStructure
        FundStructure exampleFundStructure = new FundStructure();
        // set SegmentsAndStructureItem to FundStructure
        exampleSegmentsAndStructureItem.setActualInstance(exampleFundStructure);
        // to get back the FundStructure set earlier
        FundStructure testFundStructure = (FundStructure) exampleSegmentsAndStructureItem.getActualInstance();

        // create a new SimilarFunds
        SimilarFunds exampleSimilarFunds = new SimilarFunds();
        // set SegmentsAndStructureItem to SimilarFunds
        exampleSegmentsAndStructureItem.setActualInstance(exampleSimilarFunds);
        // to get back the SimilarFunds set earlier
        SimilarFunds testSimilarFunds = (SimilarFunds) exampleSegmentsAndStructureItem.getActualInstance();
    }
}
```


