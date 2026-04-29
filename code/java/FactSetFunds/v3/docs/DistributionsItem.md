

# DistributionsItem

Polymorphic distribution object (current or historical)

## oneOf schemas
* [DistCurrent](DistCurrent.md)
* [DistHistorical](DistHistorical.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetFunds.models.DistributionsItem;
import com.factset.sdk.FactSetFunds.models.DistCurrent;
import com.factset.sdk.FactSetFunds.models.DistHistorical;

public class Example {
    public static void main(String[] args) {
        DistributionsItem exampleDistributionsItem = new DistributionsItem();

        // create a new DistCurrent
        DistCurrent exampleDistCurrent = new DistCurrent();
        // set DistributionsItem to DistCurrent
        exampleDistributionsItem.setActualInstance(exampleDistCurrent);
        // to get back the DistCurrent set earlier
        DistCurrent testDistCurrent = (DistCurrent) exampleDistributionsItem.getActualInstance();

        // create a new DistHistorical
        DistHistorical exampleDistHistorical = new DistHistorical();
        // set DistributionsItem to DistHistorical
        exampleDistributionsItem.setActualInstance(exampleDistHistorical);
        // to get back the DistHistorical set earlier
        DistHistorical testDistHistorical = (DistHistorical) exampleDistributionsItem.getActualInstance();
    }
}
```


