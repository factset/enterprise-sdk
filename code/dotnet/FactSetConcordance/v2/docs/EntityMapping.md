# FactSet.SDK.FactSetConcordance.Model.EntityMapping
Concordance Company Entity Mapping object. Shows the mapping detail related to user's universe. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntityId** | **string** | FactSet Entity Identifier of the entity matched to the submitted entity | [optional] 
**EntityName** | **string** | Full name corresponding to the matched entity. | [optional] 
**ClientId** | **string** | User-defined unique identifier provided by the user in the request | [optional] 
**ClientName** | **string** | Name of the entity to match as specified in the request. | [optional] 
**ClientCountry** | **string** | ISO2 country code specified in the request | [optional] 
**ClientState** | **string** | State code specified in the request | [optional] 
**ClientUrl** | **string** | URL specified in the request | [optional] 
**CreatedTime** | **DateTime?** | Time when entity was created in UTC. | [optional] 
**UpdatedTime** | **DateTime?** | Time when the submitted entity was last updated in UTC. | [optional] 
**MapStatus** | **string** | Current status of the entity mapping. | [optional] 
**UniverseId** | **int?** | The universe this mapping belongs to. Only set in v2 endpoints  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

