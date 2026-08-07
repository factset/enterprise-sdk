

# ReferenceItem

Reference item representing either an indicator, country, FDS code, or timezone. The structure depends on the requested type parameter.

## oneOf schemas
* [ReferenceItemCountry](ReferenceItemCountry.md)
* [ReferenceItemFdsCode](ReferenceItemFdsCode.md)
* [ReferenceItemIndicator](ReferenceItemIndicator.md)
* [ReferenceItemTimezone](ReferenceItemTimezone.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetMacroeconomics.models.ReferenceItem;
import com.factset.sdk.FactSetMacroeconomics.models.ReferenceItemCountry;
import com.factset.sdk.FactSetMacroeconomics.models.ReferenceItemFdsCode;
import com.factset.sdk.FactSetMacroeconomics.models.ReferenceItemIndicator;
import com.factset.sdk.FactSetMacroeconomics.models.ReferenceItemTimezone;

public class Example {
    public static void main(String[] args) {
        ReferenceItem exampleReferenceItem = new ReferenceItem();

        // create a new ReferenceItemCountry
        ReferenceItemCountry exampleReferenceItemCountry = new ReferenceItemCountry();
        // set ReferenceItem to ReferenceItemCountry
        exampleReferenceItem.setActualInstance(exampleReferenceItemCountry);
        // to get back the ReferenceItemCountry set earlier
        ReferenceItemCountry testReferenceItemCountry = (ReferenceItemCountry) exampleReferenceItem.getActualInstance();

        // create a new ReferenceItemFdsCode
        ReferenceItemFdsCode exampleReferenceItemFdsCode = new ReferenceItemFdsCode();
        // set ReferenceItem to ReferenceItemFdsCode
        exampleReferenceItem.setActualInstance(exampleReferenceItemFdsCode);
        // to get back the ReferenceItemFdsCode set earlier
        ReferenceItemFdsCode testReferenceItemFdsCode = (ReferenceItemFdsCode) exampleReferenceItem.getActualInstance();

        // create a new ReferenceItemIndicator
        ReferenceItemIndicator exampleReferenceItemIndicator = new ReferenceItemIndicator();
        // set ReferenceItem to ReferenceItemIndicator
        exampleReferenceItem.setActualInstance(exampleReferenceItemIndicator);
        // to get back the ReferenceItemIndicator set earlier
        ReferenceItemIndicator testReferenceItemIndicator = (ReferenceItemIndicator) exampleReferenceItem.getActualInstance();

        // create a new ReferenceItemTimezone
        ReferenceItemTimezone exampleReferenceItemTimezone = new ReferenceItemTimezone();
        // set ReferenceItem to ReferenceItemTimezone
        exampleReferenceItem.setActualInstance(exampleReferenceItemTimezone);
        // to get back the ReferenceItemTimezone set earlier
        ReferenceItemTimezone testReferenceItemTimezone = (ReferenceItemTimezone) exampleReferenceItem.getActualInstance();
    }
}
```


