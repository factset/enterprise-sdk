

# InlineResponse20089Data

Set of price related data for the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**valueUnit** | [**InlineResponse20089DataValueUnit**](InlineResponse20089DataValueUnit.md) |  |  [optional]
**currency** | [**InlineResponse20089DataCurrency**](InlineResponse20089DataCurrency.md) |  |  [optional]
**market** | [**InlineResponse20089DataMarket**](InlineResponse20089DataMarket.md) |  |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. |  [optional]
**latest** | [**InlineResponse20089DataLatest**](InlineResponse20089DataLatest.md) |  |  [optional]
**first** | [**InlineResponse20089DataFirst**](InlineResponse20089DataFirst.md) |  |  [optional]
**low** | [**InlineResponse20089DataLow**](InlineResponse20089DataLow.md) |  |  [optional]
**high** | [**InlineResponse20089DataHigh**](InlineResponse20089DataHigh.md) |  |  [optional]
**previousClose** | [**InlineResponse20089DataPreviousClose**](InlineResponse20089DataPreviousClose.md) |  |  [optional]
**accumulated** | [**InlineResponse20089DataAccumulated**](InlineResponse20089DataAccumulated.md) |  |  [optional]



## Enum: QualityEnum

Name | Value
---- | -----
RLT | &quot;RLT&quot;
DLY | &quot;DLY&quot;
EOD | &quot;EOD&quot;


## Implemented Interfaces

* Serializable


