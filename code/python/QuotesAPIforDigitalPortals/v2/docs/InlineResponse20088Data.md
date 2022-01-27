# InlineResponse20088Data

The data member contains a list of the matching notations.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Identifier of the notation. | [optional] 
**symbol** | **str** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market. | [optional] 
**nsin** | [**InlineResponse20088Nsin**](InlineResponse20088Nsin.md) |  | [optional] 
**price** | [**InlineResponse20088Price**](InlineResponse20088Price.md) |  | [optional] 
**instrument** | [**InlineResponse20088Instrument**](InlineResponse20088Instrument.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


