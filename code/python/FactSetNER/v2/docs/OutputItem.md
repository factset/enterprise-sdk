# OutputItem

Result for a single input text containing extracted entities, any processing errors, and entity lookup statuses.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entities** | [**[EntityData], none_type**](EntityData.md) | Array of extracted entities from the input text. Each entity object contains properties like text, type, startChar, endChar, and lookup-related fields such as entityId, lookupText, and associatedOrgs. | [optional] 
**error** | [**OutputItemError**](OutputItemError.md) |  | [optional] 
**lookup_statuses** | [**{str: (LookupStatus,)}, none_type**](LookupStatus.md) | Object mapping entity types to their lookup resolution statuses. Each key is an entity type and each value indicates whether the lookup succeeded (success), returned no match (noMatch), or failed (failed). | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


