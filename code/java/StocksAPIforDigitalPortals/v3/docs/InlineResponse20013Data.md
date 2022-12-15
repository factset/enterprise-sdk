

# InlineResponse20013Data


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of a notation. |  [optional]
**symbol** | **String** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market. |  [optional]
**market** | [**InlineResponse20013Market**](InlineResponse20013Market.md) |  |  [optional]
**currency** | [**InlineResponse20013Currency**](InlineResponse20013Currency.md) |  |  [optional]
**isAlternative** | **Boolean** | Indicates whether the notation is an alternative one, i.e. not the original notation of the index constituent. |  [optional]
**trade** | [**InlineResponse20013Trade**](InlineResponse20013Trade.md) |  |  [optional]
**quality** | **String** | Quality of the trade-related attributes, see attributes &#x60;trade&#x60; and &#x60;accumulated&#x60;. |  [optional]
**accumulated** | [**InlineResponse20013Accumulated**](InlineResponse20013Accumulated.md) |  |  [optional]
**fsym** | [**InlineResponse20013Fsym**](InlineResponse20013Fsym.md) |  |  [optional]
**instrument** | [**InlineResponse20013Instrument**](InlineResponse20013Instrument.md) |  |  [optional]


## Implemented Interfaces

* Serializable


