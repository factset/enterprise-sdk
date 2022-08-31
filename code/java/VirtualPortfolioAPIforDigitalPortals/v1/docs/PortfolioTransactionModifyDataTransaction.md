

# PortfolioTransactionModifyDataTransaction

Transaction of the portfolio.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the transaction. | 
**notation** | [**PortfolioPayoutModifyDataPayoutNotation**](PortfolioPayoutModifyDataPayoutNotation.md) |  |  [optional]
**time** | **String** | Date and time of the trade. |  [optional]
**numberShares** | **BigDecimal** | Number of shares bought or sold. |  [optional]
**price** | **BigDecimal** | Purchase price. |  [optional]
**charges** | **BigDecimal** | Charges accrued in portfolio&#39;s base currency. |  [optional]
**exchangeRate** | **BigDecimal** | The exchange rate between the notation&#39;s currency and the portfolio currency. |  [optional]


## Implemented Interfaces

* Serializable


