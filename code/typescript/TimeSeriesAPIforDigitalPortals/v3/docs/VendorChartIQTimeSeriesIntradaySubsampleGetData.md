# timeseriesapifordigitalportals.VendorChartIQTimeSeriesIntradaySubsampleGetData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the notation. | 
**type** | **String** | Type of the price as configured for the customer. | [optional] [default to &#39;trade&#39;]
**quality** | **String** | Quality of the price. | [optional] [default to &#39;DLY&#39;]
**from** | **String** | Date and time of the start point of the subsample (inclusive). &#x60;from&#x60; must be aligned to &#x60;granularity&#x60;. That is, the numerical value is an integral multiple of the time span value represented by &#x60;granularity&#x60;. The data accessible in the past is limited to a few weeks at most. Values in the future are not allowed. | 
**granularity** | **String** | Subsample granularities suitable for intraday data. | [optional] [default to &#39;1h&#39;]
**adjustments** | [**VendorChartIQTimeSeriesIntradaySubsampleGetDataAdjustments**](VendorChartIQTimeSeriesIntradaySubsampleGetDataAdjustments.md) |  | [optional] 



## Enum: TypeEnum


* `trade` (value: `"trade"`)

* `bid` (value: `"bid"`)

* `ask` (value: `"ask"`)

* `yield` (value: `"yield"`)





## Enum: QualityEnum


* `RLT` (value: `"RLT"`)

* `DLY` (value: `"DLY"`)

* `BST` (value: `"BST"`)





## Enum: GranularityEnum


* `1s` (value: `"1s"`)

* `5s` (value: `"5s"`)

* `10s` (value: `"10s"`)

* `30s` (value: `"30s"`)

* `1m` (value: `"1m"`)

* `5m` (value: `"5m"`)

* `10m` (value: `"10m"`)

* `15m` (value: `"15m"`)

* `30m` (value: `"30m"`)

* `1h` (value: `"1h"`)




