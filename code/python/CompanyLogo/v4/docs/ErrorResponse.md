# ErrorResponse

Error response schema following FactSet's MDG API standards for error handling and reporting.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**ErrorResponseMeta**](ErrorResponseMeta.md) |  | 
**errors** | [**[ErrorDetail]**](ErrorDetail.md) | Array of error objects | 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


