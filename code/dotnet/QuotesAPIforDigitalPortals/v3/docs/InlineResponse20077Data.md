# FactSet.SDK.QuotesAPIforDigitalPortals.Model.InlineResponse20077Data
EOD key figures.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdNotation** | **string** | MDG identifier of the listing. | [optional] 
**SourceIdentifier** | **string** | Identifier used in the request. | [optional] 
**ReferenceDate** | **DateTime?** | Reference date of the time range. | [optional] 
**Performance** | [**InlineResponse20075DataPerformance**](InlineResponse20075DataPerformance.md) |  | [optional] 
**High** | [**InlineResponse20075DataHigh**](InlineResponse20075DataHigh.md) |  | [optional] 
**Low** | [**InlineResponse20075DataLow**](InlineResponse20075DataLow.md) |  | [optional] 
**AveragePrice** | **decimal?** | Arithmetic mean of the notation&#39;s EOD closing prices for the given time range. | [optional] 
**TradingVolume** | [**InlineResponse20077DataTradingVolume**](InlineResponse20077DataTradingVolume.md) |  | [optional] 
**TradingValue** | **decimal?** | Sum of the cash flow for all transactions of one notation over a certain time range. The cash flow of a transaction is its volume multiplied by its trade price. | [optional] 
**Volatility** | **decimal?** | Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

