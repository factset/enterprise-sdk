# FactSet.SDK.FactSetOptions.Model.AtmImpliedVolatilityRequest
At-the-Money Implied Volatility Request Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Underlying Security Identifier of which can be used to return respective options chain. Only **one** security id is permitted per request.   | 
**StartDate** | **string** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. | [optional] 
**EndDate** | **string** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. | [optional] 
**Frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**Exchange** | [**Exchange**](Exchange.md) |  | [optional] 
**Period** | **int** | The period for the options to calculate at the money volatility. Below are the available periods -  * No Limit - (0) * One Month - (1) * Two Months - (2) * Three Months - (3) * Four Months - (4) * Five Months - (5) * Six Months - (6) | [optional] [default to 0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

