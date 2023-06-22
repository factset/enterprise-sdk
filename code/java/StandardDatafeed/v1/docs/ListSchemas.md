

# ListSchemas

List Of Schemas

## anyOf schemas
* [SchemaDetails](SchemaDetails.md)
* [java.util.Map<String, java.util.List<String>>](java.util.Map<String, java.util.List<String>>.md)

## Example
```java
// Import classes:
import com.factset.sdk.StandardDatafeed.models.ListSchemas;
import com.factset.sdk.StandardDatafeed.models.SchemaDetails;
import com.factset.sdk.StandardDatafeed.models.java.util.Map<String, java.util.List<String>>;

public class Example {
    public static void main(String[] args) {
        ListSchemas exampleListSchemas = new ListSchemas();

        // create a new SchemaDetails
        SchemaDetails exampleSchemaDetails = new SchemaDetails();
        // set ListSchemas to SchemaDetails
        exampleListSchemas.setActualInstance(exampleSchemaDetails);
        // to get back the SchemaDetails set earlier
        SchemaDetails testSchemaDetails = (SchemaDetails) exampleListSchemas.getActualInstance();

        // create a new java.util.Map<String, java.util.List<String>>
        java.util.Map<String, java.util.List<String>> examplejava.util.Map<String, java.util.List<String>> = new java.util.Map<String, java.util.List<String>>();
        // set ListSchemas to java.util.Map<String, java.util.List<String>>
        exampleListSchemas.setActualInstance(examplejava.util.Map<String, java.util.List<String>>);
        // to get back the java.util.Map<String, java.util.List<String>> set earlier
        java.util.Map<String, java.util.List<String>> testjava.util.Map<String, java.util.List<String>> = (java.util.Map<String, java.util.List<String>>) exampleListSchemas.getActualInstance();
    }
}
```


