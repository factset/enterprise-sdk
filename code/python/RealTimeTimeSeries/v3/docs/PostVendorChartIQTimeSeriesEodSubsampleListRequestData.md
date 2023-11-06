# PostVendorChartIQTimeSeriesEodSubsampleListRequestData

The data member contains the request's primary data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | [**PostVendorChartIQTimeSeriesEodListRequestDataIdentifier**](PostVendorChartIQTimeSeriesEodListRequestDataIdentifier.md) |  | 
**interval_selection** | [**PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection**](PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection.md) |  | 
**type** | **str** | Type of the price as configured for the customer. | [optional]  if omitted the server will use the default value of "trade"
**quality** | **str** | Quality of the price. | [optional]  if omitted the server will use the default value of "DLY"
**newest_first** | **bool** | Deliver the chronological last part of the requested data first. | [optional]  if omitted the server will use the default value of False
**adjustments** | [**PostVendorChartIQTimeSeriesEodListRequestDataAdjustments**](PostVendorChartIQTimeSeriesEodListRequestDataAdjustments.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


