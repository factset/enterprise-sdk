

# InlineResponse20011SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200

Number of trading days since the crossover and direction thereof of the SMA 50 (see parameter `simpleMovingAverage.days50`) and the SMA 200 (see parameter `simpleMovingAverage.days200`). Only crossovers which occurred in the most recent 300 trading days are considered, hence the attribute `sma50vs200.numberDays` cannot exceed the value 300.

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


