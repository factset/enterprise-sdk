# FactSet.SDK.OpenRisk.Model.AdditionalCalculationInputsMarketExcess
User-defined values (all required) to compute the desired arbitrary 'excess return' of the market portfolio (which is usually intended to be defined as a broad market index).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Return** | **decimal** | User-defined arbitrary return value measured from the market portfolio. The value is expected to be a scalar and the return horizon must match that of the factor returns. For example, if the factor returns used are daily-basis, the market return needs to be 1-day market return for the calculation. This number will be one of the inputs to calculate market timing effect. | 
**RiskFreeRate** | **decimal** | User-defined risk-free rate of return whose horizon must match that of the factor returns. This number will be one of the inputs to calculate market timing effect. | 
**RiskPremium** | **decimal** | Expected return of the market portfolio which is required to be an annualized return. This number will be one of the inputs to calculate market timing effect. | 
**RiskPremiumPeriodsPerYear** | **int** | Deannualization factor on the Market Risk Premium which can be any user-defined positive integer number. This number will be used to deannualize Market Risk Premium so that the expected market return horizon will match that of the factor returns. For example, if a risk model has daily factor returns, select desired integer such as 365 or 252. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

