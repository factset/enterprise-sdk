# VendorChartIQTimeSeriesEodSubsampleGetData

The data member contains the request's primary data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Identifier of the notation. | 
**interval** | [**VendorChartIQTimeSeriesEodSubsampleGetDataInterval**](VendorChartIQTimeSeriesEodSubsampleGetDataInterval.md) |  | 
**type** | **str** | Type of the price as configured for the customer. | [optional]  if omitted the server will use the default value of "trade"
**quality** | **str** | Quality of the price. | [optional]  if omitted the server will use the default value of "DLY"
**adjustments** | [**VendorChartIQTimeSeriesEodListDataAdjustments**](VendorChartIQTimeSeriesEodListDataAdjustments.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


