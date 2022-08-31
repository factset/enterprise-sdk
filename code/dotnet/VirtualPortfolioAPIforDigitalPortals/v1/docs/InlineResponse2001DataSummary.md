# FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model.InlineResponse2001DataSummary
Summary of portfolio values in the portfolio's currency (see attribute `currency`).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TotalValue** | **decimal** | The total portfolio value, i.e. the current market value of the portfolio plus cash. | [optional] 
**MarketValue** | **decimal** | The current market value of the securities in the portfolio. | [optional] 
**PurchaseValue** | **decimal** | The total purchase value of all securities. | [optional] 
**NumberPositions** | **decimal** | Number of positions in the portfolio. | [optional] 
**Transactions** | [**InlineResponse2001DataSummaryTransactions**](InlineResponse2001DataSummaryTransactions.md) |  | [optional] 
**Cash** | [**InlineResponse2001DataSummaryCash**](InlineResponse2001DataSummaryCash.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

