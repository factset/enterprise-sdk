

# PricesRequestData

Price query parameters. The `category` field selects the record shape returned. 

## oneOf schemas
* [CapacityPriceData](CapacityPriceData.md)
* [ForwardPriceData](ForwardPriceData.md)
* [PowerPriceData](PowerPriceData.md)
* [SparkSpreadData](SparkSpreadData.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetPowerUtilities.models.PricesRequestData;
import com.factset.sdk.FactSetPowerUtilities.models.CapacityPriceData;
import com.factset.sdk.FactSetPowerUtilities.models.ForwardPriceData;
import com.factset.sdk.FactSetPowerUtilities.models.PowerPriceData;
import com.factset.sdk.FactSetPowerUtilities.models.SparkSpreadData;

public class Example {
    public static void main(String[] args) {
        PricesRequestData examplePricesRequestData = new PricesRequestData();

        // create a new CapacityPriceData
        CapacityPriceData exampleCapacityPriceData = new CapacityPriceData();
        // set PricesRequestData to CapacityPriceData
        examplePricesRequestData.setActualInstance(exampleCapacityPriceData);
        // to get back the CapacityPriceData set earlier
        CapacityPriceData testCapacityPriceData = (CapacityPriceData) examplePricesRequestData.getActualInstance();

        // create a new ForwardPriceData
        ForwardPriceData exampleForwardPriceData = new ForwardPriceData();
        // set PricesRequestData to ForwardPriceData
        examplePricesRequestData.setActualInstance(exampleForwardPriceData);
        // to get back the ForwardPriceData set earlier
        ForwardPriceData testForwardPriceData = (ForwardPriceData) examplePricesRequestData.getActualInstance();

        // create a new PowerPriceData
        PowerPriceData examplePowerPriceData = new PowerPriceData();
        // set PricesRequestData to PowerPriceData
        examplePricesRequestData.setActualInstance(examplePowerPriceData);
        // to get back the PowerPriceData set earlier
        PowerPriceData testPowerPriceData = (PowerPriceData) examplePricesRequestData.getActualInstance();

        // create a new SparkSpreadData
        SparkSpreadData exampleSparkSpreadData = new SparkSpreadData();
        // set PricesRequestData to SparkSpreadData
        examplePricesRequestData.setActualInstance(exampleSparkSpreadData);
        // to get back the SparkSpreadData set earlier
        SparkSpreadData testSparkSpreadData = (SparkSpreadData) examplePricesRequestData.getActualInstance();
    }
}
```


