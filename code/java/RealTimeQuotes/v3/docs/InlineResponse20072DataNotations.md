

# InlineResponse20072DataNotations


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the notation. |  [optional]
**symbol** | **String** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify notations, no symbol will be set for the notations of that market. |  [optional]
**active** | **Boolean** | Indicates whether the notation is active. |  [optional]
**market** | [**InlineResponse20071DataMarket**](InlineResponse20071DataMarket.md) |  |  [optional]
**valueUnit** | [**InlineResponse20071DataValueUnit**](InlineResponse20071DataValueUnit.md) |  |  [optional]
**fsym** | [**InlineResponse20046DataNotationFsym**](InlineResponse20046DataNotationFsym.md) |  |  [optional]


## Implemented Interfaces

* Serializable


