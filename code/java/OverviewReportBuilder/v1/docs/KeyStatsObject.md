

# KeyStatsObject

## oneOf schemas
* [KeyStatsEntityObject](KeyStatsEntityObject.md)
* [KeyStatsFundObject](KeyStatsFundObject.md)

## Example
```java
// Import classes:
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsObject;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObject;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsFundObject;

public class Example {
    public static void main(String[] args) {
        KeyStatsObject exampleKeyStatsObject = new KeyStatsObject();

        // create a new KeyStatsEntityObject
        KeyStatsEntityObject exampleKeyStatsEntityObject = new KeyStatsEntityObject();
        // set KeyStatsObject to KeyStatsEntityObject
        exampleKeyStatsObject.setActualInstance(exampleKeyStatsEntityObject);
        // to get back the KeyStatsEntityObject set earlier
        KeyStatsEntityObject testKeyStatsEntityObject = (KeyStatsEntityObject) exampleKeyStatsObject.getActualInstance();

        // create a new KeyStatsFundObject
        KeyStatsFundObject exampleKeyStatsFundObject = new KeyStatsFundObject();
        // set KeyStatsObject to KeyStatsFundObject
        exampleKeyStatsObject.setActualInstance(exampleKeyStatsFundObject);
        // to get back the KeyStatsFundObject set earlier
        KeyStatsFundObject testKeyStatsFundObject = (KeyStatsFundObject) exampleKeyStatsObject.getActualInstance();
    }
}
```


