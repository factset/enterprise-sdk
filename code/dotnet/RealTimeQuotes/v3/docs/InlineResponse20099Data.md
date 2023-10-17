# FactSet.SDK.RealTimeQuotes.Model.InlineResponse20099Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of a notation. | [optional] 
**ValueUnit** | [**InlineResponse20099ValueUnit**](InlineResponse20099ValueUnit.md) |  | [optional] 
**Market** | [**InlineResponse20071DataMarket**](InlineResponse20071DataMarket.md) |  | [optional] 
**Symbol** | **string** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market. | [optional] 
**Nsin** | [**InlineResponse20098Nsin**](InlineResponse20098Nsin.md) |  | [optional] 
**Fsym** | [**InlineResponse20046DataNotationFsym**](InlineResponse20046DataNotationFsym.md) |  | [optional] 
**Instrument** | [**InlineResponse20099Instrument**](InlineResponse20099Instrument.md) |  | [optional] 
**Match** | [**InlineResponse20099Match**](InlineResponse20099Match.md) |  | [optional] 
**AverageIndicativeTradingValue30TD** | **decimal?** | Indicative daily average trading value in US dollars for the past 30 trading days. The average cash flow is converted from the notation&#39;s trading currency to US dollars using a single exchange rate determined at the end of the period. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

