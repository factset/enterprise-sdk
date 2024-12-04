# realtimetimeseries.PostPricesTimeSeriesEodListRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | [**PostVendorChartIQTimeSeriesEodListRequestDataIdentifier**](PostVendorChartIQTimeSeriesEodListRequestDataIdentifier.md) |  | 
**type** | **String** | Type of the price as configured for the customer. | Value | Description | | --- | --- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. | | estimate | Estimated price. |   | [optional] [default to &#39;trade&#39;]
**quality** | **String** | Quality of the price. | Value | Description | | --- | --- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |   | [optional] [default to &#39;DLY&#39;]
**range** | [**PostPricesTimeSeriesEodListRequestDataRange**](PostPricesTimeSeriesEodListRequestDataRange.md) |  | 
**newestFirst** | **Boolean** | Deliver the chronological last part of the requested data first. | [optional] [default to false]
**adjustments** | [**PostVendorChartIQTimeSeriesEodListRequestDataAdjustments**](PostVendorChartIQTimeSeriesEodListRequestDataAdjustments.md) |  | [optional] 



## Enum: TypeEnum


* `trade` (value: `"trade"`)

* `bid` (value: `"bid"`)

* `ask` (value: `"ask"`)

* `yield` (value: `"yield"`)

* `estimate` (value: `"estimate"`)





## Enum: QualityEnum


* `DLY` (value: `"DLY"`)

* `EOD` (value: `"EOD"`)

* `BST` (value: `"BST"`)




