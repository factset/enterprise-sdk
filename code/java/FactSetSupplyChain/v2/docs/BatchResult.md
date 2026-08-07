

# BatchResult

Batch Response object

## oneOf schemas
* [Relationships](Relationships.md)
* [SupplyChain](SupplyChain.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetSupplyChain.models.BatchResult;
import com.factset.sdk.FactSetSupplyChain.models.Relationships;
import com.factset.sdk.FactSetSupplyChain.models.SupplyChain;

public class Example {
    public static void main(String[] args) {
        BatchResult exampleBatchResult = new BatchResult();

        // create a new Relationships
        Relationships exampleRelationships = new Relationships();
        // set BatchResult to Relationships
        exampleBatchResult.setActualInstance(exampleRelationships);
        // to get back the Relationships set earlier
        Relationships testRelationships = (Relationships) exampleBatchResult.getActualInstance();

        // create a new SupplyChain
        SupplyChain exampleSupplyChain = new SupplyChain();
        // set BatchResult to SupplyChain
        exampleBatchResult.setActualInstance(exampleSupplyChain);
        // to get back the SupplyChain set earlier
        SupplyChain testSupplyChain = (SupplyChain) exampleBatchResult.getActualInstance();
    }
}
```


