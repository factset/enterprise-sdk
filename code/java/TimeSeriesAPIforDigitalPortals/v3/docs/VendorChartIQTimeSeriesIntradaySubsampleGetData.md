

# VendorChartIQTimeSeriesIntradaySubsampleGetData

The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the notation. | 
**type** | [**TypeEnum**](#TypeEnum) | Type of the price as configured for the customer. |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. |  [optional]
**from** | **String** | Date and time of the start point of the subsample (inclusive). &#x60;from&#x60; must be aligned to &#x60;granularity&#x60;. That is, the numerical value is an integral multiple of the time span value represented by &#x60;granularity&#x60;. The data accessible in the past is limited to a few weeks at most. Values in the future are not allowed. | 
**granularity** | [**GranularityEnum**](#GranularityEnum) | Subsample granularities suitable for intraday data. |  [optional]
**adjustments** | [**VendorChartIQTimeSeriesIntradaySubsampleGetDataAdjustments**](VendorChartIQTimeSeriesIntradaySubsampleGetDataAdjustments.md) |  |  [optional]



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


