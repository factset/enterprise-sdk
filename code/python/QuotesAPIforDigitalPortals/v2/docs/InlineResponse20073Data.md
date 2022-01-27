# InlineResponse20073Data


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Identifier of the notation. | [optional] 
**reference_date** | **date** | Reference date of the time range. | [optional] 
**performance** | [**InlineResponse20072DataPerformance**](InlineResponse20072DataPerformance.md) |  | [optional] 
**high** | [**InlineResponse20072DataHigh**](InlineResponse20072DataHigh.md) |  | [optional] 
**low** | [**InlineResponse20072DataLow**](InlineResponse20072DataLow.md) |  | [optional] 
**average_price** | **float** | Arithmetic mean of the notation&#39;s EOD closing prices for the given time range. | [optional] 
**trading_volume** | [**InlineResponse20072DataTradingVolume**](InlineResponse20072DataTradingVolume.md) |  | [optional] 
**trading_value** | **float** | Sum of the cash flow for all transactions of one notation over a certain time range. The cash flow of a transaction is its volume multiplied by its trade price. | [optional] 
**volatility** | **float** | Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year. | [optional] 
**status** | [**InlineResponse20073Status**](InlineResponse20073Status.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


