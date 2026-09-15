# MarketDataRecord

A single balancing authority market data record.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier as submitted in the request. Duplicates &#x60;factsetBaId&#x60; (Generation) or &#x60;factsetBaSubRegId&#x60; (Demand, Interchange). | [optional] 
**factset_ba_id** | **str, none_type** | (Generation) FactSet balancing authority identifier, as submitted in the request. | [optional] 
**factset_ba_sub_reg_id** | **str, none_type** | (Demand, Interchange) FactSet balancing authority sub-region identifier, as submitted in the request. | [optional] 
**category** | **str** | Data category for this record. | [optional] 
**report_date** | **date, none_type** | Report date (YYYY-MM-DD), in UTC. | [optional] 
**report_hour** | **int, none_type** | Report hour in UTC (0–23). Null for daily aggregates. | [optional] 
**primary_fuel_type** | **str, none_type** | (Generation) Primary fuel type this generation value is reported for. | [optional] 
**generation_mw** | **float, none_type** | (Generation) Net generation in MWh for the hour, by fuel type. | [optional] 
**demand_mw_hr** | **float, none_type** | (Demand) Actual electricity demand (load) in MWh for the hour. | [optional] 
**respondent_factset_ba_sub_reg_id** | **str, none_type** | (Interchange) Counterpart balancing authority sub-region identifier. | [optional] 
**net_interchange_mw** | **float, none_type** | (Interchange) Net interchange in MW. Positive values indicate net exports from the reporting BA sub-region; negative values indicate net imports. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


