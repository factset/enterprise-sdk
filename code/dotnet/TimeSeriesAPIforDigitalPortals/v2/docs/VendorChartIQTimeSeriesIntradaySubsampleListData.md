# FactSet.SDK.TimeSeriesAPIforDigitalPortals.Model.VendorChartIQTimeSeriesIntradaySubsampleListData
The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of the notation. | 
**Type** | **string** | Type of the price as configured for the customer. | [optional] [default to TypeEnum.Trade]
**Quality** | **string** | Quality of the price. | [optional] [default to QualityEnum.DLY]
**Range** | [**VendorChartIQTimeSeriesIntradaySubsampleListDataRange**](VendorChartIQTimeSeriesIntradaySubsampleListDataRange.md) |  | 
**Granularity** | **string** | Subsample granularities suitable for intraday data. | [optional] [default to GranularityEnum._1h]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

