

# EntityStructure


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Unique FactSet-generated identifier representing an entity for the current entity identifier (-E) |  [optional]
**fsymEntityId** | **String** | Unique FactSet-generated identifier representing an entity |  [optional]
**ultimateParentId** | **String** | The ultimate parent id of the entity. |  [optional]
**parentEntityId** | **String** | Within the hierarchy, this id represents the immediate parent entity id for the level directly above. Ultimate parent id will return a blank string. |  [optional]
**level** | **Integer** | Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. |  [optional]
**inactive** | **Integer** | A flag for inactive securities; whereby 1 &#x3D; inactive and 0 &#x3D; active. |  [optional]
**description** | **String** | The proper name and entity type for the entity. |  [optional]
**requestId** | **String** | Identifier used in &#x60;ids&#x60;. |  [optional]


## Implemented Interfaces

* Serializable


