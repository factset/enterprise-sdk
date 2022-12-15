

# InlineResponse20074Data

EOD key figures.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**referenceDate** | **LocalDate** | Reference date of the time range. |  [optional]
**performance** | [**InlineResponse20074DataPerformance**](InlineResponse20074DataPerformance.md) |  |  [optional]
**high** | [**InlineResponse20074DataHigh**](InlineResponse20074DataHigh.md) |  |  [optional]
**low** | [**InlineResponse20074DataLow**](InlineResponse20074DataLow.md) |  |  [optional]
**tradingVolume** | **BigDecimal** | Sum of the trading volume of a notation in number of shares for the time-range between the date of the most recent end-of-day (EOD) closing price (inclusive) and the reference date (exclusive). |  [optional]
**volatility** | **BigDecimal** | Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year. |  [optional]


## Implemented Interfaces

* Serializable


