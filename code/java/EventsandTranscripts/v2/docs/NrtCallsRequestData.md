

# NrtCallsRequestData

## anyOf schemas
* [NrtCallsRequestByIds](NrtCallsRequestByIds.md)
* [NrtCallsRequestByTicker](NrtCallsRequestByTicker.md)

## Example
```java
// Import classes:
import com.factset.sdk.EventsandTranscripts.models.NrtCallsRequestData;
import com.factset.sdk.EventsandTranscripts.models.NrtCallsRequestByIds;
import com.factset.sdk.EventsandTranscripts.models.NrtCallsRequestByTicker;

public class Example {
    public static void main(String[] args) {
        NrtCallsRequestData exampleNrtCallsRequestData = new NrtCallsRequestData();

        // create a new NrtCallsRequestByIds
        NrtCallsRequestByIds exampleNrtCallsRequestByIds = new NrtCallsRequestByIds();
        // set NrtCallsRequestData to NrtCallsRequestByIds
        exampleNrtCallsRequestData.setActualInstance(exampleNrtCallsRequestByIds);
        // to get back the NrtCallsRequestByIds set earlier
        NrtCallsRequestByIds testNrtCallsRequestByIds = (NrtCallsRequestByIds) exampleNrtCallsRequestData.getActualInstance();

        // create a new NrtCallsRequestByTicker
        NrtCallsRequestByTicker exampleNrtCallsRequestByTicker = new NrtCallsRequestByTicker();
        // set NrtCallsRequestData to NrtCallsRequestByTicker
        exampleNrtCallsRequestData.setActualInstance(exampleNrtCallsRequestByTicker);
        // to get back the NrtCallsRequestByTicker set earlier
        NrtCallsRequestByTicker testNrtCallsRequestByTicker = (NrtCallsRequestByTicker) exampleNrtCallsRequestData.getActualInstance();
    }
}
```


