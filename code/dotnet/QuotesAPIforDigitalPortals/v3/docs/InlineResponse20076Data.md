# FactSet.SDK.QuotesAPIforDigitalPortals.Model.InlineResponse20076Data
EOD key figures.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdNotation** | **string** | MDG identifier of the listing. | [optional] 
**SourceIdentifier** | **string** | Identifier used in the request. | [optional] 
**ReferenceDate** | **DateTime?** | Reference date of the time range. | [optional] 
**Performance** | [**InlineResponse20074DataPerformance**](InlineResponse20074DataPerformance.md) |  | [optional] 
**High** | [**InlineResponse20074DataHigh**](InlineResponse20074DataHigh.md) |  | [optional] 
**Low** | [**InlineResponse20074DataLow**](InlineResponse20074DataLow.md) |  | [optional] 
**AveragePrice** | **decimal?** | Arithmetic mean of the notation&#39;s EOD closing prices for the given time range. | [optional] 
**TradingVolume** | [**InlineResponse20076DataTradingVolume**](InlineResponse20076DataTradingVolume.md) |  | [optional] 
**TradingValue** | **decimal?** | Sum of the cash flow for all transactions of one notation over a certain time range. The cash flow of a transaction is its volume multiplied by its trade price. | [optional] 
**Volatility** | **decimal?** | Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

