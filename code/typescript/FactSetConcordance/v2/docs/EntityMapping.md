# factsetconcordance.EntityMapping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityId** | **String** | FactSet Entity Identifier of the entity matched to the submitted entity | [optional] 
**entityName** | **String** | Full name corresponding to the matched entity. | [optional] 
**clientId** | **String** | User-defined unique identifier provided by the user in the request | [optional] 
**clientName** | **String** | Name of the entity to match as specified in the request. | [optional] 
**clientCountry** | **String** | ISO2 country code specified in the request | [optional] 
**clientState** | **String** | State code specified in the request | [optional] 
**clientUrl** | **String** | URL specified in the request | [optional] 
**createdTime** | **Date** | Time when entity was created in UTC. | [optional] 
**updatedTime** | **Date** | Time when the submitted entity was last updated in UTC. | [optional] 
**mapStatus** | **String** | Current status of the entity mapping. | [optional] 
**universeId** | **Number** | The universe this mapping belongs to. Only set in v2 endpoints  | [optional] 



## Enum: MapStatusEnum


* `MAPPED` (value: `"MAPPED"`)

* `UNMAPPED` (value: `"UNMAPPED"`)

* `INDETERMINATE` (value: `"INDETERMINATE"`)




