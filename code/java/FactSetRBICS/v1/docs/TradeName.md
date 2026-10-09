

# TradeName

Trade Names response object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asOfDate** | **LocalDate** | Date of the tradeName data snapshot (YYYY-MM-DD) |  [optional]
**factsetEntityId** | **String** | FactSet Entity Identifier |  [optional]
**requestId** | **String** | Original identifier from request (ticker, CUSIP, entity ID, etc.) |  [optional]
**summary** | [**TradeNameSummary**](TradeNameSummary.md) |  |  [optional]
**tradeNames** | [**java.util.List&lt;TradeNames&gt;**](TradeNames.md) | List of tradeNames for the entity on this date. Omitted when the request &#x60;responseFormat&#x60; is &#x60;SUMMARY_ONLY&#x60;.  |  [optional]
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  |  [optional]


## Implemented Interfaces

* Serializable


