

# InlineResponse20079Data


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**referenceDate** | **LocalDate** | Reference date of the time range. |  [optional]
**performance** | [**InlineResponse20078DataPerformance**](InlineResponse20078DataPerformance.md) |  |  [optional]
**high** | [**InlineResponse20078DataHigh**](InlineResponse20078DataHigh.md) |  |  [optional]
**low** | [**InlineResponse20078DataLow**](InlineResponse20078DataLow.md) |  |  [optional]
**tradingVolume** | **BigDecimal** | Sum of the trading volume of a notation in number of shares for the time-range between the date of the most recent end-of-day (EOD) closing price (inclusive) and the reference date (exclusive). |  [optional]
**volatility** | **BigDecimal** | Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year. |  [optional]
**status** | [**InlineResponse20079Status**](InlineResponse20079Status.md) |  |  [optional]


## Implemented Interfaces

* Serializable


