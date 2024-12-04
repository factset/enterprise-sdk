

# InlineResponse2008Data

Time series data for the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**range** | [**InlineResponse2008DataRange**](InlineResponse2008DataRange.md) |  |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. | Value | Description | | --- | --- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. |   |  [optional]
**prices** | [**java.util.List&lt;PostPricesTimeSeriesIntradayListDataPricesItems&gt;**](PostPricesTimeSeriesIntradayListDataPricesItems.md) | Time series of prices. |  [optional]



## Enum: QualityEnum

Name | Value
---- | -----
RLT | &quot;RLT&quot;
DLY | &quot;DLY&quot;


## Implemented Interfaces

* Serializable


