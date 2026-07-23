

# TranscriptsResponseData

## oneOf schemas
* [TranscriptsByIdsResponse](TranscriptsByIdsResponse.md)
* [TranscriptsResult](TranscriptsResult.md)

## Example
```java
// Import classes:
import com.factset.sdk.EventsandTranscripts.models.TranscriptsResponseData;
import com.factset.sdk.EventsandTranscripts.models.TranscriptsByIdsResponse;
import com.factset.sdk.EventsandTranscripts.models.TranscriptsResult;

public class Example {
    public static void main(String[] args) {
        TranscriptsResponseData exampleTranscriptsResponseData = new TranscriptsResponseData();

        // create a new TranscriptsByIdsResponse
        TranscriptsByIdsResponse exampleTranscriptsByIdsResponse = new TranscriptsByIdsResponse();
        // set TranscriptsResponseData to TranscriptsByIdsResponse
        exampleTranscriptsResponseData.setActualInstance(exampleTranscriptsByIdsResponse);
        // to get back the TranscriptsByIdsResponse set earlier
        TranscriptsByIdsResponse testTranscriptsByIdsResponse = (TranscriptsByIdsResponse) exampleTranscriptsResponseData.getActualInstance();

        // create a new TranscriptsResult
        TranscriptsResult exampleTranscriptsResult = new TranscriptsResult();
        // set TranscriptsResponseData to TranscriptsResult
        exampleTranscriptsResponseData.setActualInstance(exampleTranscriptsResult);
        // to get back the TranscriptsResult set earlier
        TranscriptsResult testTranscriptsResult = (TranscriptsResult) exampleTranscriptsResponseData.getActualInstance();
    }
}
```


