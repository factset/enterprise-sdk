# EntityUniverse

Universe Statistics and array of `Entity Mapping` objects. Universes are defined by the users FactSet USERNAME only, and not USERNAME-SERIAL.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total_count** | **int** | Total number of entities in the universe | [optional] 
**mapped_count** | **int** | Number of MAPPED entities in the universe | [optional] 
**indeterminate_count** | **int** | Number of INDETERMINATE entities in the universe | [optional] 
**unmapped_count** | **int** | Number of UNMAPPED entities in the universe | [optional] 
**entities** | [**[EntityMapping]**](EntityMapping.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


