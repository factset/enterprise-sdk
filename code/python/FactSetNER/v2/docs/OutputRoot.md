# OutputRoot

Response payload containing extracted entities, processing metadata, and status information.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**[OutputItem]**](OutputItem.md) | Array of entity extraction results, one object per input text provided in the request. | 
**meta** | [**ResponseMeta**](ResponseMeta.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


