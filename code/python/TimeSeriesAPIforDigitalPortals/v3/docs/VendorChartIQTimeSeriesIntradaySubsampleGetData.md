# VendorChartIQTimeSeriesIntradaySubsampleGetData

The data member contains the request's primary data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Identifier of the notation. | 
**_from** | **str** | Date and time of the start point of the subsample (inclusive). &#x60;from&#x60; must be aligned to &#x60;granularity&#x60;. That is, the numerical value is an integral multiple of the time span value represented by &#x60;granularity&#x60;. The data accessible in the past is limited to a few weeks at most. Values in the future are not allowed. | 
**type** | **str** | Type of the price as configured for the customer. | [optional]  if omitted the server will use the default value of "trade"
**quality** | **str** | Quality of the price. | [optional]  if omitted the server will use the default value of "DLY"
**granularity** | **str** | Subsample granularities suitable for intraday data. | [optional]  if omitted the server will use the default value of "1h"
**adjustments** | [**VendorChartIQTimeSeriesIntradaySubsampleGetDataAdjustments**](VendorChartIQTimeSeriesIntradaySubsampleGetDataAdjustments.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


