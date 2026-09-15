# MonthlyGenerationRecord

Monthly net generation and emissions record for a single plant.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantId&#x60;. | [optional] 
**factset_plant_id** | **str** | FactSet unique power plant asset identifier, as submitted in the request. | [optional] 
**factset_plant_unit_id** | **str, none_type** | FactSet unique power plant unit identifier. Unit-level attribution for monthly generation is pending confirmation with the data team; may be null. | [optional] 
**plant_name** | **str, none_type** | Official plant name. | [optional] 
**report_year** | **int, none_type** | Report year (four-digit). | [optional] 
**report_month** | **int, none_type** | Report month (1–12). | [optional] 
**generation_mwh** | **float, none_type** | Net generation in megawatt-hours (MWh) for the month. | [optional] 
**heat_input_mm_btu** | **float, none_type** | Total heat input in MMBtu for the month. | [optional] 
**co2_tons_emitted** | **float, none_type** | CO₂ emissions in metric tons for the month. | [optional] 
**co2_intensity_tons_per_mwh** | **float, none_type** | CO₂ intensity in metric tons per MWh. | [optional] 
**so2_tons_emitted** | **float, none_type** | SO₂ emissions in short tons for the month. | [optional] 
**nitrous_oxide_tons_emitted** | **float, none_type** | Nitrous oxide (N₂O) emissions in short tons for the month. | [optional] 
**primary_fuel_type** | **str, none_type** | Fuel type this record&#39;s generation and capacity are reported for. | [optional] 
**pp_fuel_capacity_mw** | **float, none_type** | Plant capacity for this fuel type, in MW. | [optional] 
**pp_fuel_capacity_factor** | **float, none_type** | Plant capacity factor for this fuel type, calculated from capacity and actual generation. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


