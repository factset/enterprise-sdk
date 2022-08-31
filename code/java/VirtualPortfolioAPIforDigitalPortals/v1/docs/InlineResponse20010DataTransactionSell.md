

# InlineResponse20010DataTransactionSell

Closing transaction of the position.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the closing transaction. |  [optional]
**time** | **String** | Date and time of the closing transaction. |  [optional]
**notation** | [**InlineResponse20010DataTransactionSellNotation**](InlineResponse20010DataTransactionSellNotation.md) |  |  [optional]
**currency** | [**InlineResponse20010DataTransactionSellCurrency**](InlineResponse20010DataTransactionSellCurrency.md) |  |  [optional]
**price** | **BigDecimal** | Selling price of the position in the portfolio&#39;s base currency. |  [optional]
**charges** | **BigDecimal** | Charges accrued in the portfolio&#39;s base currency. |  [optional]
**value** | **BigDecimal** | Sales value of the position in the portfolio&#39;s base currency. |  [optional]
**exchangeRate** | **BigDecimal** | The exchange rate between the notation&#39;s currency and the portfolio currency at the time of the closing trade. |  [optional]


## Implemented Interfaces

* Serializable


