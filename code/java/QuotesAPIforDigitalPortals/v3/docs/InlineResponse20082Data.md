

# InlineResponse20082Data


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the notation. |  [optional]
**valueUnit** | [**InlineResponse20079DataValueUnit**](InlineResponse20079DataValueUnit.md) |  |  [optional]
**currency** | [**InlineResponse20079DataCurrency**](InlineResponse20079DataCurrency.md) |  |  [optional]
**market** | [**InlineResponse20080Market**](InlineResponse20080Market.md) |  |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. |  [optional]
**bid** | [**InlineResponse20082Bid**](InlineResponse20082Bid.md) |  |  [optional]
**ask** | [**InlineResponse20082Ask**](InlineResponse20082Ask.md) |  |  [optional]
**status** | [**InlineResponse20065Status**](InlineResponse20065Status.md) |  |  [optional]



## Enum: QualityEnum

Name | Value
---- | -----
RLT | &quot;RLT&quot;
DLY | &quot;DLY&quot;
EOD | &quot;EOD&quot;


## Implemented Interfaces

* Serializable


