# FactSet.SDK.RealTimeTimeSeries.Model.PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData
The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Identifier** | [**PostVendorChartIQTimeSeriesEodListRequestDataIdentifier**](PostVendorChartIQTimeSeriesEodListRequestDataIdentifier.md) |  | 
**Type** | **string** | Type of the price as configured for the customer. | Value | Description | | - -- | - -- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. |   | [optional] [default to TypeEnum.Trade]
**Quality** | **string** | Quality of the price. | Value | Description | | - -- | - -- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |   | [optional] [default to QualityEnum.DLY]
**From** | **DateTime** | Date and time of the start point of the subsample (inclusive). &#x60;from&#x60; must be aligned to &#x60;granularity&#x60;. That is, the numerical value is an integral multiple of the time span value represented by &#x60;granularity&#x60;. The data accessible in the past is limited to a few weeks at most. Values in the future are not allowed. | 
**Granularity** | **string** | Subsample granularities suitable for intraday data. | Value | Description | | - -- | - -- | | 1s | Each subsample interval encompasses 1 second. | | 5s | Each subsample interval encompasses 5 seconds. | | 10s | Each subsample interval encompasses 10 seconds. | | 30s | Each subsample interval encompasses 30 seconds. | | 1m | Each subsample interval encompasses 1 minute. | | 5m | Each subsample interval encompasses 5 minutes. | | 10m | Each subsample interval encompasses 10 minutes. | | 15m | Each subsample interval encompasses 15 minutes. | | 30m | Each subsample interval encompasses 30 minutes. | | 1h | Each subsample interval encompasses 1 hour. |   | [optional] [default to GranularityEnum._1h]
**Adjustments** | [**PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments**](PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

