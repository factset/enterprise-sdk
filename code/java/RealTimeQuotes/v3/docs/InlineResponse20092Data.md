

# InlineResponse20092Data


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**valueUnit** | [**InlineResponse20089DataValueUnit**](InlineResponse20089DataValueUnit.md) |  |  [optional]
**currency** | [**InlineResponse20089DataCurrency**](InlineResponse20089DataCurrency.md) |  |  [optional]
**market** | [**InlineResponse20090Market**](InlineResponse20090Market.md) |  |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. |  [optional]
**bid** | [**InlineResponse20092Bid**](InlineResponse20092Bid.md) |  |  [optional]
**ask** | [**InlineResponse20092Ask**](InlineResponse20092Ask.md) |  |  [optional]
**status** | [**InlineResponse20086Status**](InlineResponse20086Status.md) |  |  [optional]



## Enum: QualityEnum

Name | Value
---- | -----
RLT | &quot;RLT&quot;
DLY | &quot;DLY&quot;
EOD | &quot;EOD&quot;


## Implemented Interfaces

* Serializable


