# FactSet.SDK.RealTimeTimeSeries.Model.PostPricesTimeSeriesEodSubsampleListRequestData
The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Identifier** | [**PostVendorChartIQTimeSeriesEodListRequestDataIdentifier**](PostVendorChartIQTimeSeriesEodListRequestDataIdentifier.md) |  | 
**Type** | **string** | Type of the price as configured for the customer. | Value | Description | | - -- | - -- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. | | estimate | Estimated price. |   | [optional] [default to TypeEnum.Trade]
**Quality** | **string** | Quality of the price. | Value | Description | | - -- | - -- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |   | [optional] [default to QualityEnum.DLY]
**IntervalSelection** | [**PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelection**](PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelection.md) |  | 
**NewestFirst** | **bool** | Deliver the chronological last part of the requested data first. | [optional] [default to false]
**Adjustments** | [**PostPricesTimeSeriesEodSubsampleListRequestDataAdjustments**](PostPricesTimeSeriesEodSubsampleListRequestDataAdjustments.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

