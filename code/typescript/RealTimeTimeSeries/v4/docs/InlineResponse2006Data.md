# realtimetimeseries.InlineResponse2006Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. | [optional] 
**sourceIdentifier** | **String** | Identifier used in the request. | [optional] 
**quality** | **String** | Quality of the price. | Value | Description | | --- | --- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. |   | [optional] 
**subsample** | [**InlineResponse2006DataSubsample**](InlineResponse2006DataSubsample.md) |  | [optional] 



## Enum: QualityEnum


* `DLY` (value: `"DLY"`)

* `EOD` (value: `"EOD"`)




