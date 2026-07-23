

# BatchResult

## oneOf schemas
* [MarketValue](MarketValue.md)
* [Price](Price.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetPrices.models.BatchResult;
import com.factset.sdk.FactSetPrices.models.MarketValue;
import com.factset.sdk.FactSetPrices.models.Price;

public class Example {
    public static void main(String[] args) {
        BatchResult exampleBatchResult = new BatchResult();

        // create a new MarketValue
        MarketValue exampleMarketValue = new MarketValue();
        // set BatchResult to MarketValue
        exampleBatchResult.setActualInstance(exampleMarketValue);
        // to get back the MarketValue set earlier
        MarketValue testMarketValue = (MarketValue) exampleBatchResult.getActualInstance();

        // create a new Price
        Price examplePrice = new Price();
        // set BatchResult to Price
        exampleBatchResult.setActualInstance(examplePrice);
        // to get back the Price set earlier
        Price testPrice = (Price) exampleBatchResult.getActualInstance();
    }
}
```


