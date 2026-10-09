# FactSet.SDK.FactSetNER.Model.OutputItem
Result for a single input text containing extracted entities, any processing errors, and entity lookup statuses.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Entities** | **List&lt;Dictionary&gt;** | Array of extracted entities from the input text. Each entity object contains properties like text, type, startChar, endChar, and lookup-related fields such as entityId, lookupText, and associatedOrgs. | [optional] 
**Error** | [**OutputItemError**](OutputItemError.md) |  | [optional] 
**LookupStatuses** | [**Dictionary&lt;string, LookupStatus&gt;**](LookupStatus.md) | Object mapping entity types to their lookup resolution statuses. Each key is an entity type and each value indicates whether the lookup succeeded (success), returned no match (noMatch), or failed (failed). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

