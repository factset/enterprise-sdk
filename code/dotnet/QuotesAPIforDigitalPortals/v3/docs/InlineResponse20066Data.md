# FactSet.SDK.QuotesAPIforDigitalPortals.Model.InlineResponse20066Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdNotation** | **string** | MDG identifier of the listing. | [optional] 
**SourceIdentifier** | **string** | Identifier used in the request. | [optional] 
**Symbol** | **string** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify notations, no symbol will be set for the notations of that market. | [optional] 
**FactSetMarketSymbol** | **string** | The FactSet market symbol of the notation (i.e. TICKER_EXCHANGE). | [optional] 
**ValueUnit** | [**InlineResponse20065DataValueUnit**](InlineResponse20065DataValueUnit.md) |  | [optional] 
**Market** | [**InlineResponse20065DataMarket**](InlineResponse20065DataMarket.md) |  | [optional] 
**Instrument** | [**InlineResponse20065DataInstrument**](InlineResponse20065DataInstrument.md) |  | [optional] 
**Status** | [**InlineResponse20066Status**](InlineResponse20066Status.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

