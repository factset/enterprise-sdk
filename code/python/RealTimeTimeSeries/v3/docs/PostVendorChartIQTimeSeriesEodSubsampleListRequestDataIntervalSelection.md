# PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection

Select the intervals from which the subsamples are to be created.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**intervals** | **[date]** | Non-empty intervals of days to consider for the request. The array contains a list of at least two days in increasing order. Each pair of adjacent entries day_n and day_(n+1) specifies a half-open interval, that is a range of days d where day_n &lt;&#x3D; d &lt; day_(n+1). A subsample is computed for each interval. The valid range of intervals is between 1900-01-01 and the day after the current day. | [optional] 
**samples** | [**PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples**](PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


