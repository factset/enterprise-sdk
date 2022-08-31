

# RiskMappingEntry

Either risk model covered security resolution or uncovered security reason

## oneOf schemas
* [MappedSecurityInfo](MappedSecurityInfo.md)
* [RiskExclusionInfo](RiskExclusionInfo.md)

## Example
```java
// Import classes:
import com.factset.sdk.OpenRisk.models.RiskMappingEntry;
import com.factset.sdk.OpenRisk.models.MappedSecurityInfo;
import com.factset.sdk.OpenRisk.models.RiskExclusionInfo;

public class Example {
    public static void main(String[] args) {
        RiskMappingEntry exampleRiskMappingEntry = new RiskMappingEntry();

        // create a new MappedSecurityInfo
        MappedSecurityInfo exampleMappedSecurityInfo = new MappedSecurityInfo();
        // set RiskMappingEntry to MappedSecurityInfo
        exampleRiskMappingEntry.setActualInstance(exampleMappedSecurityInfo);
        // to get back the MappedSecurityInfo set earlier
        MappedSecurityInfo testMappedSecurityInfo = (MappedSecurityInfo) exampleRiskMappingEntry.getActualInstance();

        // create a new RiskExclusionInfo
        RiskExclusionInfo exampleRiskExclusionInfo = new RiskExclusionInfo();
        // set RiskMappingEntry to RiskExclusionInfo
        exampleRiskMappingEntry.setActualInstance(exampleRiskExclusionInfo);
        // to get back the RiskExclusionInfo set earlier
        RiskExclusionInfo testRiskExclusionInfo = (RiskExclusionInfo) exampleRiskMappingEntry.getActualInstance();
    }
}
```


