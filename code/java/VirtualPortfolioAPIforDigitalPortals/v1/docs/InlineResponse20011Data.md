

# InlineResponse20011Data


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of transaction. |  [optional]
**instrument** | [**InlineResponse2009DataInstrument**](InlineResponse2009DataInstrument.md) |  |  [optional]
**notation** | [**InlineResponse20011Notation**](InlineResponse20011Notation.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of transaction |  [optional]
**time** | **String** | Date and time of the trade. |  [optional]
**numberShares** | **BigDecimal** | Number of shares bought or sold. |  [optional]
**price** | **BigDecimal** | Price the securities were purchased / sold for. |  [optional]
**charges** | **BigDecimal** | Charges accrued in portfolio&#39;s base currency. |  [optional]
**exchangeRate** | **BigDecimal** | The exchange rate between the notation&#39;s currency and the portfolio currency. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
BUY | &quot;buy&quot;
SELL | &quot;sell&quot;
CASH | &quot;cash&quot;
PAYOUT | &quot;payout&quot;
SHORT | &quot;short&quot;
COVER | &quot;cover&quot;


## Implemented Interfaces

* Serializable


