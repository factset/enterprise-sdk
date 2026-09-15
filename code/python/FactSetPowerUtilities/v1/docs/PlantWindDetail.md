# PlantWindDetail

Wind plant technical specification detail record.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | 
**factset_plant_unit_id** | **str** | FactSet unique power plant unit identifier, as submitted in the request. | 
**category** | [**CategoryWind**](CategoryWind.md) |  | 
**turbine_count** | **int, none_type** | Total number of wind turbines. | [optional] 
**turbine_manufacturer** | **str, none_type** | Predominant wind turbine manufacturer at the unit. | [optional] 
**factset_manuf_entity_id** | **str, none_type** | FactSet entity identifier for the predominant turbine manufacturer. | [optional] 
**turbine_model** | **str, none_type** | Predominant wind turbine model designation at the unit. | [optional] 
**hub_height_m** | **float, none_type** | Average turbine hub height in meters. | [optional] 
**swept_area_m2** | **float, none_type** | Average area swept by the turbine rotor, in square meters. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


