

# MonthlyGenerationRecord

Monthly net generation and emissions record for a single plant.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantId&#x60;. |  [optional]
**factsetPlantId** | **String** | FactSet unique power plant asset identifier, as submitted in the request. |  [optional]
**factsetPlantUnitId** | **String** | FactSet unique power plant unit identifier. Unit-level attribution for monthly generation is pending confirmation with the data team; may be null. |  [optional]
**plantName** | **String** | Official plant name. |  [optional]
**reportYear** | **Integer** | Report year (four-digit). |  [optional]
**reportMonth** | **Integer** | Report month (1–12). |  [optional]
**generationMwh** | **Double** | Net generation in megawatt-hours (MWh) for the month. |  [optional]
**heatInputMmBtu** | **Double** | Total heat input in MMBtu for the month. |  [optional]
**co2TonsEmitted** | **Double** | CO₂ emissions in metric tons for the month. |  [optional]
**co2IntensityTonsPerMwh** | **Double** | CO₂ intensity in metric tons per MWh. |  [optional]
**so2TonsEmitted** | **Double** | SO₂ emissions in short tons for the month. |  [optional]
**nitrousOxideTonsEmitted** | **Double** | Nitrous oxide (N₂O) emissions in short tons for the month. |  [optional]
**primaryFuelType** | **String** | Fuel type this record&#39;s generation and capacity are reported for. |  [optional]
**ppFuelCapacityMw** | **Double** | Plant capacity for this fuel type, in MW. |  [optional]
**ppFuelCapacityFactor** | **Double** | Plant capacity factor for this fuel type, calculated from capacity and actual generation. |  [optional]


## Implemented Interfaces

* Serializable


