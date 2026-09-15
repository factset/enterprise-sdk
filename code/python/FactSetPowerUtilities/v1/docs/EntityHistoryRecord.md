# EntityHistoryRecord

An entity or security history record, combining security-to-entity identifier mappings with entity ownership structure history.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**factset_entity_id** | **str, none_type** | FactSet entity identifier. | [optional] 
**factset_security_id** | **str, none_type** | FactSet security identifier, if this record maps a security to an entity. | [optional] 
**factset_parent_entity_id** | **str, none_type** | FactSet identifier for the immediate majority owner of this entity&#39;s equity, if this record reflects ownership structure. | [optional] 
**factset_ult_parent_entity_id** | **str, none_type** | FactSet identifier for the ultimate owner of this entity&#39;s equity, if this record reflects ownership structure. | [optional] 
**depth** | **int, none_type** | Position of the entity within its ownership tree. 1 &#x3D; ultimate parent, 2 &#x3D; one level below the ultimate parent, etc. | [optional] 
**start_date** | **date, none_type** | Effective start date of this record. | [optional] 
**end_date** | **date, none_type** | Effective end date of this record. Null if the record is currently active. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


