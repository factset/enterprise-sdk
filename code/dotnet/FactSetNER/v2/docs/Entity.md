# FactSet.SDK.FactSetNER.Model.Entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Type of the extracted named entity (NE). | [optional] 
**Text** | **string** | Text for the named entity, as found in the source text. | [optional] 
**StartChar** | **int** | Starting character position of the entity text. | [optional] 
**EndChar** | **int** | Ending character position of the entity text. | [optional] 
**LookupText** | **string** | Name of the FactSet entity linked to the text. | [optional] 
**EntityId** | **string** | FactSet Entity ID for the extracted entity. | [optional] 
**LookupUrl** | **string** | URL to the extracted entity in FactSet. | [optional] 
**AssociatedOrgs** | [**List&lt;AssociatedOrganization&gt;**](AssociatedOrganization.md) | Organizations associated with this entity. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

