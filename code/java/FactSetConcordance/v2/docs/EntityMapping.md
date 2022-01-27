

# EntityMapping

Concordance Company Entity Mapping object. Shows the mapping detail related to user's universe. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityId** | **String** | FactSet Entity Identifier of the entity matched to the submitted entity |  [optional]
**entityName** | **String** | Full name corresponding to the matched entity. |  [optional]
**clientId** | **String** | User-defined unique identifier provided by the user in the request |  [optional]
**clientName** | **String** | Name of the entity to match as specified in the request. |  [optional]
**clientCountry** | **String** | ISO2 country code specified in the request |  [optional]
**clientState** | **String** | State code specified in the request |  [optional]
**clientUrl** | **String** | URL specified in the request |  [optional]
**createdTime** | **OffsetDateTime** | Time when entity was created in UTC. |  [optional]
**updatedTime** | **OffsetDateTime** | Time when the submitted entity was last updated in UTC. |  [optional]
**mapStatus** | [**MapStatusEnum**](#MapStatusEnum) | Current status of the entity mapping. |  [optional]
**universeId** | **Integer** | The universe this mapping belongs to. Only set in v2 endpoints  |  [optional]



## Enum: MapStatusEnum

Name | Value
---- | -----
MAPPED | &quot;MAPPED&quot;
UNMAPPED | &quot;UNMAPPED&quot;
INDETERMINATE | &quot;INDETERMINATE&quot;


## Implemented Interfaces

* Serializable


