# FactSet.SDK.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.Model.BondIssuerYieldCurveRequest
Bond Issuer Yield Curve request body elements

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, ISIN and SEDOL are accepted input.  | 
**StartDate** | **string** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**EndDate** | **string** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**Frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**Calendar** | [**Calendar**](Calendar.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

