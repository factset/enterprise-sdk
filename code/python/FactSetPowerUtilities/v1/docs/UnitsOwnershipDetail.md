# UnitsOwnershipDetail

Unit ownership detail record with plant ID.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | 
**factset_plant_unit_id** | **str** | FactSet unique power plant unit identifier, as submitted in the request. | 
**factset_plant_id** | **str** | FactSet unique power plant identifier for the parent plant. | 
**owner_name** | **str, none_type** | Owner company name. | [optional] 
**factset_owner_id** | **str, none_type** | FactSet entity identifier for the owner. | [optional] 
**ownership_percentage** | **float, none_type** | Percentage of the unit owned by this owner. | [optional] 
**factset_ultimate_parent_entity_id** | **str, none_type** | FactSet entity identifier for the ultimate parent of the owner entity. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


