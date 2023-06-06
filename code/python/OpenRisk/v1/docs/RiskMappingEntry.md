# RiskMappingEntry

Either risk model covered security resolution or uncovered security reason

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**covered** | **bool** | Coverage flag. The value will always be false to indicate the security is excluded. | [optional] 
**id** | **str** | Risk model canonical security identifier alias if directly covered in the model | [optional] 
**model_class** | **str** | **(since 1.19.0)** Security asset classification according to the risk model, if available and determinable | [optional] 
**exclusion_info** | [**RiskExclusionInfoExclusionInfo**](RiskExclusionInfoExclusionInfo.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


