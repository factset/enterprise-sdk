# ErrorObject

Error object containing status code, error message, and detailed explanation.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique error instance identifier for tracking purposes. | [optional] 
**code** | **str** | Machine-readable error code indicating the error category. Common values are Bad Request, ValidationError, Forbidden, Not Found, Unsupported Media Type, Too Many Requests, Internal Server Error. | [optional] 
**title** | **str** | The plain text error message. | [optional] 
**detail** | **str** | Detailed error description with actionable guidance. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


