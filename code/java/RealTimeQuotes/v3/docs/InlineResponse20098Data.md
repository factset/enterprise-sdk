

# InlineResponse20098Data

The data member contains a list of the matching notations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the notation. |  [optional]
**symbol** | **String** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market. |  [optional]
**nsin** | [**InlineResponse20098Nsin**](InlineResponse20098Nsin.md) |  |  [optional]
**price** | [**InlineResponse20098Price**](InlineResponse20098Price.md) |  |  [optional]
**instrument** | [**InlineResponse20098Instrument**](InlineResponse20098Instrument.md) |  |  [optional]


## Implemented Interfaces

* Serializable


