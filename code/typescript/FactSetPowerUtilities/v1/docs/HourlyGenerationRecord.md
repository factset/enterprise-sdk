# factsetpowerutilities.HourlyGenerationRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | [optional] 
**factsetPlantUnitId** | **String** | FactSet unique power plant unit identifier, as submitted in the request. | [optional] 
**factsetPlantId** | **String** | FactSet unique power plant asset identifier for the plant this unit belongs to. | [optional] 
**plantName** | **String** | Official plant name. | [optional] 
**reportDate** | **Date** | Report date (YYYY-MM-DD). | [optional] 
**reportHour** | **Number** | Report hour (0–23) in local prevailing time. | [optional] 
**generationMwh** | **Number** | Net generation in megawatt-hours (MWh) for the hour. | [optional] 
**heatInputMmBtu** | **Number** | Heat input in MMBtu for the hour. | [optional] 
**steamGen1000Lbs** | **Number** | Steam generation for the hour, in thousands of pounds. | [optional] 
**co2TonsEmitted** | **Number** | CO₂ emissions in metric tons for the hour. | [optional] 
**so2TonsEmitted** | **Number** | SO₂ emissions in metric tons for the hour. | [optional] 
**nitrousOxideEmitted** | **Number** | Nitrous oxide (N₂O) emissions in metric tons for the hour. | [optional] 
**primaryFuelType** | **String** | Fuel type used for generation during this hour. | [optional] 


