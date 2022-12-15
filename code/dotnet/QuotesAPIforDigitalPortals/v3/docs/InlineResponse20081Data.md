# FactSet.SDK.QuotesAPIforDigitalPortals.Model.InlineResponse20081Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdNotation** | **string** | MDG identifier of the listing. | [optional] 
**SourceIdentifier** | **string** | Identifier used in the request. | [optional] 
**Suspended** | **bool?** | Indicates whether the notation is currently suspended from trading. The notation is tradable if it is not suspended and the market is open, see attribute &#x60;market.isOpen&#x60;. | [optional] 
**TradingStatus** | **string** | Market-specific code of the trading status and/or the suspension of the notation. | [optional] 
**PriceDelay** | **decimal?** | Exchange-imposed delay in seconds for delayed-quality tick data. | [optional] 
**TickSize** | **decimal?** | The minimum price movement of the notation. Prices can only be integral multiples of this minimum value. See endpoint &#x60;/notation/get&#x60; for the value unit of the &#x60;tickSize&#x60; for this notation. | [optional] 
**LotSize** | **decimal?** | he minimum tradable volume of the notation. The number of units traded can only be integral multiples of this minimum value. | [optional] 
**Market** | [**InlineResponse20081DataMarket**](InlineResponse20081DataMarket.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

