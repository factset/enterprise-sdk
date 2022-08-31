

# InlineResponse2001DataSummary

Summary of portfolio values in the portfolio's currency (see attribute `currency`).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalValue** | **BigDecimal** | The total portfolio value, i.e. the current market value of the portfolio plus cash. |  [optional]
**marketValue** | **BigDecimal** | The current market value of the securities in the portfolio. |  [optional]
**purchaseValue** | **BigDecimal** | The total purchase value of all securities. |  [optional]
**numberPositions** | **BigDecimal** | Number of positions in the portfolio. |  [optional]
**transactions** | [**InlineResponse2001DataSummaryTransactions**](InlineResponse2001DataSummaryTransactions.md) |  |  [optional]
**cash** | [**InlineResponse2001DataSummaryCash**](InlineResponse2001DataSummaryCash.md) |  |  [optional]


## Implemented Interfaces

* Serializable


