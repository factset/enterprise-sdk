

# AudioRequestData

## anyOf schemas
* [AudioByDateRequest](AudioByDateRequest.md)
* [AudioByFileNameRequest](AudioByFileNameRequest.md)
* [AudioByIdsRequest](AudioByIdsRequest.md)
* [AudioByUploadTimeRequest](AudioByUploadTimeRequest.md)

## Example
```java
// Import classes:
import com.factset.sdk.EventsandTranscripts.models.AudioRequestData;
import com.factset.sdk.EventsandTranscripts.models.AudioByDateRequest;
import com.factset.sdk.EventsandTranscripts.models.AudioByFileNameRequest;
import com.factset.sdk.EventsandTranscripts.models.AudioByIdsRequest;
import com.factset.sdk.EventsandTranscripts.models.AudioByUploadTimeRequest;

public class Example {
    public static void main(String[] args) {
        AudioRequestData exampleAudioRequestData = new AudioRequestData();

        // create a new AudioByDateRequest
        AudioByDateRequest exampleAudioByDateRequest = new AudioByDateRequest();
        // set AudioRequestData to AudioByDateRequest
        exampleAudioRequestData.setActualInstance(exampleAudioByDateRequest);
        // to get back the AudioByDateRequest set earlier
        AudioByDateRequest testAudioByDateRequest = (AudioByDateRequest) exampleAudioRequestData.getActualInstance();

        // create a new AudioByFileNameRequest
        AudioByFileNameRequest exampleAudioByFileNameRequest = new AudioByFileNameRequest();
        // set AudioRequestData to AudioByFileNameRequest
        exampleAudioRequestData.setActualInstance(exampleAudioByFileNameRequest);
        // to get back the AudioByFileNameRequest set earlier
        AudioByFileNameRequest testAudioByFileNameRequest = (AudioByFileNameRequest) exampleAudioRequestData.getActualInstance();

        // create a new AudioByIdsRequest
        AudioByIdsRequest exampleAudioByIdsRequest = new AudioByIdsRequest();
        // set AudioRequestData to AudioByIdsRequest
        exampleAudioRequestData.setActualInstance(exampleAudioByIdsRequest);
        // to get back the AudioByIdsRequest set earlier
        AudioByIdsRequest testAudioByIdsRequest = (AudioByIdsRequest) exampleAudioRequestData.getActualInstance();

        // create a new AudioByUploadTimeRequest
        AudioByUploadTimeRequest exampleAudioByUploadTimeRequest = new AudioByUploadTimeRequest();
        // set AudioRequestData to AudioByUploadTimeRequest
        exampleAudioRequestData.setActualInstance(exampleAudioByUploadTimeRequest);
        // to get back the AudioByUploadTimeRequest set earlier
        AudioByUploadTimeRequest testAudioByUploadTimeRequest = (AudioByUploadTimeRequest) exampleAudioRequestData.getActualInstance();
    }
}
```


