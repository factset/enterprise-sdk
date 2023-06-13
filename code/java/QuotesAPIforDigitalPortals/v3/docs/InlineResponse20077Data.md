

# InlineResponse20077Data

EOD key figures.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**referenceDate** | **LocalDate** | Reference date of the time range. |  [optional]
**performance** | [**InlineResponse20075DataPerformance**](InlineResponse20075DataPerformance.md) |  |  [optional]
**high** | [**InlineResponse20075DataHigh**](InlineResponse20075DataHigh.md) |  |  [optional]
**low** | [**InlineResponse20075DataLow**](InlineResponse20075DataLow.md) |  |  [optional]
**averagePrice** | **BigDecimal** | Arithmetic mean of the notation&#39;s EOD closing prices for the given time range. |  [optional]
**tradingVolume** | [**InlineResponse20077DataTradingVolume**](InlineResponse20077DataTradingVolume.md) |  |  [optional]
**tradingValue** | **BigDecimal** | Sum of the cash flow for all transactions of one notation over a certain time range. The cash flow of a transaction is its volume multiplied by its trade price. |  [optional]
**volatility** | **BigDecimal** | Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year. |  [optional]


## Implemented Interfaces

* Serializable


