# FactSet.SDK.FactSetMacroeconomics.Model.ErrorObject
Error object containing status code, error message, and detailed explanation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Guid** | Unique error instance identifier for tracking purposes. | [optional] 
**Code** | **string** | Machine-readable error code indicating the error category. Common values are Bad Request, ValidationError, Forbidden, Not Found, Unsupported Media Type, Too Many Requests, Internal Server Error. | [optional] 
**Title** | **string** | The plain text error message. | [optional] 
**Detail** | **string** | Detailed error description with actionable guidance. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

