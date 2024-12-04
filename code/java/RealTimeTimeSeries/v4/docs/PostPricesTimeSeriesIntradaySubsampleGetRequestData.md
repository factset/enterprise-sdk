

# PostPricesTimeSeriesIntradaySubsampleGetRequestData

The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | [**PostVendorChartIQTimeSeriesEodListRequestDataIdentifier**](PostVendorChartIQTimeSeriesEodListRequestDataIdentifier.md) |  | 
**type** | [**TypeEnum**](#TypeEnum) | Type of the price as configured for the customer. | Value | Description | | --- | --- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. |   |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. | Value | Description | | --- | --- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |   |  [optional]
**from** | **OffsetDateTime** | Date and time of the start point of the subsample (inclusive). &#x60;from&#x60; must be aligned to &#x60;granularity&#x60;. That is, the numerical value is an integral multiple of the time span value represented by &#x60;granularity&#x60;. The data accessible in the past is limited to a few weeks at most. Values in the future are not allowed. | 
**granularity** | [**GranularityEnum**](#GranularityEnum) | Subsample granularities suitable for intraday data. | Value | Description | | --- | --- | | 1s | Each subsample interval encompasses 1 second. | | 5s | Each subsample interval encompasses 5 seconds. | | 10s | Each subsample interval encompasses 10 seconds. | | 30s | Each subsample interval encompasses 30 seconds. | | 1m | Each subsample interval encompasses 1 minute. | | 5m | Each subsample interval encompasses 5 minutes. | | 10m | Each subsample interval encompasses 10 minutes. | | 15m | Each subsample interval encompasses 15 minutes. | | 30m | Each subsample interval encompasses 30 minutes. | | 1h | Each subsample interval encompasses 1 hour. |   |  [optional]
**adjustments** | [**PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments**](PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
TRADE | &quot;trade&quot;
BID | &quot;bid&quot;
ASK | &quot;ask&quot;
YIELD | &quot;yield&quot;



## Enum: QualityEnum

Name | Value
---- | -----
RLT | &quot;RLT&quot;
DLY | &quot;DLY&quot;
BST | &quot;BST&quot;



## Enum: GranularityEnum

Name | Value
---- | -----
_1S | &quot;1s&quot;
_5S | &quot;5s&quot;
_10S | &quot;10s&quot;
_30S | &quot;30s&quot;
_1M | &quot;1m&quot;
_5M | &quot;5m&quot;
_10M | &quot;10m&quot;
_15M | &quot;15m&quot;
_30M | &quot;30m&quot;
_1H | &quot;1h&quot;


## Implemented Interfaces

* Serializable


