# FactSet.SDK.Symbology.Model.TickerTranslationRequest
Request object for Ticker endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#x60;. | 
**TickerType** | **string** | Controls the Ticker Type returned.   * **REGION** &#x3D; Ticker-Regional   * **EXCHANGE** &#x3D; Ticker-Exchange  | 
**AsOfDate** | **string** | As-Of Date for historical symbol request in YYYY-MM-DD format. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

