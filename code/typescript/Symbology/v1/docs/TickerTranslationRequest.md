# symbology.TickerTranslationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#x60;. | 
**tickerType** | **String** | Controls the Ticker Type returned.   * **REGION** &#x3D; Ticker-Regional   * **EXCHANGE** &#x3D; Ticker-Exchange  | 
**asOfDate** | **String** | As-Of Date for historical symbol request in YYYY-MM-DD format. | [optional] 


