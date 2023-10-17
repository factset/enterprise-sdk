# FactSet.SDK.RealTimeQuotes.Model.InlineResponse20098Data
The data member contains a list of the matching notations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of the notation. | [optional] 
**Symbol** | **string** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market. | [optional] 
**Nsin** | [**InlineResponse20098Nsin**](InlineResponse20098Nsin.md) |  | [optional] 
**Price** | [**InlineResponse20098Price**](InlineResponse20098Price.md) |  | [optional] 
**Instrument** | [**InlineResponse20098Instrument**](InlineResponse20098Instrument.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

