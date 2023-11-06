

# InlineResponse2008Data

Time series data for the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**range** | [**InlineResponse2004DataRange**](InlineResponse2004DataRange.md) |  |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. |  [optional]
**prices** | [**java.util.List&lt;InlineResponse2008DataPrices&gt;**](InlineResponse2008DataPrices.md) | Time series of prices. |  [optional]



## Enum: QualityEnum

Name | Value
---- | -----
RLT | &quot;RLT&quot;
DLY | &quot;DLY&quot;


## Implemented Interfaces

* Serializable


