# FactSet.SDK.FactSetPowerUtilities.Model.MarketDataRecord
A single balancing authority market data record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request. Duplicates &#x60;factsetBaId&#x60; (Generation) or &#x60;factsetBaSubRegId&#x60; (Demand, Interchange). | [optional] 
**FactsetBaId** | **string** | (Generation) FactSet balancing authority identifier, as submitted in the request. | [optional] 
**FactsetBaSubRegId** | **string** | (Demand, Interchange) FactSet balancing authority sub-region identifier, as submitted in the request. | [optional] 
**Category** | **string** | Data category for this record. | [optional] 
**ReportDate** | **DateTime?** | Report date (YYYY-MM-DD), in UTC. | [optional] 
**ReportHour** | **int?** | Report hour in UTC (0–23). Null for daily aggregates. | [optional] 
**PrimaryFuelType** | **string** | (Generation) Primary fuel type this generation value is reported for. | [optional] 
**GenerationMw** | **double?** | (Generation) Net generation in MWh for the hour, by fuel type. | [optional] 
**DemandMwHr** | **double?** | (Demand) Actual electricity demand (load) in MWh for the hour. | [optional] 
**RespondentFactsetBaSubRegId** | **string** | (Interchange) Counterpart balancing authority sub-region identifier. | [optional] 
**NetInterchangeMw** | **double?** | (Interchange) Net interchange in MW. Positive values indicate net exports from the reporting BA sub-region; negative values indicate net imports. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

