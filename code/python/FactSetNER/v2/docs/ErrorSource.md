# ErrorSource

Source location information for an error, identifying the request parameter or JSON pointer where the error occurred.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameter** | **str** | The name of the request parameter where the error occurred. | [optional] 
**pointer** | **str** | JSON Pointer (RFC 6901) referencing the location in the request body where the error occurred. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


