# realtimetimeseries.PostVendorChartIQTimeSeriesEodSubsampleListRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | [**PostVendorChartIQTimeSeriesEodListRequestDataIdentifier**](PostVendorChartIQTimeSeriesEodListRequestDataIdentifier.md) |  | 
**type** | **String** | Type of the price as configured for the customer. | [optional] [default to &#39;trade&#39;]
**quality** | **String** | Quality of the price. | [optional] [default to &#39;DLY&#39;]
**intervalSelection** | [**PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection**](PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection.md) |  | 
**newestFirst** | **Boolean** | Deliver the chronological last part of the requested data first. | [optional] [default to false]
**adjustments** | [**PostVendorChartIQTimeSeriesEodListRequestDataAdjustments**](PostVendorChartIQTimeSeriesEodListRequestDataAdjustments.md) |  | [optional] 



## Enum: TypeEnum


* `trade` (value: `"trade"`)

* `bid` (value: `"bid"`)

* `ask` (value: `"ask"`)

* `yield` (value: `"yield"`)

* `estimate` (value: `"estimate"`)





## Enum: QualityEnum


* `DLY` (value: `"DLY"`)

* `EOD` (value: `"EOD"`)

* `BST` (value: `"BST"`)




