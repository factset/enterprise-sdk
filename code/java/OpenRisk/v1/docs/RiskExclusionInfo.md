

# RiskExclusionInfo

Risk model uncovered security reason

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**covered** | **Boolean** | Coverage flag. The value will always be false to indicate the security is excluded. | 
**exclusionInfo** | [**RiskExclusionInfoExclusionInfo**](RiskExclusionInfoExclusionInfo.md) |  | 
**modelClass** | [**ModelClassEnum**](#ModelClassEnum) | **(since 1.19.0)** Security asset classification according to the risk model, if available and determinable | 



## Enum: ModelClassEnum

Name | Value
---- | -----
UNKNOWN | &quot;Unknown&quot;
COMPOSITEASSET | &quot;CompositeAsset&quot;


## Implemented Interfaces

* Serializable


