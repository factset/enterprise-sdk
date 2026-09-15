# FactSet.SDK.FactSetPowerUtilities.Model.HourlyGenerationRecord
Hourly net generation and emissions record for a single power plant unit.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | [optional] 
**FactsetPlantUnitId** | **string** | FactSet unique power plant unit identifier, as submitted in the request. | [optional] 
**FactsetPlantId** | **string** | FactSet unique power plant asset identifier for the plant this unit belongs to. | [optional] 
**PlantName** | **string** | Official plant name. | [optional] 
**ReportDate** | **DateTime?** | Report date (YYYY-MM-DD). | [optional] 
**ReportHour** | **int?** | Report hour (0–23) in local prevailing time. | [optional] 
**GenerationMwh** | **double?** | Net generation in megawatt-hours (MWh) for the hour. | [optional] 
**HeatInputMmBtu** | **double?** | Heat input in MMBtu for the hour. | [optional] 
**SteamGen1000Lbs** | **double?** | Steam generation for the hour, in thousands of pounds. | [optional] 
**Co2TonsEmitted** | **double?** | CO₂ emissions in metric tons for the hour. | [optional] 
**So2TonsEmitted** | **double?** | SO₂ emissions in metric tons for the hour. | [optional] 
**NitrousOxideEmitted** | **double?** | Nitrous oxide (N₂O) emissions in metric tons for the hour. | [optional] 
**PrimaryFuelType** | **string** | Fuel type used for generation during this hour. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

