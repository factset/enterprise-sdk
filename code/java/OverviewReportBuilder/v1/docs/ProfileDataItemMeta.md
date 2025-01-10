

# ProfileDataItemMeta

Metadata for individual datapoints on Profile response

## anyOf schemas
* [ProfileDataItemMetaAnyOf](ProfileDataItemMetaAnyOf.md)

## Example
```java
// Import classes:
import com.factset.sdk.OverviewReportBuilder.models.ProfileDataItemMeta;
import com.factset.sdk.OverviewReportBuilder.models.ProfileDataItemMetaAnyOf;

public class Example {
    public static void main(String[] args) {
        ProfileDataItemMeta exampleProfileDataItemMeta = new ProfileDataItemMeta();

        // create a new ProfileDataItemMetaAnyOf
        ProfileDataItemMetaAnyOf exampleProfileDataItemMetaAnyOf = new ProfileDataItemMetaAnyOf();
        // set ProfileDataItemMeta to ProfileDataItemMetaAnyOf
        exampleProfileDataItemMeta.setActualInstance(exampleProfileDataItemMetaAnyOf);
        // to get back the ProfileDataItemMetaAnyOf set earlier
        ProfileDataItemMetaAnyOf testProfileDataItemMetaAnyOf = (ProfileDataItemMetaAnyOf) exampleProfileDataItemMeta.getActualInstance();
    }
}
```


