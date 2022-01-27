# StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50

Number of trading days since the crossover and direction thereof of the SMA 20 (see parameter `simpleMovingAverage.days20`) and the SMA 50 (see parameter `simpleMovingAverage.days50`). Only crossovers which occurred in the most recent 100 trading days are considered.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number_days** | [**StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays**](StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays.md) |  | 
**direction** | **str** | Direction of the crossing. | [optional]  if omitted the server will use the default value of "up"
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


