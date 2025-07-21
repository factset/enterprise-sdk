

# TranscriptsResponseData

## oneOf schemas
* [DocumentResult](DocumentResult.md)
* [TranscriptsByIdsResponse](TranscriptsByIdsResponse.md)

## Example
```java
// Import classes:
import com.factset.sdk.EventsandTranscripts.models.TranscriptsResponseData;
import com.factset.sdk.EventsandTranscripts.models.DocumentResult;
import com.factset.sdk.EventsandTranscripts.models.TranscriptsByIdsResponse;

public class Example {
    public static void main(String[] args) {
        TranscriptsResponseData exampleTranscriptsResponseData = new TranscriptsResponseData();

        // create a new DocumentResult
        DocumentResult exampleDocumentResult = new DocumentResult();
        // set TranscriptsResponseData to DocumentResult
        exampleTranscriptsResponseData.setActualInstance(exampleDocumentResult);
        // to get back the DocumentResult set earlier
        DocumentResult testDocumentResult = (DocumentResult) exampleTranscriptsResponseData.getActualInstance();

        // create a new TranscriptsByIdsResponse
        TranscriptsByIdsResponse exampleTranscriptsByIdsResponse = new TranscriptsByIdsResponse();
        // set TranscriptsResponseData to TranscriptsByIdsResponse
        exampleTranscriptsResponseData.setActualInstance(exampleTranscriptsByIdsResponse);
        // to get back the TranscriptsByIdsResponse set earlier
        TranscriptsByIdsResponse testTranscriptsByIdsResponse = (TranscriptsByIdsResponse) exampleTranscriptsResponseData.getActualInstance();
    }
}
```


