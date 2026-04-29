

# RiskAnalyticsItem

Response item that can be one of: CreditRisk or RateRisk. The actual schema depends on the `riskType` parameter. 

## oneOf schemas
* [CreditRisk](CreditRisk.md)
* [RateRisk](RateRisk.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetFunds.models.RiskAnalyticsItem;
import com.factset.sdk.FactSetFunds.models.CreditRisk;
import com.factset.sdk.FactSetFunds.models.RateRisk;

public class Example {
    public static void main(String[] args) {
        RiskAnalyticsItem exampleRiskAnalyticsItem = new RiskAnalyticsItem();

        // create a new CreditRisk
        CreditRisk exampleCreditRisk = new CreditRisk();
        // set RiskAnalyticsItem to CreditRisk
        exampleRiskAnalyticsItem.setActualInstance(exampleCreditRisk);
        // to get back the CreditRisk set earlier
        CreditRisk testCreditRisk = (CreditRisk) exampleRiskAnalyticsItem.getActualInstance();

        // create a new RateRisk
        RateRisk exampleRateRisk = new RateRisk();
        // set RiskAnalyticsItem to RateRisk
        exampleRiskAnalyticsItem.setActualInstance(exampleRateRisk);
        // to get back the RateRisk set earlier
        RateRisk testRateRisk = (RateRisk) exampleRiskAnalyticsItem.getActualInstance();
    }
}
```


