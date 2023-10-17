

# InlineResponse20069Data


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**symbol** | **String** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify notations, no symbol will be set for the notations of that market. |  [optional]
**factSetMarketSymbol** | **String** | The FactSet market symbol of the notation (i.e. TICKER_EXCHANGE). |  [optional]
**valueUnit** | [**InlineResponse20068DataValueUnit**](InlineResponse20068DataValueUnit.md) |  |  [optional]
**market** | [**InlineResponse20068DataMarket**](InlineResponse20068DataMarket.md) |  |  [optional]
**instrument** | [**InlineResponse20068DataInstrument**](InlineResponse20068DataInstrument.md) |  |  [optional]
**status** | [**InlineResponse20069Status**](InlineResponse20069Status.md) |  |  [optional]


## Implemented Interfaces

* Serializable


