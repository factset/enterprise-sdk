# ForbiddenErrorObject

Single error object returned in response to a user without entitlements to a specific resource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Id of error | 
**detail** | **str** | Details of error | 
**title** | **str** | Title of error | defaults to "Not Authorized"
**code** | **str** | Code of error | defaults to "forbidden"
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


