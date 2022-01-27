

# InlineResponse2005Notation

Notation data of the element.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the notation. |  [optional]
**symbol** | **String** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify notations, no symbol will be set for the notations of that market. |  [optional]
**market** | [**InlineResponse2005NotationMarket**](InlineResponse2005NotationMarket.md) |  |  [optional]
**instrument** | [**InlineResponse2005NotationInstrument**](InlineResponse2005NotationInstrument.md) |  |  [optional]


## Implemented Interfaces

* Serializable


