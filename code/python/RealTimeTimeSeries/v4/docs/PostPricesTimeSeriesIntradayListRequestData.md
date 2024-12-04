# PostPricesTimeSeriesIntradayListRequestData

The data member contains the request's primary data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | [**PostVendorChartIQTimeSeriesEodListRequestDataIdentifier**](PostVendorChartIQTimeSeriesEodListRequestDataIdentifier.md) |  | 
**range** | [**PostPricesTimeSeriesIntradayListRequestDataRange**](PostPricesTimeSeriesIntradayListRequestDataRange.md) |  | 
**type** | **str** | Type of the price as configured for the customer. | Value | Description | | --- | --- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. |   | [optional]  if omitted the server will use the default value of "trade"
**quality** | **str** | Quality of the price. | Value | Description | | --- | --- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |   | [optional]  if omitted the server will use the default value of "DLY"
**newest_first** | **bool** | Deliver the chronological last part of the requested data first. | [optional]  if omitted the server will use the default value of False
**apply_tick_corrections** | **str** | This attribute represents the choice whether to apply insert, update, and delete corrections for individual ticks sent by the exchange or devised by FactSet Digital Solutions GmbH.   If the exchange or FactSet Digital Solutions GmbH decides to correct data, a correction instruction tick is sent shortly (usually on the same trading day) after dissemination of the corresponding original tick (if any). The correction instruction is then applied, yielding a corrected view. For \&quot;insert\&quot; corrections, there is no original tick, and the corrected view contains the inserted tick. For \&quot;update\&quot; corrections, the corrected view contains the updated original tick. For \&quot;delete\&quot; corrections, the original tick is removed from the corrected view. | Value | Description | | --- | --- | | none | Select original tick data without applying any corrections. | | all | Select corrected view. |   | [optional]  if omitted the server will use the default value of "none"
**include_volume_only_ticks** | **bool** | Include ticks that contain a volume without a price. | [optional]  if omitted the server will use the default value of False
**adjustments** | [**PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments**](PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


