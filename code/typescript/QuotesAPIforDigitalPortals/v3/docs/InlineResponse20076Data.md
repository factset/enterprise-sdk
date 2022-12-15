# quotesapifordigitalportals.InlineResponse20076Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. | [optional] 
**sourceIdentifier** | **String** | Identifier used in the request. | [optional] 
**referenceDate** | **Date** | Reference date of the time range. | [optional] 
**performance** | [**InlineResponse20074DataPerformance**](InlineResponse20074DataPerformance.md) |  | [optional] 
**high** | [**InlineResponse20074DataHigh**](InlineResponse20074DataHigh.md) |  | [optional] 
**low** | [**InlineResponse20074DataLow**](InlineResponse20074DataLow.md) |  | [optional] 
**averagePrice** | **Number** | Arithmetic mean of the notation&#39;s EOD closing prices for the given time range. | [optional] 
**tradingVolume** | [**InlineResponse20076DataTradingVolume**](InlineResponse20076DataTradingVolume.md) |  | [optional] 
**tradingValue** | **Number** | Sum of the cash flow for all transactions of one notation over a certain time range. The cash flow of a transaction is its volume multiplied by its trade price. | [optional] 
**volatility** | **Number** | Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year. | [optional] 


