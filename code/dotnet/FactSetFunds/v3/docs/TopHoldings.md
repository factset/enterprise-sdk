# FactSet.SDK.FactSetFunds.Model.TopHoldings
Fund top holdings including names, tickers, weights, and total number of holdings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Date** | **DateTime?** | The date in YYYY-MM-DD format. | [optional] 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**NumberOfHoldings** | **int** | Total number of holdings considered. | [optional] 
**HoldingsPercentWeight** | **double** | Combined weight of top holdings. | [optional] 
**Holdings** | [**List&lt;Holdings&gt;**](Holdings.md) | List of top holdings with name, ticker, and weight. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

