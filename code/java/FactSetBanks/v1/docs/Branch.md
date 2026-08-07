

# Branch

A single row of branch or location data. Structure varies by coverage type.

## oneOf schemas
* [AustraliaBranch](AustraliaBranch.md)
* [CreditUnionBranch](CreditUnionBranch.md)
* [GlobalBranch](GlobalBranch.md)
* [USBranch](USBranch.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetBanks.models.Branch;
import com.factset.sdk.FactSetBanks.models.AustraliaBranch;
import com.factset.sdk.FactSetBanks.models.CreditUnionBranch;
import com.factset.sdk.FactSetBanks.models.GlobalBranch;
import com.factset.sdk.FactSetBanks.models.USBranch;

public class Example {
    public static void main(String[] args) {
        Branch exampleBranch = new Branch();

        // create a new AustraliaBranch
        AustraliaBranch exampleAustraliaBranch = new AustraliaBranch();
        // set Branch to AustraliaBranch
        exampleBranch.setActualInstance(exampleAustraliaBranch);
        // to get back the AustraliaBranch set earlier
        AustraliaBranch testAustraliaBranch = (AustraliaBranch) exampleBranch.getActualInstance();

        // create a new CreditUnionBranch
        CreditUnionBranch exampleCreditUnionBranch = new CreditUnionBranch();
        // set Branch to CreditUnionBranch
        exampleBranch.setActualInstance(exampleCreditUnionBranch);
        // to get back the CreditUnionBranch set earlier
        CreditUnionBranch testCreditUnionBranch = (CreditUnionBranch) exampleBranch.getActualInstance();

        // create a new GlobalBranch
        GlobalBranch exampleGlobalBranch = new GlobalBranch();
        // set Branch to GlobalBranch
        exampleBranch.setActualInstance(exampleGlobalBranch);
        // to get back the GlobalBranch set earlier
        GlobalBranch testGlobalBranch = (GlobalBranch) exampleBranch.getActualInstance();

        // create a new USBranch
        USBranch exampleUSBranch = new USBranch();
        // set Branch to USBranch
        exampleBranch.setActualInstance(exampleUSBranch);
        // to get back the USBranch set earlier
        USBranch testUSBranch = (USBranch) exampleBranch.getActualInstance();
    }
}
```


