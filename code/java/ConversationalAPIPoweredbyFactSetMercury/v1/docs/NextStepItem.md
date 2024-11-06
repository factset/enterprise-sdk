

# NextStepItem

A single action item associated with the query response. The current supported actions are as below: * OpenUrl: Contains a URL to open relevant supporting content in the FactSet Workstation or other FactSet applications * Download: Contains a file ID to download a file associated with the response 

## anyOf schemas
* [Download](Download.md)
* [OpenUrl](OpenUrl.md)

## Example
```java
// Import classes:
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.NextStepItem;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.Download;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.OpenUrl;

public class Example {
    public static void main(String[] args) {
        NextStepItem exampleNextStepItem = new NextStepItem();

        // create a new Download
        Download exampleDownload = new Download();
        // set NextStepItem to Download
        exampleNextStepItem.setActualInstance(exampleDownload);
        // to get back the Download set earlier
        Download testDownload = (Download) exampleNextStepItem.getActualInstance();

        // create a new OpenUrl
        OpenUrl exampleOpenUrl = new OpenUrl();
        // set NextStepItem to OpenUrl
        exampleNextStepItem.setActualInstance(exampleOpenUrl);
        // to get back the OpenUrl set earlier
        OpenUrl testOpenUrl = (OpenUrl) exampleNextStepItem.getActualInstance();
    }
}
```


