# InlineResponse20088Data


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id_notation** | **str, none_type** | MDG identifier of the listing. | [optional] 
**source_identifier** | **str, none_type** | Identifier used in the request. | [optional] 
**suspended** | **bool, none_type** | Indicates whether the notation is currently suspended from trading. The notation is tradable if it is not suspended and the market is open, see attribute &#x60;market.isOpen&#x60;. | [optional] 
**trading_status** | **str, none_type** | Market-specific code of the trading status and/or the suspension of the notation. | [optional] 
**price_delay** | **float, none_type** | Exchange-imposed delay in seconds for delayed-quality tick data. | [optional] 
**tick_size** | **float, none_type** | The minimum price movement of the notation. Prices can only be integral multiples of this minimum value. See endpoint &#x60;/notation/get&#x60; for the value unit of the &#x60;tickSize&#x60; for this notation. | [optional] 
**lot_size** | **float, none_type** | The minimum tradable volume of the notation. The number of units traded can only be integral multiples of this minimum value. | [optional] 
**trade_imbalance** | **float, none_type** | Trade imbalance after the previous closed auction. A positive value indicates that more buy orders have been placed for the security; a negative value indicates more sell orders. | [optional] 
**market** | [**InlineResponse20088DataMarket**](InlineResponse20088DataMarket.md) |  | [optional] 
**regional** | [**InlineResponse20088DataRegional**](InlineResponse20088DataRegional.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


