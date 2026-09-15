# ErrorResponse

Standard error response object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique identifier for the error | [optional] 
**status** | **int** | HTTP status code representing the outcome of the HTTP request. | [optional] 
**error** | **str** | The plain text error message | [optional] 
**errors** | [**[ErrorDetail]**](ErrorDetail.md) | List of detailed error messages | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


