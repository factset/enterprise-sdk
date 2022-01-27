# FactSet.SDK.FactSetEntity.Model.UtlimateEntityStructure

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | Unique FactSet-generated identifier representing an entity for the current entity identifier (-E) | [optional] 
**FsymEntityId** | **string** | Unique FactSet-generated identifier representing an entity | [optional] 
**UltimateParentId** | **string** | The ultimate parent id of the entity. | [optional] 
**ParentEntityId** | **string** | Within the hierarchy, this id represents the immediate parent entity id for the level directly above. Ultimate parent id will return a blank string. | [optional] 
**Level** | **int** | Level within the ultimate entity structure. This is taken from the perspective of the ultimate parent id and the full entity hierarchy. | [optional] 
**Inactive** | **int** | A flag for inactive securities; whereby 1 &#x3D; inactive and 0 &#x3D; active. | [optional] 
**Description** | **string** | The proper name and entity type for the entity. | [optional] 
**RequestId** | **string** | Identifier used in &#x60;ids&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

