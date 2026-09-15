

# MarketDataRequestData

Market data query parameters. The `category` field selects the record shape returned. 

## oneOf schemas
* [MarketDataDemandData](MarketDataDemandData.md)
* [MarketDataGenerationData](MarketDataGenerationData.md)
* [MarketDataInterchangeData](MarketDataInterchangeData.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetPowerUtilities.models.MarketDataRequestData;
import com.factset.sdk.FactSetPowerUtilities.models.MarketDataDemandData;
import com.factset.sdk.FactSetPowerUtilities.models.MarketDataGenerationData;
import com.factset.sdk.FactSetPowerUtilities.models.MarketDataInterchangeData;

public class Example {
    public static void main(String[] args) {
        MarketDataRequestData exampleMarketDataRequestData = new MarketDataRequestData();

        // create a new MarketDataDemandData
        MarketDataDemandData exampleMarketDataDemandData = new MarketDataDemandData();
        // set MarketDataRequestData to MarketDataDemandData
        exampleMarketDataRequestData.setActualInstance(exampleMarketDataDemandData);
        // to get back the MarketDataDemandData set earlier
        MarketDataDemandData testMarketDataDemandData = (MarketDataDemandData) exampleMarketDataRequestData.getActualInstance();

        // create a new MarketDataGenerationData
        MarketDataGenerationData exampleMarketDataGenerationData = new MarketDataGenerationData();
        // set MarketDataRequestData to MarketDataGenerationData
        exampleMarketDataRequestData.setActualInstance(exampleMarketDataGenerationData);
        // to get back the MarketDataGenerationData set earlier
        MarketDataGenerationData testMarketDataGenerationData = (MarketDataGenerationData) exampleMarketDataRequestData.getActualInstance();

        // create a new MarketDataInterchangeData
        MarketDataInterchangeData exampleMarketDataInterchangeData = new MarketDataInterchangeData();
        // set MarketDataRequestData to MarketDataInterchangeData
        exampleMarketDataRequestData.setActualInstance(exampleMarketDataInterchangeData);
        // to get back the MarketDataInterchangeData set earlier
        MarketDataInterchangeData testMarketDataInterchangeData = (MarketDataInterchangeData) exampleMarketDataRequestData.getActualInstance();
    }
}
```


