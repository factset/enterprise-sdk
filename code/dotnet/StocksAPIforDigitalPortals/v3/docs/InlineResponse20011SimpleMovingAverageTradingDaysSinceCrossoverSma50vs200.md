# FactSet.SDK.StocksAPIforDigitalPortals.Model.InlineResponse20011SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200
Number of trading days since the crossover and direction thereof of the SMA 50 (see parameter `simpleMovingAverage.days50`) and the SMA 200 (see parameter `simpleMovingAverage.days200`). Only crossovers which occurred in the most recent 300 trading days are considered, hence the attribute `sma50vs200.numberDays` cannot exceed the value 300.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NumberDays** | **decimal** | Number of trading days. | [optional] 
**Direction** | **string** | Direction of the crossing. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

