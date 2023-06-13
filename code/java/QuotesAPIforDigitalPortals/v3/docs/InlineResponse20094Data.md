

# InlineResponse20094Data


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of a notation. |  [optional]
**valueUnit** | [**InlineResponse20094ValueUnit**](InlineResponse20094ValueUnit.md) |  |  [optional]
**market** | [**InlineResponse20068DataMarket**](InlineResponse20068DataMarket.md) |  |  [optional]
**symbol** | **String** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market. |  [optional]
**nsin** | [**InlineResponse20093Nsin**](InlineResponse20093Nsin.md) |  |  [optional]
**fsym** | [**InlineResponse20046NotationFsym**](InlineResponse20046NotationFsym.md) |  |  [optional]
**instrument** | [**InlineResponse20094Instrument**](InlineResponse20094Instrument.md) |  |  [optional]
**tradingValue** | [**InlineResponse20094TradingValue**](InlineResponse20094TradingValue.md) |  |  [optional]


## Implemented Interfaces

* Serializable


