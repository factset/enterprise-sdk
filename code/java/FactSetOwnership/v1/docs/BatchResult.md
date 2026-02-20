

# BatchResult

Batch Result Item

## oneOf schemas
* [FundHolding](FundHolding.md)
* [InsiderTransactions](InsiderTransactions.md)
* [InstitutionalTransactions](InstitutionalTransactions.md)
* [SecurityHolders](SecurityHolders.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetOwnership.models.BatchResult;
import com.factset.sdk.FactSetOwnership.models.FundHolding;
import com.factset.sdk.FactSetOwnership.models.InsiderTransactions;
import com.factset.sdk.FactSetOwnership.models.InstitutionalTransactions;
import com.factset.sdk.FactSetOwnership.models.SecurityHolders;

public class Example {
    public static void main(String[] args) {
        BatchResult exampleBatchResult = new BatchResult();

        // create a new FundHolding
        FundHolding exampleFundHolding = new FundHolding();
        // set BatchResult to FundHolding
        exampleBatchResult.setActualInstance(exampleFundHolding);
        // to get back the FundHolding set earlier
        FundHolding testFundHolding = (FundHolding) exampleBatchResult.getActualInstance();

        // create a new InsiderTransactions
        InsiderTransactions exampleInsiderTransactions = new InsiderTransactions();
        // set BatchResult to InsiderTransactions
        exampleBatchResult.setActualInstance(exampleInsiderTransactions);
        // to get back the InsiderTransactions set earlier
        InsiderTransactions testInsiderTransactions = (InsiderTransactions) exampleBatchResult.getActualInstance();

        // create a new InstitutionalTransactions
        InstitutionalTransactions exampleInstitutionalTransactions = new InstitutionalTransactions();
        // set BatchResult to InstitutionalTransactions
        exampleBatchResult.setActualInstance(exampleInstitutionalTransactions);
        // to get back the InstitutionalTransactions set earlier
        InstitutionalTransactions testInstitutionalTransactions = (InstitutionalTransactions) exampleBatchResult.getActualInstance();

        // create a new SecurityHolders
        SecurityHolders exampleSecurityHolders = new SecurityHolders();
        // set BatchResult to SecurityHolders
        exampleBatchResult.setActualInstance(exampleSecurityHolders);
        // to get back the SecurityHolders set earlier
        SecurityHolders testSecurityHolders = (SecurityHolders) exampleBatchResult.getActualInstance();
    }
}
```


