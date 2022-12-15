

# InlineResponse20082Data

Set of price related data for the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**valueUnit** | [**InlineResponse20082DataValueUnit**](InlineResponse20082DataValueUnit.md) |  |  [optional]
**currency** | [**InlineResponse20082DataCurrency**](InlineResponse20082DataCurrency.md) |  |  [optional]
**market** | [**InlineResponse20082DataMarket**](InlineResponse20082DataMarket.md) |  |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. |  [optional]
**latest** | [**InlineResponse20082DataLatest**](InlineResponse20082DataLatest.md) |  |  [optional]
**first** | [**InlineResponse20082DataFirst**](InlineResponse20082DataFirst.md) |  |  [optional]
**low** | [**InlineResponse20082DataLow**](InlineResponse20082DataLow.md) |  |  [optional]
**high** | [**InlineResponse20082DataHigh**](InlineResponse20082DataHigh.md) |  |  [optional]
**previousClose** | [**InlineResponse20082DataPreviousClose**](InlineResponse20082DataPreviousClose.md) |  |  [optional]
**accumulated** | [**InlineResponse20082DataAccumulated**](InlineResponse20082DataAccumulated.md) |  |  [optional]



## Enum: QualityEnum

Name | Value
---- | -----
RLT | &quot;RLT&quot;
DLY | &quot;DLY&quot;
EOD | &quot;EOD&quot;


## Implemented Interfaces

* Serializable


