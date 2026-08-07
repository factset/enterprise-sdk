

# Financial

A single row of regulatory financial data for one entity, period, and metric. Structure varies by coverage type.

## oneOf schemas
* [AustraliaFinancial](AustraliaFinancial.md)
* [CanadaFinancial](CanadaFinancial.md)
* [CreditUnionFinancial](CreditUnionFinancial.md)
* [USFinancial](USFinancial.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetBanks.models.Financial;
import com.factset.sdk.FactSetBanks.models.AustraliaFinancial;
import com.factset.sdk.FactSetBanks.models.CanadaFinancial;
import com.factset.sdk.FactSetBanks.models.CreditUnionFinancial;
import com.factset.sdk.FactSetBanks.models.USFinancial;

public class Example {
    public static void main(String[] args) {
        Financial exampleFinancial = new Financial();

        // create a new AustraliaFinancial
        AustraliaFinancial exampleAustraliaFinancial = new AustraliaFinancial();
        // set Financial to AustraliaFinancial
        exampleFinancial.setActualInstance(exampleAustraliaFinancial);
        // to get back the AustraliaFinancial set earlier
        AustraliaFinancial testAustraliaFinancial = (AustraliaFinancial) exampleFinancial.getActualInstance();

        // create a new CanadaFinancial
        CanadaFinancial exampleCanadaFinancial = new CanadaFinancial();
        // set Financial to CanadaFinancial
        exampleFinancial.setActualInstance(exampleCanadaFinancial);
        // to get back the CanadaFinancial set earlier
        CanadaFinancial testCanadaFinancial = (CanadaFinancial) exampleFinancial.getActualInstance();

        // create a new CreditUnionFinancial
        CreditUnionFinancial exampleCreditUnionFinancial = new CreditUnionFinancial();
        // set Financial to CreditUnionFinancial
        exampleFinancial.setActualInstance(exampleCreditUnionFinancial);
        // to get back the CreditUnionFinancial set earlier
        CreditUnionFinancial testCreditUnionFinancial = (CreditUnionFinancial) exampleFinancial.getActualInstance();

        // create a new USFinancial
        USFinancial exampleUSFinancial = new USFinancial();
        // set Financial to USFinancial
        exampleFinancial.setActualInstance(exampleUSFinancial);
        // to get back the USFinancial set earlier
        USFinancial testUSFinancial = (USFinancial) exampleFinancial.getActualInstance();
    }
}
```


