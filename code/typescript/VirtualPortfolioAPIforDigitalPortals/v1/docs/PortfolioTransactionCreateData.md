# virtualportfolioapifordigitalportals.PortfolioTransactionCreateData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the portfolio. | 
**type** | **String** | Transaction Type.  | 
**notation** | [**PortfolioTransactionCreateDataNotation**](PortfolioTransactionCreateDataNotation.md) |  | 
**time** | **String** | Date and time of the trade. | 
**numberShares** | **Number** | Number of shares bought or sold. | 
**price** | **Number** | Purchase price. | 
**charges** | **Number** | Charges accrued in portfolio‘s base currency. | [optional] 
**exchangeRate** | **Number** | The exchange rate between the notation&#39;s currency and the portfolio currency. | [optional] 
**parentTransaction** | [**PortfolioTransactionCreateDataParentTransaction**](PortfolioTransactionCreateDataParentTransaction.md) |  | [optional] 



## Enum: TypeEnum


* `buy` (value: `"buy"`)

* `sell` (value: `"sell"`)

* `short` (value: `"short"`)

* `cover` (value: `"cover"`)




