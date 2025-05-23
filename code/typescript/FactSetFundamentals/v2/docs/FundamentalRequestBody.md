# factsetfundamentals.FundamentalRequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  &lt;p&gt;ids limit &#x3D;  250 per non-batch request (1 metric per ID, for 1 day) and 5000 per batch request (1 metric per ID, for 1 day).&lt;/p&gt;  | 
**periodicity** | [**Periodicity**](Periodicity.md) |  | [optional] 
**fiscalPeriod** | [**FiscalPeriod**](FiscalPeriod.md) |  | [optional] 
**metrics** | **[String]** | Requested List of Financial Statement Items or Ratios. Use /metrics endpoint for a complete list of available FF_* metric items.  | 
**currency** | **String** | Currency code for currency values. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).  | [optional] [default to &#39;LOCAL&#39;]
**updateType** | [**UpdateType**](UpdateType.md) |  | [optional] 
**batch** | [**Batch**](Batch.md) |  | [optional] 


