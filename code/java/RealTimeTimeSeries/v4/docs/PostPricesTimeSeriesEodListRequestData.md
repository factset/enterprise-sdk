

# PostPricesTimeSeriesEodListRequestData

The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | [**PostVendorChartIQTimeSeriesEodListRequestDataIdentifier**](PostVendorChartIQTimeSeriesEodListRequestDataIdentifier.md) |  | 
**type** | [**TypeEnum**](#TypeEnum) | Type of the price as configured for the customer. | Value | Description | | --- | --- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. | | estimate | Estimated price. |   |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. | Value | Description | | --- | --- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |   |  [optional]
**range** | [**PostPricesTimeSeriesEodListRequestDataRange**](PostPricesTimeSeriesEodListRequestDataRange.md) |  | 
**newestFirst** | **Boolean** | Deliver the chronological last part of the requested data first. |  [optional]
**adjustments** | [**PostVendorChartIQTimeSeriesEodListRequestDataAdjustments**](PostVendorChartIQTimeSeriesEodListRequestDataAdjustments.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
TRADE | &quot;trade&quot;
BID | &quot;bid&quot;
ASK | &quot;ask&quot;
YIELD | &quot;yield&quot;
ESTIMATE | &quot;estimate&quot;



## Enum: QualityEnum

Name | Value
---- | -----
DLY | &quot;DLY&quot;
EOD | &quot;EOD&quot;
BST | &quot;BST&quot;


## Implemented Interfaces

* Serializable


