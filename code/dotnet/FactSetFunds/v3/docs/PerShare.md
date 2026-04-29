# FactSet.SDK.FactSetFunds.Model.PerShare
Per-share financial metrics including EPS, sales per share, dividends per share, and cash flow per share

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Date** | **DateTime?** | The date in YYYY-MM-DD format. | [optional] 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**KeyItemsType** | **PerShareType** |  | 
**EpsRecurrentEarnings** | **double?** | EPS Recurrent Earnings | [optional] 
**SalesPerShare** | **double?** | Sales Per Share | [optional] 
**DividendsPerShare** | **double?** | Dividends Per Share | [optional] 
**FreeCashFlowPerShare** | **double?** | Free CashFlow Per Share | [optional] 
**BookValuePerShare** | **double?** | Book Value Per Share | [optional] 
**CashFlowPerShare** | **double?** | Cash Flow Per Share | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

