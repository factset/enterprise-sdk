# PlantPipelineDetail

Plant gas pipeline connection detail record.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | 
**factset_plant_unit_id** | **str** | FactSet unique power plant unit identifier, as submitted in the request. | 
**category** | [**CategoryPipeline**](CategoryPipeline.md) |  | 
**pipeline_name** | **str, none_type** | Name of the connected gas pipeline. | [optional] 
**pipeline_sequence** | **int, none_type** | When multiple pipelines supply a unit, indicates whether this is the first, second, or third pipeline. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


