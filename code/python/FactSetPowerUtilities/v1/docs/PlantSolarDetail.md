# PlantSolarDetail

Solar plant technical specification detail record.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | 
**factset_plant_unit_id** | **str** | FactSet unique power plant unit identifier, as submitted in the request. | 
**category** | [**CategorySolar**](CategorySolar.md) |  | 
**solar_installed_capacity_mw** | **float, none_type** | Total installed solar capacity in MW DC. | [optional] 
**tracking_type** | **str, none_type** | Solar array/tracking system type (e.g., &#x60;\&quot;Fixed Rack\&quot;&#x60;, &#x60;\&quot;1 Axis\&quot;&#x60;). | [optional] 
**azimuth_angle** | **float, none_type** | For fixed-tilt or single-axis arrays, the fixed azimuth angle in degrees (0 &#x3D; north, 90 &#x3D; east, 180 &#x3D; south, 270 &#x3D; west). | [optional] 
**tilt_angle_degrees** | **float, none_type** | For fixed-tilt or single-axis arrays, the fixed tilt angle in degrees from horizontal (0 &#x3D; horizontal, 90 &#x3D; vertical). | [optional] 
**is_thin_film** | **bool, none_type** | Whether the array uses thin-film module technology. | [optional] 
**acres** | **float, none_type** | Land area used by the array, in acres. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


