# realtimetimeseries.InlineResponse2008Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. | [optional] 
**sourceIdentifier** | **String** | Identifier used in the request. | [optional] 
**range** | [**InlineResponse2008DataRange**](InlineResponse2008DataRange.md) |  | [optional] 
**quality** | **String** | Quality of the price. | Value | Description | | --- | --- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. |   | [optional] 
**prices** | [**[PostPricesTimeSeriesIntradayListDataPricesItems]**](PostPricesTimeSeriesIntradayListDataPricesItems.md) | Time series of prices. | [optional] 



## Enum: QualityEnum


* `RLT` (value: `"RLT"`)

* `DLY` (value: `"DLY"`)




