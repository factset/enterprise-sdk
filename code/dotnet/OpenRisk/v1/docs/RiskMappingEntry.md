# FactSet.SDK.OpenRisk.Model.RiskMappingEntry
Either risk model covered security resolution or uncovered security reason

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Covered** | **bool** | Coverage flag. The value will be false to indicate the security is excluded. | [default to false]
**Id** | **string** | Risk model canonical security identifier alias if directly covered in the model | 
**ModelClass** | **string** | **(since 1.19.0)** Security asset classification according to the risk model, if available and determinable | 
**ExclusionInfo** | [**RiskExclusionInfoExclusionInfo**](RiskExclusionInfoExclusionInfo.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

