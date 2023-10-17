# InlineResponse20099Data


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str, none_type** | Identifier of a notation. | [optional] 
**value_unit** | [**InlineResponse20099ValueUnit**](InlineResponse20099ValueUnit.md) |  | [optional] 
**market** | [**InlineResponse20071DataMarket**](InlineResponse20071DataMarket.md) |  | [optional] 
**symbol** | **str, none_type** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market. | [optional] 
**nsin** | [**InlineResponse20098Nsin**](InlineResponse20098Nsin.md) |  | [optional] 
**fsym** | [**InlineResponse20046DataNotationFsym**](InlineResponse20046DataNotationFsym.md) |  | [optional] 
**instrument** | [**InlineResponse20099Instrument**](InlineResponse20099Instrument.md) |  | [optional] 
**match** | [**InlineResponse20099Match**](InlineResponse20099Match.md) |  | [optional] 
**average_indicative_trading_value30_td** | **float, none_type** | Indicative daily average trading value in US dollars for the past 30 trading days. The average cash flow is converted from the notation&#39;s trading currency to US dollars using a single exchange rate determined at the end of the period. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


