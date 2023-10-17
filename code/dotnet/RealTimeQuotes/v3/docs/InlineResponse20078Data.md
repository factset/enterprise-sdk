# FactSet.SDK.RealTimeQuotes.Model.InlineResponse20078Data
EOD key figures.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdNotation** | **string** | MDG identifier of the listing. | [optional] 
**SourceIdentifier** | **string** | Identifier used in the request. | [optional] 
**ReferenceDate** | **DateTime?** | Reference date of the time range. | [optional] 
**Performance** | [**InlineResponse20078DataPerformance**](InlineResponse20078DataPerformance.md) |  | [optional] 
**High** | [**InlineResponse20078DataHigh**](InlineResponse20078DataHigh.md) |  | [optional] 
**Low** | [**InlineResponse20078DataLow**](InlineResponse20078DataLow.md) |  | [optional] 
**TradingVolume** | **decimal?** | Sum of the trading volume of a notation in number of shares for the time-range between the date of the most recent end-of-day (EOD) closing price (inclusive) and the reference date (exclusive). | [optional] 
**Volatility** | **decimal?** | Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

