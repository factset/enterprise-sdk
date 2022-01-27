# UtlimateEntityStructure


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str** | Unique FactSet-generated identifier representing an entity for the current entity identifier (-E) | [optional] 
**fsym_entity_id** | **str** | Unique FactSet-generated identifier representing an entity | [optional] 
**ultimate_parent_id** | **str** | The ultimate parent id of the entity. | [optional] 
**parent_entity_id** | **str** | Within the hierarchy, this id represents the immediate parent entity id for the level directly above. Ultimate parent id will return a blank string. | [optional] 
**level** | **int** | Level within the ultimate entity structure. This is taken from the perspective of the ultimate parent id and the full entity hierarchy. | [optional] 
**inactive** | **int** | A flag for inactive securities; whereby 1 &#x3D; inactive and 0 &#x3D; active. | [optional] 
**description** | **str** | The proper name and entity type for the entity. | [optional] 
**request_id** | **str** | Identifier used in &#x60;ids&#x60;. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


