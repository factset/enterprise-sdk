# FactSet.SDK.StocksAPIforDigitalPortals.Model.InlineResponse20013Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of a notation. | [optional] 
**Symbol** | **string** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market. | [optional] 
**Market** | [**InlineResponse20013Market**](InlineResponse20013Market.md) |  | [optional] 
**Currency** | [**InlineResponse20013Currency**](InlineResponse20013Currency.md) |  | [optional] 
**IsAlternative** | **bool?** | Indicates whether the notation is an alternative one, i.e. not the original notation of the index constituent. | [optional] 
**Trade** | [**InlineResponse20013Trade**](InlineResponse20013Trade.md) |  | [optional] 
**Quality** | **string** | Quality of the trade-related attributes, see attributes &#x60;trade&#x60; and &#x60;accumulated&#x60;. | [optional] 
**Accumulated** | [**InlineResponse20013Accumulated**](InlineResponse20013Accumulated.md) |  | [optional] 
**Fsym** | [**InlineResponse20013Fsym**](InlineResponse20013Fsym.md) |  | [optional] 
**Instrument** | [**InlineResponse20013Instrument**](InlineResponse20013Instrument.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

