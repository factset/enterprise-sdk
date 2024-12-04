# realtimetimeseries.PostPricesTimeSeriesIntradaySubsampleGetRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | [**PostVendorChartIQTimeSeriesEodListRequestDataIdentifier**](PostVendorChartIQTimeSeriesEodListRequestDataIdentifier.md) |  | 
**type** | **String** | Type of the price as configured for the customer. | Value | Description | | --- | --- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. |   | [optional] [default to &#39;trade&#39;]
**quality** | **String** | Quality of the price. | Value | Description | | --- | --- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |   | [optional] [default to &#39;DLY&#39;]
**from** | **Date** | Date and time of the start point of the subsample (inclusive). &#x60;from&#x60; must be aligned to &#x60;granularity&#x60;. That is, the numerical value is an integral multiple of the time span value represented by &#x60;granularity&#x60;. The data accessible in the past is limited to a few weeks at most. Values in the future are not allowed. | 
**granularity** | **String** | Subsample granularities suitable for intraday data. | Value | Description | | --- | --- | | 1s | Each subsample interval encompasses 1 second. | | 5s | Each subsample interval encompasses 5 seconds. | | 10s | Each subsample interval encompasses 10 seconds. | | 30s | Each subsample interval encompasses 30 seconds. | | 1m | Each subsample interval encompasses 1 minute. | | 5m | Each subsample interval encompasses 5 minutes. | | 10m | Each subsample interval encompasses 10 minutes. | | 15m | Each subsample interval encompasses 15 minutes. | | 30m | Each subsample interval encompasses 30 minutes. | | 1h | Each subsample interval encompasses 1 hour. |   | [optional] [default to &#39;1h&#39;]
**adjustments** | [**PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments**](PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments.md) |  | [optional] 



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




