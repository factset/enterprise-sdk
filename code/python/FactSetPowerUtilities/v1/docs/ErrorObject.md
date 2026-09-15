# ErrorObject

Individual error detail.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | Machine-readable error code in camelCase. | 
**title** | **str** | Short human-readable summary matching the HTTP status reason phrase. | 
**detail** | **str** | Detailed human-readable explanation of this error occurrence. | 
**id** | **str** | Unique error identifier for tracing. | [optional] 
**links** | [**ErrorObjectLinks**](ErrorObjectLinks.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


