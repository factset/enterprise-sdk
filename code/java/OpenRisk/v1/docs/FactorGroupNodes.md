

# FactorGroupNodes

Either an individual factor or a grouping.

## oneOf schemas
* [FactorGroup](FactorGroup.md)
* [RiskModelFactor](RiskModelFactor.md)

## Example
```java
// Import classes:
import com.factset.sdk.OpenRisk.models.FactorGroupNodes;
import com.factset.sdk.OpenRisk.models.FactorGroup;
import com.factset.sdk.OpenRisk.models.RiskModelFactor;

public class Example {
    public static void main(String[] args) {
        FactorGroupNodes exampleFactorGroupNodes = new FactorGroupNodes();

        // create a new FactorGroup
        FactorGroup exampleFactorGroup = new FactorGroup();
        // set FactorGroupNodes to FactorGroup
        exampleFactorGroupNodes.setActualInstance(exampleFactorGroup);
        // to get back the FactorGroup set earlier
        FactorGroup testFactorGroup = (FactorGroup) exampleFactorGroupNodes.getActualInstance();

        // create a new RiskModelFactor
        RiskModelFactor exampleRiskModelFactor = new RiskModelFactor();
        // set FactorGroupNodes to RiskModelFactor
        exampleFactorGroupNodes.setActualInstance(exampleRiskModelFactor);
        // to get back the RiskModelFactor set earlier
        RiskModelFactor testRiskModelFactor = (RiskModelFactor) exampleFactorGroupNodes.getActualInstance();
    }
}
```


