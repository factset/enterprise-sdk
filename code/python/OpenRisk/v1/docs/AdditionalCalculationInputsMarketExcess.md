# AdditionalCalculationInputsMarketExcess

User-defined values (all required) to compute the desired arbitrary 'excess return' of the market portfolio (which is usually intended to be defined as a broad market index).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_return** | **float** | User-defined arbitrary return value measured from the market portfolio. The value is expected to be a scalar and the return horizon must match that of the factor returns. For example, if the factor returns used are daily-basis, the market return needs to be 1-day market return for the calculation. This number will be one of the inputs to calculate market timing effect. | 
**risk_free_rate** | **float** | User-defined risk-free rate of return whose horizon must match that of the factor returns. This number will be one of the inputs to calculate market timing effect. | 
**risk_premium** | **float** | Expected return of the market portfolio which is required to be an annualized return. This number will be one of the inputs to calculate market timing effect. | 
**risk_premium_periods_per_year** | **int** | Deannualization factor on the Market Risk Premium which can be any user-defined positive integer number. This number will be used to deannualize Market Risk Premium so that the expected market return horizon will match that of the factor returns. For example, if a risk model has daily factor returns, select desired integer such as 365 or 252. | 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


