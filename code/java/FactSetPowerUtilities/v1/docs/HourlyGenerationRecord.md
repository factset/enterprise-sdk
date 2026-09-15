

# HourlyGenerationRecord

Hourly net generation and emissions record for a single power plant unit.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. |  [optional]
**factsetPlantUnitId** | **String** | FactSet unique power plant unit identifier, as submitted in the request. |  [optional]
**factsetPlantId** | **String** | FactSet unique power plant asset identifier for the plant this unit belongs to. |  [optional]
**plantName** | **String** | Official plant name. |  [optional]
**reportDate** | **LocalDate** | Report date (YYYY-MM-DD). |  [optional]
**reportHour** | **Integer** | Report hour (0–23) in local prevailing time. |  [optional]
**generationMwh** | **Double** | Net generation in megawatt-hours (MWh) for the hour. |  [optional]
**heatInputMmBtu** | **Double** | Heat input in MMBtu for the hour. |  [optional]
**steamGen1000Lbs** | **Double** | Steam generation for the hour, in thousands of pounds. |  [optional]
**co2TonsEmitted** | **Double** | CO₂ emissions in metric tons for the hour. |  [optional]
**so2TonsEmitted** | **Double** | SO₂ emissions in metric tons for the hour. |  [optional]
**nitrousOxideEmitted** | **Double** | Nitrous oxide (N₂O) emissions in metric tons for the hour. |  [optional]
**primaryFuelType** | **String** | Fuel type used for generation during this hour. |  [optional]


## Implemented Interfaces

* Serializable


