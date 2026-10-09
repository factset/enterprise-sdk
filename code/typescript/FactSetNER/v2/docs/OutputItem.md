# factsetner.OutputItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entities** | **[Object]** | Array of extracted entities from the input text. Each entity object contains properties like text, type, startChar, endChar, and lookup-related fields such as entityId, lookupText, and associatedOrgs. | [optional] 
**error** | [**OutputItemError**](OutputItemError.md) |  | [optional] 
**lookupStatuses** | [**{String: LookupStatus}**](LookupStatus.md) | Object mapping entity types to their lookup resolution statuses. Each key is an entity type and each value indicates whether the lookup succeeded (success), returned no match (noMatch), or failed (failed). | [optional] 


