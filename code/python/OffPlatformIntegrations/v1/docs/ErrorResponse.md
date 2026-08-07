# ErrorResponse

Standard error response envelope returned on all non-successful responses.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**[ErrorItem]**](ErrorItem.md) | A list of one or more errors that describe why the request failed. | 
**data** | [**[AccessCheckResult]**](AccessCheckResult.md) | Present only when some codes were successfully decrypted alongside failures. Contains the results for the successfully decrypted codes. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


