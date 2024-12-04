# FactSet.SDK.RealTimeTimeSeries.Model.InlineResponse2008Data
Time series data for the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdNotation** | **string** | MDG identifier of the listing. | [optional] 
**SourceIdentifier** | **string** | Identifier used in the request. | [optional] 
**Range** | [**InlineResponse2008DataRange**](InlineResponse2008DataRange.md) |  | [optional] 
**Quality** | **string** | Quality of the price. | Value | Description | | - -- | - -- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. |   | [optional] 
**Prices** | [**List&lt;PostPricesTimeSeriesIntradayListDataPricesItems&gt;**](PostPricesTimeSeriesIntradayListDataPricesItems.md) | Time series of prices. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

