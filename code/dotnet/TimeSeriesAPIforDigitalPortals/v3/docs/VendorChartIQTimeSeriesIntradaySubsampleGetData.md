# FactSet.SDK.TimeSeriesAPIforDigitalPortals.Model.VendorChartIQTimeSeriesIntradaySubsampleGetData
The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of the notation. | 
**Type** | **string** | Type of the price as configured for the customer. | [optional] [default to TypeEnum.Trade]
**Quality** | **string** | Quality of the price. | [optional] [default to QualityEnum.DLY]
**From** | **string** | Date and time of the start point of the subsample (inclusive). &#x60;from&#x60; must be aligned to &#x60;granularity&#x60;. That is, the numerical value is an integral multiple of the time span value represented by &#x60;granularity&#x60;. The data accessible in the past is limited to a few weeks at most. Values in the future are not allowed. | 
**Granularity** | **string** | Subsample granularities suitable for intraday data. | [optional] [default to GranularityEnum._1h]
**Adjustments** | [**VendorChartIQTimeSeriesIntradaySubsampleGetDataAdjustments**](VendorChartIQTimeSeriesIntradaySubsampleGetDataAdjustments.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

