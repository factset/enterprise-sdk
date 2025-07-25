

# PostOptionByClassListRequestDataFilterValidationPrice

Price-related parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. | Value | Description | | --- | --- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. |   |  [optional]
**latest** | [**PostOptionByClassListRequestDataFilterValidationPriceLatest**](PostOptionByClassListRequestDataFilterValidationPriceLatest.md) |  |  [optional]
**previous** | [**PostOptionByClassListRequestDataFilterValidationPricePrevious**](PostOptionByClassListRequestDataFilterValidationPricePrevious.md) |  |  [optional]



## Enum: QualityEnum

Name | Value
---- | -----
DLY | &quot;DLY&quot;
EOD | &quot;EOD&quot;


## Implemented Interfaces

* Serializable


