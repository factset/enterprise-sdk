

# InlineResponse20072Data

EOD key figures.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceDate** | **LocalDate** | Reference date of the time range. |  [optional]
**performance** | [**InlineResponse20072DataPerformance**](InlineResponse20072DataPerformance.md) |  |  [optional]
**high** | [**InlineResponse20072DataHigh**](InlineResponse20072DataHigh.md) |  |  [optional]
**low** | [**InlineResponse20072DataLow**](InlineResponse20072DataLow.md) |  |  [optional]
**averagePrice** | **BigDecimal** | Arithmetic mean of the notation&#39;s EOD closing prices for the given time range. |  [optional]
**tradingVolume** | [**InlineResponse20072DataTradingVolume**](InlineResponse20072DataTradingVolume.md) |  |  [optional]
**tradingValue** | **BigDecimal** | Sum of the cash flow for all transactions of one notation over a certain time range. The cash flow of a transaction is its volume multiplied by its trade price. |  [optional]
**volatility** | **BigDecimal** | Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year. |  [optional]


## Implemented Interfaces

* Serializable


