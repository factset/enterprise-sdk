

# TickerTranslationRequest

Request object for Ticker endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. | 
**tickerType** | **String** | Controls the Ticker Type returned.   * **REGION** &#x3D; Ticker-Regional   * **EXCHANGE** &#x3D; Ticker-Exchange  | 


## Implemented Interfaces

* Serializable


