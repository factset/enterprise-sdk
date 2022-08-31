# stocksapifordigitalportals.InlineResponse2006Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of a notation. | [optional] 
**symbol** | **String** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market. | [optional] 
**market** | [**InlineResponse2006Market**](InlineResponse2006Market.md) |  | [optional] 
**currency** | [**InlineResponse2006Currency**](InlineResponse2006Currency.md) |  | [optional] 
**isAlternative** | **Boolean** | Indicates whether the notation is an alternative one, i.e. not the original notation of the index constituent. | [optional] 
**trade** | [**InlineResponse2006Trade**](InlineResponse2006Trade.md) |  | [optional] 
**quality** | **String** | Quality of the trade-related attributes, see attributes &#x60;trade&#x60; and &#x60;accumulated&#x60;. | [optional] 
**accumulated** | [**InlineResponse2006Accumulated**](InlineResponse2006Accumulated.md) |  | [optional] 
**fsym** | [**InlineResponse2006Fsym**](InlineResponse2006Fsym.md) |  | [optional] 
**instrument** | [**InlineResponse2006Instrument**](InlineResponse2006Instrument.md) |  | [optional] 


