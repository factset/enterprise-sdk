# symbology.IdentifierResolutionHistoricalRequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Requested market securities or entities. All requested identifiers must be of the same type. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. | 
**inputSymbolType** | [**GetHistoricalInputSymbolType**](GetHistoricalInputSymbolType.md) |  | 
**outputSymbolTypes** | **[String]** | Requested identifiers to be returned. Multiple identifier types can be requested with each request. | 
**asOfDate** | **Date** | As of date for historical symbol request in YYYY-MM-DD format. If no &#x60;asOfDate&#x60; is requested, the response will include the full history of the identifier.  | [optional] 



## Enum: [OutputSymbolTypesEnum]


* `SEDOL` (value: `"SEDOL"`)

* `CUSIP` (value: `"CUSIP"`)

* `ISIN` (value: `"ISIN"`)

* `tickerRegion` (value: `"tickerRegion"`)




