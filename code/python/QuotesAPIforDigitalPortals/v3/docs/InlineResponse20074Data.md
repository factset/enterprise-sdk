# InlineResponse20074Data

EOD key figures.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id_notation** | **str, none_type** | MDG identifier of the listing. | [optional] 
**source_identifier** | **str, none_type** | Identifier used in the request. | [optional] 
**reference_date** | **date, none_type** | Reference date of the time range. | [optional] 
**performance** | [**InlineResponse20074DataPerformance**](InlineResponse20074DataPerformance.md) |  | [optional] 
**high** | [**InlineResponse20074DataHigh**](InlineResponse20074DataHigh.md) |  | [optional] 
**low** | [**InlineResponse20074DataLow**](InlineResponse20074DataLow.md) |  | [optional] 
**trading_volume** | **float, none_type** | Sum of the trading volume of a notation in number of shares for the time-range between the date of the most recent end-of-day (EOD) closing price (inclusive) and the reference date (exclusive). | [optional] 
**volatility** | **float, none_type** | Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


