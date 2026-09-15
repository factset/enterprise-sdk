# factsetpowerutilities.MarketDataRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request. Duplicates &#x60;factsetBaId&#x60; (Generation) or &#x60;factsetBaSubRegId&#x60; (Demand, Interchange). | [optional] 
**factsetBaId** | **String** | (Generation) FactSet balancing authority identifier, as submitted in the request. | [optional] 
**factsetBaSubRegId** | **String** | (Demand, Interchange) FactSet balancing authority sub-region identifier, as submitted in the request. | [optional] 
**category** | **String** | Data category for this record. | [optional] 
**reportDate** | **Date** | Report date (YYYY-MM-DD), in UTC. | [optional] 
**reportHour** | **Number** | Report hour in UTC (0–23). Null for daily aggregates. | [optional] 
**primaryFuelType** | **String** | (Generation) Primary fuel type this generation value is reported for. | [optional] 
**generationMw** | **Number** | (Generation) Net generation in MWh for the hour, by fuel type. | [optional] 
**demandMwHr** | **Number** | (Demand) Actual electricity demand (load) in MWh for the hour. | [optional] 
**respondentFactsetBaSubRegId** | **String** | (Interchange) Counterpart balancing authority sub-region identifier. | [optional] 
**netInterchangeMw** | **Number** | (Interchange) Net interchange in MW. Positive values indicate net exports from the reporting BA sub-region; negative values indicate net imports. | [optional] 



## Enum: CategoryEnum


* `Generation` (value: `"Generation"`)

* `Demand` (value: `"Demand"`)

* `Interchange` (value: `"Interchange"`)




