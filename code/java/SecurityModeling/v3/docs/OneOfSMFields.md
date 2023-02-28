

# OneOfSMFields

## oneOf schemas
* [SMBondFields](SMBondFields.md)
* [SMCustomCashFlowFields](SMCustomCashFlowFields.md)

## Example
```java
// Import classes:
import com.factset.sdk.SecurityModeling.models.OneOfSMFields;
import com.factset.sdk.SecurityModeling.models.SMBondFields;
import com.factset.sdk.SecurityModeling.models.SMCustomCashFlowFields;

public class Example {
    public static void main(String[] args) {
        OneOfSMFields exampleOneOfSMFields = new OneOfSMFields();

        // create a new SMBondFields
        SMBondFields exampleSMBondFields = new SMBondFields();
        // set OneOfSMFields to SMBondFields
        exampleOneOfSMFields.setActualInstance(exampleSMBondFields);
        // to get back the SMBondFields set earlier
        SMBondFields testSMBondFields = (SMBondFields) exampleOneOfSMFields.getActualInstance();

        // create a new SMCustomCashFlowFields
        SMCustomCashFlowFields exampleSMCustomCashFlowFields = new SMCustomCashFlowFields();
        // set OneOfSMFields to SMCustomCashFlowFields
        exampleOneOfSMFields.setActualInstance(exampleSMCustomCashFlowFields);
        // to get back the SMCustomCashFlowFields set earlier
        SMCustomCashFlowFields testSMCustomCashFlowFields = (SMCustomCashFlowFields) exampleOneOfSMFields.getActualInstance();
    }
}
```


