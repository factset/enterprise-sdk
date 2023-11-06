

# PostVendorChartIQTimeSeriesIntradaySubsampleListRequestData

The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | [**PostVendorChartIQTimeSeriesEodListRequestDataIdentifier**](PostVendorChartIQTimeSeriesEodListRequestDataIdentifier.md) |  | 
**type** | [**TypeEnum**](#TypeEnum) | Type of the price as configured for the customer. |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. |  [optional]
**range** | [**PostVendorChartIQTimeSeriesIntradaySubsampleListRequestDataRange**](PostVendorChartIQTimeSeriesIntradaySubsampleListRequestDataRange.md) |  | 
**granularity** | [**GranularityEnum**](#GranularityEnum) | Subsample granularities suitable for intraday data. |  [optional]
**newestFirst** | **Boolean** | Deliver the chronological last part of the requested data first. |  [optional]
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


