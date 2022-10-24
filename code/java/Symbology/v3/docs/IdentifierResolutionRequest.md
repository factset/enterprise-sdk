

# IdentifierResolutionRequest

Request object for Identifier Resolution endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Requested market securities or entities. All requested identifiers must be of the same type. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#39;requestId&#39;. | 
**inputSymbolType** | **GetInputSymbolType** |  | 
**outputSymbolTypes** | [**java.util.List&lt;OutputSymbolTypesEnum&gt;**](#java.util.List&lt;OutputSymbolTypesEnum&gt;) | Requested identifiers to be returned. Multiple identifier types can be requested with each request. | 



## Enum: java.util.List&lt;OutputSymbolTypesEnum&gt;

Name | Value
---- | -----
BIC | &quot;BIC&quot;
CIK | &quot;CIK&quot;
CRD | &quot;CRD&quot;
EIN | &quot;EIN&quot;
FITCH | &quot;FITCH&quot;
LEI | &quot;LEI&quot;
MD | &quot;MD&quot;
SPR | &quot;SPR&quot;
WKN | &quot;WKN&quot;
UKCH | &quot;UKCH&quot;
RSSD | &quot;RSSD&quot;
SEDOL | &quot;SEDOL&quot;
CUSIP | &quot;CUSIP&quot;
FSYMENTITYID | &quot;fsymEntityId&quot;
FSYMSECURITYID | &quot;fsymSecurityId&quot;
FSYMREGIONALID | &quot;fsymRegionalId&quot;
FSYMLISTINGID | &quot;fsymListingId&quot;
ISIN | &quot;ISIN&quot;
TICKEREXCHANGE | &quot;tickerExchange&quot;
TICKERREGION | &quot;tickerRegion&quot;


## Implemented Interfaces

* Serializable


