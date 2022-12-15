# FactSet.SDK.QuotesAPIforDigitalPortals.Model.InlineResponse20074Data
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
**TradingVolume** | **decimal?** | Sum of the trading volume of a notation in number of shares for the time-range between the date of the most recent end-of-day (EOD) closing price (inclusive) and the reference date (exclusive). | [optional] 
**Volatility** | **decimal?** | Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

