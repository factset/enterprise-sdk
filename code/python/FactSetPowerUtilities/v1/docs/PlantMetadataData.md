# PlantMetadataData

Query parameters for plant unit metadata records. You may provide either plant IDs or unit IDs; when a plant ID is provided, all units within that plant are returned.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**CategoryMetadata**](CategoryMetadata.md) |  | 
**ids** | [**PlantUnitIds**](PlantUnitIds.md) |  | 
**plant_status** | **str, none_type** | Filter results by operational status. | [optional] 
**min_capacity_mw** | **float, none_type** | Filter by minimum nameplate capacity in megawatts (MW), inclusive. Returns units with capacity greater than or equal to this value. | [optional] 
**max_capacity_mw** | **float, none_type** | Filter by maximum nameplate capacity in megawatts (MW), inclusive. Returns units with capacity less than or equal to this value. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


