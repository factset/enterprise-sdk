# FactSet.SDK.RealTimeTimeSeries.Model.PostVendorChartIQTimeSeriesIntradaySubsampleListRequestData
The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Identifier** | [**PostVendorChartIQTimeSeriesEodListRequestDataIdentifier**](PostVendorChartIQTimeSeriesEodListRequestDataIdentifier.md) |  | 
**Type** | **string** | Type of the price as configured for the customer. | [optional] [default to TypeEnum.Trade]
**Quality** | **string** | Quality of the price. | [optional] [default to QualityEnum.DLY]
**Range** | [**PostVendorChartIQTimeSeriesIntradaySubsampleListRequestDataRange**](PostVendorChartIQTimeSeriesIntradaySubsampleListRequestDataRange.md) |  | 
**Granularity** | **string** | Subsample granularities suitable for intraday data. | [optional] [default to GranularityEnum._1h]
**NewestFirst** | **bool** | Deliver the chronological last part of the requested data first. | [optional] [default to false]
**Adjustments** | [**PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments**](PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

