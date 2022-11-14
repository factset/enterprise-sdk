# FactSet.SDK.NaturalLanguageProcessing.Model.NEREntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssociatedOrgs** | [**List&lt;NEROrganization&gt;**](NEROrganization.md) | Organizations that are associated with this entity | [optional] 
**EndChar** | **int** | The index of the last character of the entity text | 
**EntityId** | **string** | The FactSet Entity ID that is linked to this text. | [optional] 
**LookupText** | **string** | Name of the FactSet entity that is linked to this text. | [optional] 
**LookupUrl** | **string** | A link to the information page for the given entity | [optional] 
**StartChar** | **int** | The index of the starting character of the entity text | 
**Text** | **string** | The substring of the source text that ws found as an entity | 
**Type** | **string** | The type of entity (organization, person, etc.) that was found | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

