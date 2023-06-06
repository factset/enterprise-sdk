# openrisk.RiskMappingEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**covered** | **Boolean** | Coverage flag. The value will always be false to indicate the security is excluded. | 
**id** | **String** | Risk model canonical security identifier alias if directly covered in the model | 
**modelClass** | **String** | **(since 1.19.0)** Security asset classification according to the risk model, if available and determinable | 
**exclusionInfo** | [**RiskExclusionInfoExclusionInfo**](RiskExclusionInfoExclusionInfo.md) |  | 



## Enum: ModelClassEnum


* `Unknown` (value: `"Unknown"`)

* `CompositeAsset` (value: `"CompositeAsset"`)




