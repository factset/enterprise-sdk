# AdditionalCalculationInputs

Additional user-defined calculation input values. For example, some may be required for some Risk-Based Performance Attribution (RBPA) stats, such as 'ResidualFactorReturnsCSR' and 'DeannualizedActiveFactorRisk'.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**market_excess** | [**AdditionalCalculationInputsMarketExcess**](AdditionalCalculationInputsMarketExcess.md) |  | [optional] 
**calculation_periods_per_year** | **int** | Deannualization factor for certain RBPA risk statistics which should match that of desired calculation frequency. Examples: If the risk model is monthly or monthly factor returns are being used, this should be 12. If the risk model is daily, select desired integer such as 365 or 252. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


