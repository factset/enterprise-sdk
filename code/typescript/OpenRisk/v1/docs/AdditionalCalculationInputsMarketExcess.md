# openrisk.AdditionalCalculationInputsMarketExcess

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_return** | **Number** | User-defined arbitrary return value measured from the market portfolio. The value is expected to be a scalar and the return horizon must match that of the factor returns. For example, if the factor returns used are daily-basis, the market return needs to be 1-day market return for the calculation. This number will be one of the inputs to calculate market timing effect. | 
**riskFreeRate** | **Number** | User-defined risk-free rate of return whose horizon must match that of the factor returns. This number will be one of the inputs to calculate market timing effect. | 
**riskPremium** | **Number** | Expected return of the market portfolio which is required to be an annualized return. This number will be one of the inputs to calculate market timing effect. | 
**riskPremiumPeriodsPerYear** | **Number** | Deannualization factor on the Market Risk Premium which can be any user-defined positive integer number. This number will be used to deannualize Market Risk Premium so that the expected market return horizon will match that of the factor returns. For example, if a risk model has daily factor returns, select desired integer such as 365 or 252. | 


