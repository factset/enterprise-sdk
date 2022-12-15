# InlineResponse20093Data


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str, none_type** | Identifier of a notation. | [optional] 
**market** | [**InlineResponse20067DataMarket**](InlineResponse20067DataMarket.md) |  | [optional] 
**symbol** | **str, none_type** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market. | [optional] 
**nsin** | [**InlineResponse20091Nsin**](InlineResponse20091Nsin.md) |  | [optional] 
**instrument** | [**InlineResponse20093Instrument**](InlineResponse20093Instrument.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


