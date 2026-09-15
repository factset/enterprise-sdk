

# PriceRecord

A single power market price record. Record shape matches the requested `category`.

## oneOf schemas
* [CapacityPriceRecord](CapacityPriceRecord.md)
* [ForwardPriceRecord](ForwardPriceRecord.md)
* [PowerPriceRecord](PowerPriceRecord.md)
* [SparkSpreadPriceRecord](SparkSpreadPriceRecord.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetPowerUtilities.models.PriceRecord;
import com.factset.sdk.FactSetPowerUtilities.models.CapacityPriceRecord;
import com.factset.sdk.FactSetPowerUtilities.models.ForwardPriceRecord;
import com.factset.sdk.FactSetPowerUtilities.models.PowerPriceRecord;
import com.factset.sdk.FactSetPowerUtilities.models.SparkSpreadPriceRecord;

public class Example {
    public static void main(String[] args) {
        PriceRecord examplePriceRecord = new PriceRecord();

        // create a new CapacityPriceRecord
        CapacityPriceRecord exampleCapacityPriceRecord = new CapacityPriceRecord();
        // set PriceRecord to CapacityPriceRecord
        examplePriceRecord.setActualInstance(exampleCapacityPriceRecord);
        // to get back the CapacityPriceRecord set earlier
        CapacityPriceRecord testCapacityPriceRecord = (CapacityPriceRecord) examplePriceRecord.getActualInstance();

        // create a new ForwardPriceRecord
        ForwardPriceRecord exampleForwardPriceRecord = new ForwardPriceRecord();
        // set PriceRecord to ForwardPriceRecord
        examplePriceRecord.setActualInstance(exampleForwardPriceRecord);
        // to get back the ForwardPriceRecord set earlier
        ForwardPriceRecord testForwardPriceRecord = (ForwardPriceRecord) examplePriceRecord.getActualInstance();

        // create a new PowerPriceRecord
        PowerPriceRecord examplePowerPriceRecord = new PowerPriceRecord();
        // set PriceRecord to PowerPriceRecord
        examplePriceRecord.setActualInstance(examplePowerPriceRecord);
        // to get back the PowerPriceRecord set earlier
        PowerPriceRecord testPowerPriceRecord = (PowerPriceRecord) examplePriceRecord.getActualInstance();

        // create a new SparkSpreadPriceRecord
        SparkSpreadPriceRecord exampleSparkSpreadPriceRecord = new SparkSpreadPriceRecord();
        // set PriceRecord to SparkSpreadPriceRecord
        examplePriceRecord.setActualInstance(exampleSparkSpreadPriceRecord);
        // to get back the SparkSpreadPriceRecord set earlier
        SparkSpreadPriceRecord testSparkSpreadPriceRecord = (SparkSpreadPriceRecord) examplePriceRecord.getActualInstance();
    }
}
```


