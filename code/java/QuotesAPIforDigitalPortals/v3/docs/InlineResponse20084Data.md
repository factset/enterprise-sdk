

# InlineResponse20084Data

Bid and ask prices for the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**valueUnit** | [**InlineResponse20082DataValueUnit**](InlineResponse20082DataValueUnit.md) |  |  [optional]
**currency** | [**InlineResponse20082DataCurrency**](InlineResponse20082DataCurrency.md) |  |  [optional]
**market** | [**InlineResponse20083Market**](InlineResponse20083Market.md) |  |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. |  [optional]
**bid** | [**InlineResponse20084DataBid**](InlineResponse20084DataBid.md) |  |  [optional]
**ask** | [**InlineResponse20084DataAsk**](InlineResponse20084DataAsk.md) |  |  [optional]



## Enum: QualityEnum

Name | Value
---- | -----
RLT | &quot;RLT&quot;
DLY | &quot;DLY&quot;
EOD | &quot;EOD&quot;


## Implemented Interfaces

* Serializable


