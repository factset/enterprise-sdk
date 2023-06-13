

# InlineResponse20083Data


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**suspended** | **Boolean** | Indicates whether the notation is currently suspended from trading. The notation is tradable if it is not suspended and the market is open, see attribute &#x60;market.isOpen&#x60;. |  [optional]
**tradingStatus** | **String** | Market-specific code of the trading status and/or the suspension of the notation. |  [optional]
**priceDelay** | **BigDecimal** | Exchange-imposed delay in seconds for delayed-quality tick data. |  [optional]
**tickSize** | **BigDecimal** | The minimum price movement of the notation. Prices can only be integral multiples of this minimum value. See endpoint &#x60;/notation/get&#x60; for the value unit of the &#x60;tickSize&#x60; for this notation. |  [optional]
**lotSize** | **BigDecimal** | he minimum tradable volume of the notation. The number of units traded can only be integral multiples of this minimum value. |  [optional]
**market** | [**InlineResponse20083DataMarket**](InlineResponse20083DataMarket.md) |  |  [optional]
**regional** | [**InlineResponse20083DataRegional**](InlineResponse20083DataRegional.md) |  |  [optional]


## Implemented Interfaces

* Serializable


