# realtimequotes.InlineResponse20081Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. | [optional] 
**sourceIdentifier** | **String** | Identifier used in the request. | [optional] 
**referenceDate** | **Date** | Reference date of the time range. | [optional] 
**performance** | [**InlineResponse20078DataPerformance**](InlineResponse20078DataPerformance.md) |  | [optional] 
**high** | [**InlineResponse20078DataHigh**](InlineResponse20078DataHigh.md) |  | [optional] 
**low** | [**InlineResponse20078DataLow**](InlineResponse20078DataLow.md) |  | [optional] 
**averagePrice** | **Number** | Arithmetic mean of the notation&#39;s EOD closing prices for the given time range. | [optional] 
**tradingVolume** | [**InlineResponse20080DataTradingVolume**](InlineResponse20080DataTradingVolume.md) |  | [optional] 
**tradingValue** | **Number** | Sum of the cash flow for all transactions of one notation over a certain time range. The cash flow of a transaction is its volume multiplied by its trade price. | [optional] 
**volatility** | **Number** | Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year. | [optional] 
**status** | [**InlineResponse20079Status**](InlineResponse20079Status.md) |  | [optional] 


