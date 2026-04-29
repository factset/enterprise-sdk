

# TaxesAndRisksItem

Response item that can be one of: RegulationsTaxDetails, TaxExposure, or RiskMeasures. The actual schema depends on the `taxItemsType` parameter. 

## oneOf schemas
* [RegulationsTaxDetails](RegulationsTaxDetails.md)
* [RiskMeasures](RiskMeasures.md)
* [TaxExposure](TaxExposure.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetFunds.models.TaxesAndRisksItem;
import com.factset.sdk.FactSetFunds.models.RegulationsTaxDetails;
import com.factset.sdk.FactSetFunds.models.RiskMeasures;
import com.factset.sdk.FactSetFunds.models.TaxExposure;

public class Example {
    public static void main(String[] args) {
        TaxesAndRisksItem exampleTaxesAndRisksItem = new TaxesAndRisksItem();

        // create a new RegulationsTaxDetails
        RegulationsTaxDetails exampleRegulationsTaxDetails = new RegulationsTaxDetails();
        // set TaxesAndRisksItem to RegulationsTaxDetails
        exampleTaxesAndRisksItem.setActualInstance(exampleRegulationsTaxDetails);
        // to get back the RegulationsTaxDetails set earlier
        RegulationsTaxDetails testRegulationsTaxDetails = (RegulationsTaxDetails) exampleTaxesAndRisksItem.getActualInstance();

        // create a new RiskMeasures
        RiskMeasures exampleRiskMeasures = new RiskMeasures();
        // set TaxesAndRisksItem to RiskMeasures
        exampleTaxesAndRisksItem.setActualInstance(exampleRiskMeasures);
        // to get back the RiskMeasures set earlier
        RiskMeasures testRiskMeasures = (RiskMeasures) exampleTaxesAndRisksItem.getActualInstance();

        // create a new TaxExposure
        TaxExposure exampleTaxExposure = new TaxExposure();
        // set TaxesAndRisksItem to TaxExposure
        exampleTaxesAndRisksItem.setActualInstance(exampleTaxExposure);
        // to get back the TaxExposure set earlier
        TaxExposure testTaxExposure = (TaxExposure) exampleTaxesAndRisksItem.getActualInstance();
    }
}
```


