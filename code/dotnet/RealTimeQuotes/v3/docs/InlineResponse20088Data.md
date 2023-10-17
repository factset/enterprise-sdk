# FactSet.SDK.RealTimeQuotes.Model.InlineResponse20088Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdNotation** | **string** | MDG identifier of the listing. | [optional] 
**SourceIdentifier** | **string** | Identifier used in the request. | [optional] 
**Suspended** | **bool?** | Indicates whether the notation is currently suspended from trading. The notation is tradable if it is not suspended and the market is open, see attribute &#x60;market.isOpen&#x60;. | [optional] 
**TradingStatus** | **string** | Market-specific code of the trading status and/or the suspension of the notation. | [optional] 
**PriceDelay** | **decimal?** | Exchange-imposed delay in seconds for delayed-quality tick data. | [optional] 
**TickSize** | **decimal?** | The minimum price movement of the notation. Prices can only be integral multiples of this minimum value. See endpoint &#x60;/notation/get&#x60; for the value unit of the &#x60;tickSize&#x60; for this notation. | [optional] 
**LotSize** | **decimal?** | The minimum tradable volume of the notation. The number of units traded can only be integral multiples of this minimum value. | [optional] 
**TradeImbalance** | **decimal?** | Trade imbalance after the previous closed auction. A positive value indicates that more buy orders have been placed for the security; a negative value indicates more sell orders. | [optional] 
**Market** | [**InlineResponse20088DataMarket**](InlineResponse20088DataMarket.md) |  | [optional] 
**Regional** | [**InlineResponse20088DataRegional**](InlineResponse20088DataRegional.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

