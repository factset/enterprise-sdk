

# BulkDeleteArrayItemNested

## oneOf schemas
* [java.util.List<Integer>](java.util.List<Integer>.md)
* [java.util.Map<String, java.util.List<Integer>>](java.util.Map<String, java.util.List<Integer>>.md)

## Example
```java
// Import classes:
import com.factset.sdk.OFDB.models.BulkDeleteArrayItemNested;
import com.factset.sdk.OFDB.models.java.util.List<Integer>;
import com.factset.sdk.OFDB.models.java.util.Map<String, java.util.List<Integer>>;

public class Example {
    public static void main(String[] args) {
        BulkDeleteArrayItemNested exampleBulkDeleteArrayItemNested = new BulkDeleteArrayItemNested();

        // create a new java.util.List<Integer>
        java.util.List<Integer> examplejava.util.List<Integer> = new java.util.List<Integer>();
        // set BulkDeleteArrayItemNested to java.util.List<Integer>
        exampleBulkDeleteArrayItemNested.setActualInstance(examplejava.util.List<Integer>);
        // to get back the java.util.List<Integer> set earlier
        java.util.List<Integer> testjava.util.List<Integer> = (java.util.List<Integer>) exampleBulkDeleteArrayItemNested.getActualInstance();

        // create a new java.util.Map<String, java.util.List<Integer>>
        java.util.Map<String, java.util.List<Integer>> examplejava.util.Map<String, java.util.List<Integer>> = new java.util.Map<String, java.util.List<Integer>>();
        // set BulkDeleteArrayItemNested to java.util.Map<String, java.util.List<Integer>>
        exampleBulkDeleteArrayItemNested.setActualInstance(examplejava.util.Map<String, java.util.List<Integer>>);
        // to get back the java.util.Map<String, java.util.List<Integer>> set earlier
        java.util.Map<String, java.util.List<Integer>> testjava.util.Map<String, java.util.List<Integer>> = (java.util.Map<String, java.util.List<Integer>>) exampleBulkDeleteArrayItemNested.getActualInstance();
    }
}
```


