

# InlineResponse20091Data

Bid and ask prices for the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**valueUnit** | [**InlineResponse20089DataValueUnit**](InlineResponse20089DataValueUnit.md) |  |  [optional]
**currency** | [**InlineResponse20089DataCurrency**](InlineResponse20089DataCurrency.md) |  |  [optional]
**market** | [**InlineResponse20090Market**](InlineResponse20090Market.md) |  |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. |  [optional]
**bid** | [**InlineResponse20091DataBid**](InlineResponse20091DataBid.md) |  |  [optional]
**ask** | [**InlineResponse20091DataAsk**](InlineResponse20091DataAsk.md) |  |  [optional]



## Enum: QualityEnum

Name | Value
---- | -----
RLT | &quot;RLT&quot;
DLY | &quot;DLY&quot;
EOD | &quot;EOD&quot;


## Implemented Interfaces

* Serializable


