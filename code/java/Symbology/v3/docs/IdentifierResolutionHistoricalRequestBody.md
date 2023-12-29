

# IdentifierResolutionHistoricalRequestBody

Request object for Historical Identifier Resolution endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Requested market securities or entities. All requested identifiers must be of the same type. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. | 
**inputSymbolType** | **GetHistoricalInputSymbolType** |  | 
**outputSymbolTypes** | [**java.util.List&lt;OutputSymbolTypesEnum&gt;**](#java.util.List&lt;OutputSymbolTypesEnum&gt;) | Requested identifiers to be returned. Multiple identifier types can be requested with each request. | 
**asOfDate** | **LocalDate** | As of date for historical symbol request in YYYY-MM-DD format. If no &#x60;asOfDate&#x60; is requested, the response will include the full history of the identifier.  |  [optional]



## Enum: java.util.List&lt;OutputSymbolTypesEnum&gt;

Name | Value
---- | -----
SEDOL | &quot;SEDOL&quot;
CUSIP | &quot;CUSIP&quot;
ISIN | &quot;ISIN&quot;
TICKERREGION | &quot;tickerRegion&quot;


## Implemented Interfaces

* Serializable


