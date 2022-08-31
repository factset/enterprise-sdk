# MappedSecurityInfo

Risk model covered security resolution

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Risk model canonical security identifier alias if directly covered in the model | 
**model_class** | **str** | **(since 1.19.0)** Security asset classification according to the risk model, if available and determinable | 
**covered** | **bool** | Coverage flag. The value will be true to indicate the security is covered. | defaults to True
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


