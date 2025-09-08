

# BatchResult

## anyOf schemas
* [AnnualizedDividendsObject](AnnualizedDividendsObject.md)
* [CorporateAction](CorporateAction.md)
* [MarketValueResponseObject](MarketValueResponseObject.md)
* [Price](Price.md)
* [Returns](Returns.md)
* [SharesOutstandingResponseObject](SharesOutstandingResponseObject.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetGlobalPrices.models.BatchResult;
import com.factset.sdk.FactSetGlobalPrices.models.AnnualizedDividendsObject;
import com.factset.sdk.FactSetGlobalPrices.models.CorporateAction;
import com.factset.sdk.FactSetGlobalPrices.models.MarketValueResponseObject;
import com.factset.sdk.FactSetGlobalPrices.models.Price;
import com.factset.sdk.FactSetGlobalPrices.models.Returns;
import com.factset.sdk.FactSetGlobalPrices.models.SharesOutstandingResponseObject;

public class Example {
    public static void main(String[] args) {
        BatchResult exampleBatchResult = new BatchResult();

        // create a new AnnualizedDividendsObject
        AnnualizedDividendsObject exampleAnnualizedDividendsObject = new AnnualizedDividendsObject();
        // set BatchResult to AnnualizedDividendsObject
        exampleBatchResult.setActualInstance(exampleAnnualizedDividendsObject);
        // to get back the AnnualizedDividendsObject set earlier
        AnnualizedDividendsObject testAnnualizedDividendsObject = (AnnualizedDividendsObject) exampleBatchResult.getActualInstance();

        // create a new CorporateAction
        CorporateAction exampleCorporateAction = new CorporateAction();
        // set BatchResult to CorporateAction
        exampleBatchResult.setActualInstance(exampleCorporateAction);
        // to get back the CorporateAction set earlier
        CorporateAction testCorporateAction = (CorporateAction) exampleBatchResult.getActualInstance();

        // create a new MarketValueResponseObject
        MarketValueResponseObject exampleMarketValueResponseObject = new MarketValueResponseObject();
        // set BatchResult to MarketValueResponseObject
        exampleBatchResult.setActualInstance(exampleMarketValueResponseObject);
        // to get back the MarketValueResponseObject set earlier
        MarketValueResponseObject testMarketValueResponseObject = (MarketValueResponseObject) exampleBatchResult.getActualInstance();

        // create a new Price
        Price examplePrice = new Price();
        // set BatchResult to Price
        exampleBatchResult.setActualInstance(examplePrice);
        // to get back the Price set earlier
        Price testPrice = (Price) exampleBatchResult.getActualInstance();

        // create a new Returns
        Returns exampleReturns = new Returns();
        // set BatchResult to Returns
        exampleBatchResult.setActualInstance(exampleReturns);
        // to get back the Returns set earlier
        Returns testReturns = (Returns) exampleBatchResult.getActualInstance();

        // create a new SharesOutstandingResponseObject
        SharesOutstandingResponseObject exampleSharesOutstandingResponseObject = new SharesOutstandingResponseObject();
        // set BatchResult to SharesOutstandingResponseObject
        exampleBatchResult.setActualInstance(exampleSharesOutstandingResponseObject);
        // to get back the SharesOutstandingResponseObject set earlier
        SharesOutstandingResponseObject testSharesOutstandingResponseObject = (SharesOutstandingResponseObject) exampleBatchResult.getActualInstance();
    }
}
```


