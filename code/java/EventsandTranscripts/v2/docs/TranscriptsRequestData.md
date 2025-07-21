

# TranscriptsRequestData

## anyOf schemas
* [TranscriptsByDateRequest](TranscriptsByDateRequest.md)
* [TranscriptsByEventsRequest](TranscriptsByEventsRequest.md)
* [TranscriptsByIdsRequest](TranscriptsByIdsRequest.md)
* [TranscriptsBySearchRequest](TranscriptsBySearchRequest.md)
* [TranscriptsByTimesRequest](TranscriptsByTimesRequest.md)

## Example
```java
// Import classes:
import com.factset.sdk.EventsandTranscripts.models.TranscriptsRequestData;
import com.factset.sdk.EventsandTranscripts.models.TranscriptsByDateRequest;
import com.factset.sdk.EventsandTranscripts.models.TranscriptsByEventsRequest;
import com.factset.sdk.EventsandTranscripts.models.TranscriptsByIdsRequest;
import com.factset.sdk.EventsandTranscripts.models.TranscriptsBySearchRequest;
import com.factset.sdk.EventsandTranscripts.models.TranscriptsByTimesRequest;

public class Example {
    public static void main(String[] args) {
        TranscriptsRequestData exampleTranscriptsRequestData = new TranscriptsRequestData();

        // create a new TranscriptsByDateRequest
        TranscriptsByDateRequest exampleTranscriptsByDateRequest = new TranscriptsByDateRequest();
        // set TranscriptsRequestData to TranscriptsByDateRequest
        exampleTranscriptsRequestData.setActualInstance(exampleTranscriptsByDateRequest);
        // to get back the TranscriptsByDateRequest set earlier
        TranscriptsByDateRequest testTranscriptsByDateRequest = (TranscriptsByDateRequest) exampleTranscriptsRequestData.getActualInstance();

        // create a new TranscriptsByEventsRequest
        TranscriptsByEventsRequest exampleTranscriptsByEventsRequest = new TranscriptsByEventsRequest();
        // set TranscriptsRequestData to TranscriptsByEventsRequest
        exampleTranscriptsRequestData.setActualInstance(exampleTranscriptsByEventsRequest);
        // to get back the TranscriptsByEventsRequest set earlier
        TranscriptsByEventsRequest testTranscriptsByEventsRequest = (TranscriptsByEventsRequest) exampleTranscriptsRequestData.getActualInstance();

        // create a new TranscriptsByIdsRequest
        TranscriptsByIdsRequest exampleTranscriptsByIdsRequest = new TranscriptsByIdsRequest();
        // set TranscriptsRequestData to TranscriptsByIdsRequest
        exampleTranscriptsRequestData.setActualInstance(exampleTranscriptsByIdsRequest);
        // to get back the TranscriptsByIdsRequest set earlier
        TranscriptsByIdsRequest testTranscriptsByIdsRequest = (TranscriptsByIdsRequest) exampleTranscriptsRequestData.getActualInstance();

        // create a new TranscriptsBySearchRequest
        TranscriptsBySearchRequest exampleTranscriptsBySearchRequest = new TranscriptsBySearchRequest();
        // set TranscriptsRequestData to TranscriptsBySearchRequest
        exampleTranscriptsRequestData.setActualInstance(exampleTranscriptsBySearchRequest);
        // to get back the TranscriptsBySearchRequest set earlier
        TranscriptsBySearchRequest testTranscriptsBySearchRequest = (TranscriptsBySearchRequest) exampleTranscriptsRequestData.getActualInstance();

        // create a new TranscriptsByTimesRequest
        TranscriptsByTimesRequest exampleTranscriptsByTimesRequest = new TranscriptsByTimesRequest();
        // set TranscriptsRequestData to TranscriptsByTimesRequest
        exampleTranscriptsRequestData.setActualInstance(exampleTranscriptsByTimesRequest);
        // to get back the TranscriptsByTimesRequest set earlier
        TranscriptsByTimesRequest testTranscriptsByTimesRequest = (TranscriptsByTimesRequest) exampleTranscriptsRequestData.getActualInstance();
    }
}
```


