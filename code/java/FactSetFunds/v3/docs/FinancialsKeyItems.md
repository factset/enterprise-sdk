

# FinancialsKeyItems

Financial Key Items Response

## oneOf schemas
* [Growth](Growth.md)
* [Margins](Margins.md)
* [PerShare](PerShare.md)
* [Ratios](Ratios.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetFunds.models.FinancialsKeyItems;
import com.factset.sdk.FactSetFunds.models.Growth;
import com.factset.sdk.FactSetFunds.models.Margins;
import com.factset.sdk.FactSetFunds.models.PerShare;
import com.factset.sdk.FactSetFunds.models.Ratios;

public class Example {
    public static void main(String[] args) {
        FinancialsKeyItems exampleFinancialsKeyItems = new FinancialsKeyItems();

        // create a new Growth
        Growth exampleGrowth = new Growth();
        // set FinancialsKeyItems to Growth
        exampleFinancialsKeyItems.setActualInstance(exampleGrowth);
        // to get back the Growth set earlier
        Growth testGrowth = (Growth) exampleFinancialsKeyItems.getActualInstance();

        // create a new Margins
        Margins exampleMargins = new Margins();
        // set FinancialsKeyItems to Margins
        exampleFinancialsKeyItems.setActualInstance(exampleMargins);
        // to get back the Margins set earlier
        Margins testMargins = (Margins) exampleFinancialsKeyItems.getActualInstance();

        // create a new PerShare
        PerShare examplePerShare = new PerShare();
        // set FinancialsKeyItems to PerShare
        exampleFinancialsKeyItems.setActualInstance(examplePerShare);
        // to get back the PerShare set earlier
        PerShare testPerShare = (PerShare) exampleFinancialsKeyItems.getActualInstance();

        // create a new Ratios
        Ratios exampleRatios = new Ratios();
        // set FinancialsKeyItems to Ratios
        exampleFinancialsKeyItems.setActualInstance(exampleRatios);
        // to get back the Ratios set earlier
        Ratios testRatios = (Ratios) exampleFinancialsKeyItems.getActualInstance();
    }
}
```


