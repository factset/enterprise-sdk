# PostPricesTimeSeriesEodListRequestData

The data member contains the request's primary data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | [**PostVendorChartIQTimeSeriesEodListRequestDataIdentifier**](PostVendorChartIQTimeSeriesEodListRequestDataIdentifier.md) |  | 
**range** | [**PostPricesTimeSeriesEodListRequestDataRange**](PostPricesTimeSeriesEodListRequestDataRange.md) |  | 
**type** | **str** | Type of the price as configured for the customer. | Value | Description | | --- | --- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. | | estimate | Estimated price. |   | [optional]  if omitted the server will use the default value of "trade"
**quality** | **str** | Quality of the price. | Value | Description | | --- | --- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |   | [optional]  if omitted the server will use the default value of "DLY"
**newest_first** | **bool** | Deliver the chronological last part of the requested data first. | [optional]  if omitted the server will use the default value of False
**adjustments** | [**PostVendorChartIQTimeSeriesEodListRequestDataAdjustments**](PostVendorChartIQTimeSeriesEodListRequestDataAdjustments.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


