

# VectorResult

Vector result discriminated by source type. Each source has specific metadata fields.

## oneOf schemas
* [EDGARVectorResult](EDGARVectorResult.md)
* [NewsVectorResult](NewsVectorResult.md)
* [TranscriptVectorResult](TranscriptVectorResult.md)

## Example
```java
// Import classes:
import com.factset.sdk.VectorData.models.VectorResult;
import com.factset.sdk.VectorData.models.EDGARVectorResult;
import com.factset.sdk.VectorData.models.NewsVectorResult;
import com.factset.sdk.VectorData.models.TranscriptVectorResult;

public class Example {
    public static void main(String[] args) {
        VectorResult exampleVectorResult = new VectorResult();

        // create a new EDGARVectorResult
        EDGARVectorResult exampleEDGARVectorResult = new EDGARVectorResult();
        // set VectorResult to EDGARVectorResult
        exampleVectorResult.setActualInstance(exampleEDGARVectorResult);
        // to get back the EDGARVectorResult set earlier
        EDGARVectorResult testEDGARVectorResult = (EDGARVectorResult) exampleVectorResult.getActualInstance();

        // create a new NewsVectorResult
        NewsVectorResult exampleNewsVectorResult = new NewsVectorResult();
        // set VectorResult to NewsVectorResult
        exampleVectorResult.setActualInstance(exampleNewsVectorResult);
        // to get back the NewsVectorResult set earlier
        NewsVectorResult testNewsVectorResult = (NewsVectorResult) exampleVectorResult.getActualInstance();

        // create a new TranscriptVectorResult
        TranscriptVectorResult exampleTranscriptVectorResult = new TranscriptVectorResult();
        // set VectorResult to TranscriptVectorResult
        exampleVectorResult.setActualInstance(exampleTranscriptVectorResult);
        // to get back the TranscriptVectorResult set earlier
        TranscriptVectorResult testTranscriptVectorResult = (TranscriptVectorResult) exampleVectorResult.getActualInstance();
    }
}
```


