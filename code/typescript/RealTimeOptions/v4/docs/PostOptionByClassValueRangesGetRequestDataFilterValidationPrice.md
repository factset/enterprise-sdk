# realtimeoptions.PostOptionByClassValueRangesGetRequestDataFilterValidationPrice

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quality** | **String** | Quality of the price. | Value | Description | | --- | --- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. |   | [optional] 
**latest** | [**PostOptionByClassValueRangesGetRequestDataFilterValidationPriceLatest**](PostOptionByClassValueRangesGetRequestDataFilterValidationPriceLatest.md) |  | [optional] 
**previous** | [**PostOptionByClassValueRangesGetRequestDataFilterValidationPricePrevious**](PostOptionByClassValueRangesGetRequestDataFilterValidationPricePrevious.md) |  | [optional] 



## Enum: QualityEnum


* `DLY` (value: `"DLY"`)

* `EOD` (value: `"EOD"`)




