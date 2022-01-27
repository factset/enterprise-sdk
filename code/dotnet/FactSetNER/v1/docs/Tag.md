# FactSet.SDK.FactSetNER.Model.Tag

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Type of the extracted named-entity (NE). | [optional] 
**SubType** | **string** | More specific sub-type (e.g., NE_COUNTRY) of the named-entity (if applicable). | [optional] 
**Text** | **string** | Text for the named-entity (NE), as extracted from the given document. | [optional] 
**Score** | **decimal** |  | [optional] 
**StartChar** | **int** | Starting character position of the named-entity text (relative to any offset provided (default offset&#x3D;0)). | [optional] 
**EndChar** | **int** | Ending character position of the named-entity text (relative to any offset provided (default offset&#x3D;0)) | [optional] 
**LookupText** | **string** | Best-matching (FactSet) looked-up name for the extracted named-entity. | [optional] 
**NeId** | **string** | Best-matching (FactSet) entity-id for the extracted named-entity | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

