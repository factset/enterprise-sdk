

# BulkDeleteRespItem

## oneOf schemas
* [java.util.List<String>](java.util.List<String>.md)
* [java.util.Map<String, BulkDeleteRespItemNested>](java.util.Map<String, BulkDeleteRespItemNested>.md)

## Example
```java
// Import classes:
import com.factset.sdk.OFDB.models.BulkDeleteRespItem;
import com.factset.sdk.OFDB.models.java.util.List<String>;
import com.factset.sdk.OFDB.models.java.util.Map<String, BulkDeleteRespItemNested>;

public class Example {
    public static void main(String[] args) {
        BulkDeleteRespItem exampleBulkDeleteRespItem = new BulkDeleteRespItem();

        // create a new java.util.List<String>
        java.util.List<String> examplejava.util.List<String> = new java.util.List<String>();
        // set BulkDeleteRespItem to java.util.List<String>
        exampleBulkDeleteRespItem.setActualInstance(examplejava.util.List<String>);
        // to get back the java.util.List<String> set earlier
        java.util.List<String> testjava.util.List<String> = (java.util.List<String>) exampleBulkDeleteRespItem.getActualInstance();

        // create a new java.util.Map<String, BulkDeleteRespItemNested>
        java.util.Map<String, BulkDeleteRespItemNested> examplejava.util.Map<String, BulkDeleteRespItemNested> = new java.util.Map<String, BulkDeleteRespItemNested>();
        // set BulkDeleteRespItem to java.util.Map<String, BulkDeleteRespItemNested>
        exampleBulkDeleteRespItem.setActualInstance(examplejava.util.Map<String, BulkDeleteRespItemNested>);
        // to get back the java.util.Map<String, BulkDeleteRespItemNested> set earlier
        java.util.Map<String, BulkDeleteRespItemNested> testjava.util.Map<String, BulkDeleteRespItemNested> = (java.util.Map<String, BulkDeleteRespItemNested>) exampleBulkDeleteRespItem.getActualInstance();
    }
}
```


