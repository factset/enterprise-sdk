

# KeyStatsDataObject

## oneOf schemas
* [KeyStatsDataObjectEntity](KeyStatsDataObjectEntity.md)
* [KeyStatsDataObjectFund](KeyStatsDataObjectFund.md)

## Example
```java
// Import classes:
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObject;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntity;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFund;

public class Example {
    public static void main(String[] args) {
        KeyStatsDataObject exampleKeyStatsDataObject = new KeyStatsDataObject();

        // create a new KeyStatsDataObjectEntity
        KeyStatsDataObjectEntity exampleKeyStatsDataObjectEntity = new KeyStatsDataObjectEntity();
        // set KeyStatsDataObject to KeyStatsDataObjectEntity
        exampleKeyStatsDataObject.setActualInstance(exampleKeyStatsDataObjectEntity);
        // to get back the KeyStatsDataObjectEntity set earlier
        KeyStatsDataObjectEntity testKeyStatsDataObjectEntity = (KeyStatsDataObjectEntity) exampleKeyStatsDataObject.getActualInstance();

        // create a new KeyStatsDataObjectFund
        KeyStatsDataObjectFund exampleKeyStatsDataObjectFund = new KeyStatsDataObjectFund();
        // set KeyStatsDataObject to KeyStatsDataObjectFund
        exampleKeyStatsDataObject.setActualInstance(exampleKeyStatsDataObjectFund);
        // to get back the KeyStatsDataObjectFund set earlier
        KeyStatsDataObjectFund testKeyStatsDataObjectFund = (KeyStatsDataObjectFund) exampleKeyStatsDataObject.getActualInstance();
    }
}
```


