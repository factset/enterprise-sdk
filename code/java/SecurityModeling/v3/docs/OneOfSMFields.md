

# OneOfSMFields

## oneOf schemas
* [SMBondFields](SMBondFields.md)

## Example
```java
// Import classes:
import com.factset.sdk.SecurityModeling.models.OneOfSMFields;
import com.factset.sdk.SecurityModeling.models.SMBondFields;

public class Example {
    public static void main(String[] args) {
        OneOfSMFields exampleOneOfSMFields = new OneOfSMFields();

        // create a new SMBondFields
        SMBondFields exampleSMBondFields = new SMBondFields();
        // set OneOfSMFields to SMBondFields
        exampleOneOfSMFields.setActualInstance(exampleSMBondFields);
        // to get back the SMBondFields set earlier
        SMBondFields testSMBondFields = (SMBondFields) exampleOneOfSMFields.getActualInstance();
    }
}
```


