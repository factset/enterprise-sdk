# FactSet.SDK.FactSetEntity.Model.EntityStructure

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | Unique FactSet-generated identifier representing an entity for the current entity identifier (-E) | [optional] 
**FsymEntityId** | **string** | Unique FactSet-generated identifier representing an entity | [optional] 
**UltimateParentId** | **string** | The ultimate parent id of the entity. | [optional] 
**ParentEntityId** | **string** | Within the hierarchy, this id represents the immediate parent entity id for the level directly above. Ultimate parent id will return a blank string. | [optional] 
**Level** | **int** | Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. | [optional] 
**Inactive** | **int** | A flag for inactive securities; whereby 1 &#x3D; inactive and 0 &#x3D; active. | [optional] 
**Description** | **string** | The proper name and entity type for the entity. | [optional] 
**RequestId** | **string** | Identifier used in &#x60;ids&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

