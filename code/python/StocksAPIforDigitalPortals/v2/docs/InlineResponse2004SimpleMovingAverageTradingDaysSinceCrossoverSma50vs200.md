# InlineResponse2004SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200

Number of trading days since the crossover and direction thereof of the SMA 50 (see parameter `simpleMovingAverage.days50`) and the SMA 200 (see parameter `simpleMovingAverage.days200`). Only crossovers which occurred in the most recent 300 trading days are considered, hence the attribute `sma50vs200.numberDays` cannot exceed the value 300.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number_days** | **float** | Number of trading days. | [optional] 
**direction** | **str** | Direction of the crossing. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


