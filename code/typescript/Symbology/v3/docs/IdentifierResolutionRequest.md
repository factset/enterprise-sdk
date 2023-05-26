# symbology.IdentifierResolutionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Requested market securities or entities. All requested identifiers must be of the same type. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. | 
**inputSymbolType** | [**GetInputSymbolType**](GetInputSymbolType.md) |  | 
**outputSymbolTypes** | **[String]** | Requested identifiers to be returned. Multiple identifier types can be requested with each request. | 



## Enum: [OutputSymbolTypesEnum]


* `BIC` (value: `"BIC"`)

* `CIK` (value: `"CIK"`)

* `CRD` (value: `"CRD"`)

* `EIN` (value: `"EIN"`)

* `FITCH` (value: `"FITCH"`)

* `LEI` (value: `"LEI"`)

* `MD` (value: `"MD"`)

* `SPR` (value: `"SPR"`)

* `WKN` (value: `"WKN"`)

* `UKCH` (value: `"UKCH"`)

* `RSSD` (value: `"RSSD"`)

* `SEDOL` (value: `"SEDOL"`)

* `CUSIP` (value: `"CUSIP"`)

* `fsymEntityId` (value: `"fsymEntityId"`)

* `fsymSecurityId` (value: `"fsymSecurityId"`)

* `fsymRegionalId` (value: `"fsymRegionalId"`)

* `fsymListingId` (value: `"fsymListingId"`)

* `ISIN` (value: `"ISIN"`)

* `tickerExchange` (value: `"tickerExchange"`)

* `tickerRegion` (value: `"tickerRegion"`)

* `JCN` (value: `"JCN"`)

* `bloombergListingTicker` (value: `"bloombergListingTicker"`)

* `bloombergRegionalTicker` (value: `"bloombergRegionalTicker"`)

* `bloombergFigiListing` (value: `"bloombergFigiListing"`)

* `bloombergFigiRegional` (value: `"bloombergFigiRegional"`)

* `bloombergFigiSecurity` (value: `"bloombergFigiSecurity"`)




