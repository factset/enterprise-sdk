# FactSet.SDK.FactSetFundamentals.Model.FundamentalsRequest
Fundamentals request body elements

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input.  | 
**Periodicity** | [**Periodicity**](Periodicity.md) |  | [optional] 
**FiscalPeriodStart** | **string** | Fiscal period start expressed as YYYY-MM-DD.  Calendar date that will fall back to most recent completed period during resolution.  | [optional] 
**FiscalPeriodEnd** | **string** | Fiscal period end expressed YYYY-MM-DD.  Calendar date that will fall back to most recent completed period during resolution.  | [optional] 
**Metrics** | **List&lt;string&gt;** | Requested List of Financial Statement Items or Ratios. Use /metrics endpoint for a complete list of available FF_* metric items.  | 
**Currency** | **string** | Currency code for currency values. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).  | [optional] [default to "LOCAL"]
**Restated** | [**Restated**](Restated.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

