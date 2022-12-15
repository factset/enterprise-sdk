

# InlineResponse20065Data

Set of basic data for the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**symbol** | **String** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify notations, no symbol will be set for the notations of that market. |  [optional]
**factSetMarketSymbol** | **String** | The FactSet market symbol of the notation (i.e. TICKER_EXCHANGE). |  [optional]
**valueUnit** | [**InlineResponse20065DataValueUnit**](InlineResponse20065DataValueUnit.md) |  |  [optional]
**market** | [**InlineResponse20065DataMarket**](InlineResponse20065DataMarket.md) |  |  [optional]
**instrument** | [**InlineResponse20065DataInstrument**](InlineResponse20065DataInstrument.md) |  |  [optional]


## Implemented Interfaces

* Serializable


