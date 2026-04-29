

# PortfolioAnalyticsItem

Response item that can be one of: AssetAllocation or SectorWeightage. The actual schema depends on the `analyticsType` parameter. 

## oneOf schemas
* [AssetAllocation](AssetAllocation.md)
* [GeographicRevenue](GeographicRevenue.md)
* [MarketCapitalization](MarketCapitalization.md)
* [SectorWeightage](SectorWeightage.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetFunds.models.PortfolioAnalyticsItem;
import com.factset.sdk.FactSetFunds.models.AssetAllocation;
import com.factset.sdk.FactSetFunds.models.GeographicRevenue;
import com.factset.sdk.FactSetFunds.models.MarketCapitalization;
import com.factset.sdk.FactSetFunds.models.SectorWeightage;

public class Example {
    public static void main(String[] args) {
        PortfolioAnalyticsItem examplePortfolioAnalyticsItem = new PortfolioAnalyticsItem();

        // create a new AssetAllocation
        AssetAllocation exampleAssetAllocation = new AssetAllocation();
        // set PortfolioAnalyticsItem to AssetAllocation
        examplePortfolioAnalyticsItem.setActualInstance(exampleAssetAllocation);
        // to get back the AssetAllocation set earlier
        AssetAllocation testAssetAllocation = (AssetAllocation) examplePortfolioAnalyticsItem.getActualInstance();

        // create a new GeographicRevenue
        GeographicRevenue exampleGeographicRevenue = new GeographicRevenue();
        // set PortfolioAnalyticsItem to GeographicRevenue
        examplePortfolioAnalyticsItem.setActualInstance(exampleGeographicRevenue);
        // to get back the GeographicRevenue set earlier
        GeographicRevenue testGeographicRevenue = (GeographicRevenue) examplePortfolioAnalyticsItem.getActualInstance();

        // create a new MarketCapitalization
        MarketCapitalization exampleMarketCapitalization = new MarketCapitalization();
        // set PortfolioAnalyticsItem to MarketCapitalization
        examplePortfolioAnalyticsItem.setActualInstance(exampleMarketCapitalization);
        // to get back the MarketCapitalization set earlier
        MarketCapitalization testMarketCapitalization = (MarketCapitalization) examplePortfolioAnalyticsItem.getActualInstance();

        // create a new SectorWeightage
        SectorWeightage exampleSectorWeightage = new SectorWeightage();
        // set PortfolioAnalyticsItem to SectorWeightage
        examplePortfolioAnalyticsItem.setActualInstance(exampleSectorWeightage);
        // to get back the SectorWeightage set earlier
        SectorWeightage testSectorWeightage = (SectorWeightage) examplePortfolioAnalyticsItem.getActualInstance();
    }
}
```


