

# InlineResponse20088Data

Orderbook.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. |  [optional]
**asks** | [**java.util.List&lt;InlineResponse20088DataAsks&gt;**](InlineResponse20088DataAsks.md) | List of sell orders aggregated by price. |  [optional]
**bids** | [**java.util.List&lt;InlineResponse20088DataAsks&gt;**](InlineResponse20088DataAsks.md) | List of buy orders aggregated by price. |  [optional]



## Enum: QualityEnum

Name | Value
---- | -----
RLT | &quot;RLT&quot;
DLY | &quot;DLY&quot;


## Implemented Interfaces

* Serializable


