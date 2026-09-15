# FactSet.SDK.FactSetPowerUtilities.Model.MonthlyGenerationRecord
Monthly net generation and emissions record for a single plant.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantId&#x60;. | [optional] 
**FactsetPlantId** | **string** | FactSet unique power plant asset identifier, as submitted in the request. | [optional] 
**FactsetPlantUnitId** | **string** | FactSet unique power plant unit identifier. Unit-level attribution for monthly generation is pending confirmation with the data team; may be null. | [optional] 
**PlantName** | **string** | Official plant name. | [optional] 
**ReportYear** | **int?** | Report year (four-digit). | [optional] 
**ReportMonth** | **int?** | Report month (1–12). | [optional] 
**GenerationMwh** | **double?** | Net generation in megawatt-hours (MWh) for the month. | [optional] 
**HeatInputMmBtu** | **double?** | Total heat input in MMBtu for the month. | [optional] 
**Co2TonsEmitted** | **double?** | CO₂ emissions in metric tons for the month. | [optional] 
**Co2IntensityTonsPerMwh** | **double?** | CO₂ intensity in metric tons per MWh. | [optional] 
**So2TonsEmitted** | **double?** | SO₂ emissions in short tons for the month. | [optional] 
**NitrousOxideTonsEmitted** | **double?** | Nitrous oxide (N₂O) emissions in short tons for the month. | [optional] 
**PrimaryFuelType** | **string** | Fuel type this record&#39;s generation and capacity are reported for. | [optional] 
**PpFuelCapacityMw** | **double?** | Plant capacity for this fuel type, in MW. | [optional] 
**PpFuelCapacityFactor** | **double?** | Plant capacity factor for this fuel type, calculated from capacity and actual generation. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

