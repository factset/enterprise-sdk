# timeseriesapifordigitalportals.VendorChartIQTimeSeriesEodSubsampleListData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the notation. | 
**type** | **String** | Type of the price as configured for the customer. | [optional] [default to &#39;trade&#39;]
**quality** | **String** | Quality of the price. | [optional] [default to &#39;DLY&#39;]
**intervals** | **[Date]** | Non-empty intervals of days to consider for the request. The array contains a list of at least two days in increasing order. Each pair of adjacent entries day_n and day_(n+1) specifies a half-open interval, that is a range of days d where day_n &lt;&#x3D; d &lt; day_(n+1). A subsample is computed for each interval. The valid range of intervals is between 1900-01-01 and the day after the current day. | 
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




