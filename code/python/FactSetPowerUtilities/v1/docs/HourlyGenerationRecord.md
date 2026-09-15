# HourlyGenerationRecord

Hourly net generation and emissions record for a single power plant unit.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | [optional] 
**factset_plant_unit_id** | **str** | FactSet unique power plant unit identifier, as submitted in the request. | [optional] 
**factset_plant_id** | **str, none_type** | FactSet unique power plant asset identifier for the plant this unit belongs to. | [optional] 
**plant_name** | **str, none_type** | Official plant name. | [optional] 
**report_date** | **date, none_type** | Report date (YYYY-MM-DD). | [optional] 
**report_hour** | **int, none_type** | Report hour (0–23) in local prevailing time. | [optional] 
**generation_mwh** | **float, none_type** | Net generation in megawatt-hours (MWh) for the hour. | [optional] 
**heat_input_mm_btu** | **float, none_type** | Heat input in MMBtu for the hour. | [optional] 
**steam_gen1000_lbs** | **float, none_type** | Steam generation for the hour, in thousands of pounds. | [optional] 
**co2_tons_emitted** | **float, none_type** | CO₂ emissions in metric tons for the hour. | [optional] 
**so2_tons_emitted** | **float, none_type** | SO₂ emissions in metric tons for the hour. | [optional] 
**nitrous_oxide_emitted** | **float, none_type** | Nitrous oxide (N₂O) emissions in metric tons for the hour. | [optional] 
**primary_fuel_type** | **str, none_type** | Fuel type used for generation during this hour. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


