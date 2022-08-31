

# InlineResponse20010DataTransactionBuy

Opening transaction of the closed position.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the opening transaction. |  [optional]
**time** | **String** | Date and time of the opening transaction. |  [optional]
**notation** | [**InlineResponse20010DataTransactionBuyNotation**](InlineResponse20010DataTransactionBuyNotation.md) |  |  [optional]
**currency** | [**InlineResponse20010DataTransactionBuyCurrency**](InlineResponse20010DataTransactionBuyCurrency.md) |  |  [optional]
**price** | **BigDecimal** | Purchase price of the position in the portfolio&#39;s base currency. |  [optional]
**charges** | **BigDecimal** | Charges accrued in the portfolio&#39;s base currency. |  [optional]
**value** | **BigDecimal** | Purchase value of the position in the portfolio&#39;s base currency. |  [optional]
**exchangeRate** | **BigDecimal** | The exchange rate between the notation&#39;s currency and the portfolio currency at the time of the opening trade. |  [optional]


## Implemented Interfaces

* Serializable


