

# InlineResponse20074Data

EOD key figures.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceDate** | **LocalDate** | Reference date of the time range. |  [optional]
**performance** | [**InlineResponse20072DataPerformance**](InlineResponse20072DataPerformance.md) |  |  [optional]
**high** | [**InlineResponse20072DataHigh**](InlineResponse20072DataHigh.md) |  |  [optional]
**low** | [**InlineResponse20072DataLow**](InlineResponse20072DataLow.md) |  |  [optional]
**tradingVolume** | **BigDecimal** | Sum of the trading volume of a notation in number of shares for the time-range between the date of the most recent end-of-day (EOD) closing price (inclusive) and the reference date (exclusive). |  [optional]
**volatility** | **BigDecimal** | Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year. |  [optional]


## Implemented Interfaces

* Serializable


