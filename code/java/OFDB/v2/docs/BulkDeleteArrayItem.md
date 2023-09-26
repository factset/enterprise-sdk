

# BulkDeleteArrayItem

## anyOf schemas
* [java.util.List<String>](java.util.List<String>.md)
* [java.util.Map<String, BulkDeleteArrayItemNested>](java.util.Map<String, BulkDeleteArrayItemNested>.md)

## Example
```java
// Import classes:
import com.factset.sdk.OFDB.models.BulkDeleteArrayItem;
import com.factset.sdk.OFDB.models.java.util.List<String>;
import com.factset.sdk.OFDB.models.java.util.Map<String, BulkDeleteArrayItemNested>;

public class Example {
    public static void main(String[] args) {
        BulkDeleteArrayItem exampleBulkDeleteArrayItem = new BulkDeleteArrayItem();

        // create a new java.util.List<String>
        java.util.List<String> examplejava.util.List<String> = new java.util.List<String>();
        // set BulkDeleteArrayItem to java.util.List<String>
        exampleBulkDeleteArrayItem.setActualInstance(examplejava.util.List<String>);
        // to get back the java.util.List<String> set earlier
        java.util.List<String> testjava.util.List<String> = (java.util.List<String>) exampleBulkDeleteArrayItem.getActualInstance();

        // create a new java.util.Map<String, BulkDeleteArrayItemNested>
        java.util.Map<String, BulkDeleteArrayItemNested> examplejava.util.Map<String, BulkDeleteArrayItemNested> = new java.util.Map<String, BulkDeleteArrayItemNested>();
        // set BulkDeleteArrayItem to java.util.Map<String, BulkDeleteArrayItemNested>
        exampleBulkDeleteArrayItem.setActualInstance(examplejava.util.Map<String, BulkDeleteArrayItemNested>);
        // to get back the java.util.Map<String, BulkDeleteArrayItemNested> set earlier
        java.util.Map<String, BulkDeleteArrayItemNested> testjava.util.Map<String, BulkDeleteArrayItemNested> = (java.util.Map<String, BulkDeleteArrayItemNested>) exampleBulkDeleteArrayItem.getActualInstance();
    }
}
```


