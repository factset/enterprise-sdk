# PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval

Non-empty interval of days specifying a single subsample period. The starting point `start` of the single subsample is usually the attribute `range.end` of a previously received `/vendor/chartIQ/timeSeries/eod/subsample/list` request. A valid range is between 1900-01-01 and a day that is less than or equal to the maximum allowed day determined from the delay period (if any). The ending point `end` may exceed the maximally entitled date range.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **date** | The starting point of the interval (inclusive).  | 
**end** | **date** | The ending point of the interval (exclusive). | 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


