# ErrorObject

Schema describing an API error

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | A common or API-specific error code. | [optional] 
**detail** | **str** | A human-readable explanation specific to the occurrence of the problem. | [optional] 
**id** | **str** | A UUID for this particular ocurrence of the problem.  This will be logged for debugging. | [optional] 
**links** | [**ErrorObjectLinks**](ErrorObjectLinks.md) |  | [optional] 
**source** | [**ErrorObjectSource**](ErrorObjectSource.md) |  | [optional] 
**title** | **str** | A short, human-readable summary of the problem.  This should not change from occurrence to occurrence of the problem | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


