# FactSet.SDK.OpenRisk.Model.AdditionalCalculationInputs
Additional user-defined calculation input values. For example, some may be required for some Risk-Based Performance Attribution (RBPA) stats, such as 'ResidualFactorReturnsCSR' and 'DeannualizedActiveFactorRisk'.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MarketExcess** | [**AdditionalCalculationInputsMarketExcess**](AdditionalCalculationInputsMarketExcess.md) |  | [optional] 
**CalculationPeriodsPerYear** | **int** | Deannualization factor for certain RBPA risk statistics which should match that of desired calculation frequency. Examples: If the risk model is monthly or monthly factor returns are being used, this should be 12. If the risk model is daily, select desired integer such as 365 or 252. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

