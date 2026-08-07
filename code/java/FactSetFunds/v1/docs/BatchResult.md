

# BatchResult

## oneOf schemas
* [GroupHolding](GroupHolding.md)
* [MarketAggregate](MarketAggregate.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetFunds.models.BatchResult;
import com.factset.sdk.FactSetFunds.models.GroupHolding;
import com.factset.sdk.FactSetFunds.models.MarketAggregate;

public class Example {
    public static void main(String[] args) {
        BatchResult exampleBatchResult = new BatchResult();

        // create a new GroupHolding
        GroupHolding exampleGroupHolding = new GroupHolding();
        // set BatchResult to GroupHolding
        exampleBatchResult.setActualInstance(exampleGroupHolding);
        // to get back the GroupHolding set earlier
        GroupHolding testGroupHolding = (GroupHolding) exampleBatchResult.getActualInstance();

        // create a new MarketAggregate
        MarketAggregate exampleMarketAggregate = new MarketAggregate();
        // set BatchResult to MarketAggregate
        exampleBatchResult.setActualInstance(exampleMarketAggregate);
        // to get back the MarketAggregate set earlier
        MarketAggregate testMarketAggregate = (MarketAggregate) exampleBatchResult.getActualInstance();
    }
}
```


