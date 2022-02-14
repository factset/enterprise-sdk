

# AdaptiveCardDataItem

## oneOf schemas
* [AdaptiveCardWithThumbnail](AdaptiveCardWithThumbnail.md)
* [Object](Object.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetSearchAnswers.models.AdaptiveCardDataItem;
import com.factset.sdk.FactSetSearchAnswers.models.AdaptiveCardWithThumbnail;
import com.factset.sdk.FactSetSearchAnswers.models.Object;

public class Example {
    public static void main(String[] args) {
        AdaptiveCardDataItem exampleAdaptiveCardDataItem = new AdaptiveCardDataItem();

        // create a new AdaptiveCardWithThumbnail
        AdaptiveCardWithThumbnail exampleAdaptiveCardWithThumbnail = new AdaptiveCardWithThumbnail();
        // set AdaptiveCardDataItem to AdaptiveCardWithThumbnail
        exampleAdaptiveCardDataItem.setActualInstance(exampleAdaptiveCardWithThumbnail);
        // to get back the AdaptiveCardWithThumbnail set earlier
        AdaptiveCardWithThumbnail testAdaptiveCardWithThumbnail = (AdaptiveCardWithThumbnail) exampleAdaptiveCardDataItem.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set AdaptiveCardDataItem to Object
        exampleAdaptiveCardDataItem.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleAdaptiveCardDataItem.getActualInstance();
    }
}
```


