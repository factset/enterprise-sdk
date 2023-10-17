# FactSet.SDK.RealTimeQuotes.Model.InlineResponse20072DataNotations

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of the notation. | [optional] 
**Symbol** | **string** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify notations, no symbol will be set for the notations of that market. | [optional] 
**Active** | **bool?** | Indicates whether the notation is active. | [optional] 
**Market** | [**InlineResponse20071DataMarket**](InlineResponse20071DataMarket.md) |  | [optional] 
**ValueUnit** | [**InlineResponse20071DataValueUnit**](InlineResponse20071DataValueUnit.md) |  | [optional] 
**Fsym** | [**InlineResponse20046DataNotationFsym**](InlineResponse20046DataNotationFsym.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

