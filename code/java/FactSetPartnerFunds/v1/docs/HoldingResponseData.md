

# HoldingResponseData

Holdings data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The input identifier. |  [optional]
**error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  |  [optional]
**asOfDate** | **LocalDate** | Date when the holdings were reported. |  [optional]
**top10Weight** | **Double** | Returns the total weight of the top 10 holdings as a percentage |  [optional]
**holdings** | [**java.util.List&lt;Holding&gt;**](Holding.md) | List of holdings |  [optional]


## Implemented Interfaces

* Serializable


