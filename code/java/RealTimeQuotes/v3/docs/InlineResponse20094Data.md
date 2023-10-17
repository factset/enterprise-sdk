

# InlineResponse20094Data

Orderbook.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. |  [optional]
**asks** | [**java.util.List&lt;InlineResponse20094DataAsks&gt;**](InlineResponse20094DataAsks.md) | Ask entries of the full orderbook. |  [optional]
**bids** | [**java.util.List&lt;InlineResponse20094DataAsks&gt;**](InlineResponse20094DataAsks.md) | Bid entries of the full orderbook. |  [optional]



## Enum: QualityEnum

Name | Value
---- | -----
RLT | &quot;RLT&quot;
DLY | &quot;DLY&quot;


## Implemented Interfaces

* Serializable


