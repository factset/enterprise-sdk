

# PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPrices

Price-related parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the trade-related attributes, see attributes &#x60;trade&#x60; and &#x60;accumulated&#x60; in the response. | Value | Description | | --- | --- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. |   |  [optional]



## Enum: QualityEnum

Name | Value
---- | -----
RLT | &quot;RLT&quot;
DLY | &quot;DLY&quot;


## Implemented Interfaces

* Serializable


