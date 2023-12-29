# FactSet.SDK.Symbology.Model.IdentifierResolutionHistoricalRequestBody
Request object for Historical Identifier Resolution endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Requested market securities or entities. All requested identifiers must be of the same type. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. | 
**InputSymbolType** | [**GetHistoricalInputSymbolType**](GetHistoricalInputSymbolType.md) |  | 
**OutputSymbolTypes** | **List&lt;string&gt;** | Requested identifiers to be returned. Multiple identifier types can be requested with each request. | 
**AsOfDate** | **DateTime** | As of date for historical symbol request in YYYY-MM-DD format. If no &#x60;asOfDate&#x60; is requested, the response will include the full history of the identifier.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

