# FactSet.SDK.RealTimeTimeSeries.Model.PostVendorChartIQTimeSeriesEodSubsampleListRequestData
The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Identifier** | [**PostVendorChartIQTimeSeriesEodListRequestDataIdentifier**](PostVendorChartIQTimeSeriesEodListRequestDataIdentifier.md) |  | 
**Type** | **string** | Type of the price as configured for the customer. | [optional] [default to TypeEnum.Trade]
**Quality** | **string** | Quality of the price. | [optional] [default to QualityEnum.DLY]
**IntervalSelection** | [**PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection**](PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection.md) |  | 
**NewestFirst** | **bool** | Deliver the chronological last part of the requested data first. | [optional] [default to false]
**Adjustments** | [**PostVendorChartIQTimeSeriesEodListRequestDataAdjustments**](PostVendorChartIQTimeSeriesEodListRequestDataAdjustments.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

