# timeseriesapifordigitalportals.VendorChartIQTimeSeriesEodListData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the notation. | 
**type** | **String** | Type of the price as configured for the customer. | [optional] [default to &#39;trade&#39;]
**quality** | **String** | Quality of the price. | [optional] [default to &#39;DLY&#39;]
**range** | [**VendorChartIQTimeSeriesEodListDataRange**](VendorChartIQTimeSeriesEodListDataRange.md) |  | 
**adjustments** | [**VendorChartIQTimeSeriesEodListDataAdjustments**](VendorChartIQTimeSeriesEodListDataAdjustments.md) |  | [optional] 



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




