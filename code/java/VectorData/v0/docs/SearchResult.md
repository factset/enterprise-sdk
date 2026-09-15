

# SearchResult

Search result discriminated by source type. Each source has specific metadata fields relevant to that content type.

## oneOf schemas
* [EDGARSearchResult](EDGARSearchResult.md)
* [NewsSearchResult](NewsSearchResult.md)
* [TranscriptSearchResult](TranscriptSearchResult.md)

## Example
```java
// Import classes:
import com.factset.sdk.VectorData.models.SearchResult;
import com.factset.sdk.VectorData.models.EDGARSearchResult;
import com.factset.sdk.VectorData.models.NewsSearchResult;
import com.factset.sdk.VectorData.models.TranscriptSearchResult;

public class Example {
    public static void main(String[] args) {
        SearchResult exampleSearchResult = new SearchResult();

        // create a new EDGARSearchResult
        EDGARSearchResult exampleEDGARSearchResult = new EDGARSearchResult();
        // set SearchResult to EDGARSearchResult
        exampleSearchResult.setActualInstance(exampleEDGARSearchResult);
        // to get back the EDGARSearchResult set earlier
        EDGARSearchResult testEDGARSearchResult = (EDGARSearchResult) exampleSearchResult.getActualInstance();

        // create a new NewsSearchResult
        NewsSearchResult exampleNewsSearchResult = new NewsSearchResult();
        // set SearchResult to NewsSearchResult
        exampleSearchResult.setActualInstance(exampleNewsSearchResult);
        // to get back the NewsSearchResult set earlier
        NewsSearchResult testNewsSearchResult = (NewsSearchResult) exampleSearchResult.getActualInstance();

        // create a new TranscriptSearchResult
        TranscriptSearchResult exampleTranscriptSearchResult = new TranscriptSearchResult();
        // set SearchResult to TranscriptSearchResult
        exampleSearchResult.setActualInstance(exampleTranscriptSearchResult);
        // to get back the TranscriptSearchResult set earlier
        TranscriptSearchResult testTranscriptSearchResult = (TranscriptSearchResult) exampleSearchResult.getActualInstance();
    }
}
```


