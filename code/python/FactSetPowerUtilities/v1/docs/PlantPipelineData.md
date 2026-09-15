# PlantPipelineData

Query parameters for plant gas pipeline connection records. You may provide either plant IDs or unit IDs; when a plant ID is provided, all units within that plant are returned.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**CategoryPipeline**](CategoryPipeline.md) |  | 
**ids** | [**PlantUnitIds**](PlantUnitIds.md) |  | 
**min_capacity_mw** | **float, none_type** | Filter by minimum nameplate capacity in megawatts (MW), inclusive. Returns units with capacity greater than or equal to this value. Note - capacity value is only returned in the Metadata response. | [optional] 
**max_capacity_mw** | **float, none_type** | Filter by maximum nameplate capacity in megawatts (MW), inclusive. Returns units with capacity less than or equal to this value. Note - capacity value is only returned in the Metadata response. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


