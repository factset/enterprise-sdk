# InlineResponse2003Data


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Identifier of a notation. | [optional] 
**symbol** | **str** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market. | [optional] 
**market** | [**InlineResponse2003Market**](InlineResponse2003Market.md) |  | [optional] 
**currency** | [**InlineResponse2003Currency**](InlineResponse2003Currency.md) |  | [optional] 
**is_alternative** | **bool** | Indicates whether the notation is an alternative one, i.e. not the original notation of the index constituent. | [optional] 
**trade** | [**InlineResponse2003Trade**](InlineResponse2003Trade.md) |  | [optional] 
**quality** | **str** | Quality of the trade-related attributes, see attributes &#x60;trade&#x60; and &#x60;accumulated&#x60;. | [optional] 
**accumulated** | [**InlineResponse2003Accumulated**](InlineResponse2003Accumulated.md) |  | [optional] 
**fsym** | [**InlineResponse2003Fsym**](InlineResponse2003Fsym.md) |  | [optional] 
**instrument** | [**InlineResponse2003Instrument**](InlineResponse2003Instrument.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


