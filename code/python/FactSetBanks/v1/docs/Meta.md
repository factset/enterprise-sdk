# Meta

Response metadata including pagination and request tracking information.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pagination** | [**Pagination**](Pagination.md) |  | 
**requested_ids** | **int** | Total number of identifiers submitted in the request. | [optional] 
**failed_ids** | **[str]** | Identifiers from the request that failed (invalid format, empty, or not found). Empty array when all submitted identifiers resolved successfully. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


