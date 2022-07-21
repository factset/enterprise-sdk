# VendorChartIQTimeSeriesIntradaySubsampleListDataRange

Date and time range for the time series. The `start` and `end` boundaries must be aligned to `granularity`. That is, the numerical value is an integral multiple of the time span value represented by `granularity`.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **str** | The starting point of the time range (inclusive). The data accessible in the past is limited to a few weeks at most. | 
**end** | **str** | The ending point of the time range (exclusive). Values in the future are not allowed. | 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


