# EntityStructure


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | Unique FactSet-generated identifier representing an entity for the current entity identifier (-E) | [optional] 
**fsym_entity_id** | **str, none_type** | Unique FactSet-generated identifier representing an entity | [optional] 
**ultimate_parent_id** | **str, none_type** | The ultimate parent id of the entity. | [optional] 
**parent_entity_id** | **str, none_type** | Within the hierarchy, this id represents the immediate parent entity id for the level directly above. Ultimate parent id will return a blank string. | [optional] 
**level** | **int, none_type** | Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. | [optional] 
**inactive** | **int, none_type** | A flag for inactive securities; whereby 1 &#x3D; inactive and 0 &#x3D; active. | [optional] 
**description** | **str, none_type** | The proper name and entity type for the entity. | [optional] 
**request_id** | **str** | Identifier used in &#x60;ids&#x60;. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


