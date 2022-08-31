# virtualportfolioapifordigitalportals.InlineResponse20011Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of transaction. | [optional] 
**instrument** | [**InlineResponse2009DataInstrument**](InlineResponse2009DataInstrument.md) |  | [optional] 
**notation** | [**InlineResponse20011Notation**](InlineResponse20011Notation.md) |  | [optional] 
**type** | **String** | Type of transaction | [optional] 
**time** | **String** | Date and time of the trade. | [optional] 
**numberShares** | **Number** | Number of shares bought or sold. | [optional] 
**price** | **Number** | Price the securities were purchased / sold for. | [optional] 
**charges** | **Number** | Charges accrued in portfolio&#39;s base currency. | [optional] 
**exchangeRate** | **Number** | The exchange rate between the notation&#39;s currency and the portfolio currency. | [optional] 



## Enum: TypeEnum


* `buy` (value: `"buy"`)

* `sell` (value: `"sell"`)

* `cash` (value: `"cash"`)

* `payout` (value: `"payout"`)

* `short` (value: `"short"`)

* `cover` (value: `"cover"`)




