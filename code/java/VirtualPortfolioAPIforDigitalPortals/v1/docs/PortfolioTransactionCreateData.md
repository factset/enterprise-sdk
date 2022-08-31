

# PortfolioTransactionCreateData

The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the portfolio. | 
**type** | [**TypeEnum**](#TypeEnum) | Transaction Type.  | 
**notation** | [**PortfolioPayoutCreateDataNotation**](PortfolioPayoutCreateDataNotation.md) |  | 
**time** | **String** | Date and time of the trade. | 
**numberShares** | **BigDecimal** | Number of shares bought or sold. | 
**price** | **BigDecimal** | Purchase price. | 
**charges** | **BigDecimal** | Charges accrued in portfolio‘s base currency. |  [optional]
**exchangeRate** | **BigDecimal** | The exchange rate between the notation&#39;s currency and the portfolio currency. |  [optional]
**parentTransaction** | [**PortfolioTransactionCreateDataParentTransaction**](PortfolioTransactionCreateDataParentTransaction.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
BUY | &quot;buy&quot;
SELL | &quot;sell&quot;
SHORT | &quot;short&quot;
COVER | &quot;cover&quot;


## Implemented Interfaces

* Serializable


