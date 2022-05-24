

# StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50

Number of trading days since the crossover and direction thereof of the SMA 20 (see parameter `simpleMovingAverage.days20`) and the SMA 50 (see parameter `simpleMovingAverage.days50`). Only crossovers which occurred in the most recent 100 trading days are considered.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numberDays** | [**StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays**](StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays.md) |  | 
**direction** | [**DirectionEnum**](#DirectionEnum) | Direction of the crossing. |  [optional]



## Enum: DirectionEnum

Name | Value
---- | -----
UP | &quot;up&quot;
DOWN | &quot;down&quot;


## Implemented Interfaces

* Serializable


