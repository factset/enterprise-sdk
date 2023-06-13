

# InlineResponse20086Data

Bid and ask prices for the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**valueUnit** | [**InlineResponse20084DataValueUnit**](InlineResponse20084DataValueUnit.md) |  |  [optional]
**currency** | [**InlineResponse20084DataCurrency**](InlineResponse20084DataCurrency.md) |  |  [optional]
**market** | [**InlineResponse20085Market**](InlineResponse20085Market.md) |  |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. |  [optional]
**bid** | [**InlineResponse20086DataBid**](InlineResponse20086DataBid.md) |  |  [optional]
**ask** | [**InlineResponse20086DataAsk**](InlineResponse20086DataAsk.md) |  |  [optional]



## Enum: QualityEnum

Name | Value
---- | -----
RLT | &quot;RLT&quot;
DLY | &quot;DLY&quot;
EOD | &quot;EOD&quot;


## Implemented Interfaces

* Serializable


