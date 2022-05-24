

# InlineResponse20011SimpleMovingAverageTradingDaysSinceCrossoverSma20vs50

Number of trading days since the crossover and direction thereof of the SMA 20 (see parameter `simpleMovingAverage.days20`) and the SMA 50 (see parameter `simpleMovingAverage.days50`). Only crossovers which occurred in the most recent 100 trading days are considered, hence the attribute `sma20vs50.numberDays` cannot exceed the value 100.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numberDays** | **BigDecimal** | Number of trading days. |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | Direction of the crossing. |  [optional]



## Enum: DirectionEnum

Name | Value
---- | -----
UP | &quot;up&quot;
DOWN | &quot;down&quot;


## Implemented Interfaces

* Serializable


