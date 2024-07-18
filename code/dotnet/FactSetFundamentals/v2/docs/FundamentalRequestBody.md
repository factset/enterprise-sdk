# FactSet.SDK.FactSetFundamentals.Model.FundamentalRequestBody
Fundamentals request body elements

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  &lt;p&gt;ids limit &#x3D;  1000 per non-batch request / 30000 per batch request&lt;/p&gt;  | 
**Periodicity** | **Periodicity** |  | [optional] 
**FiscalPeriod** | [**FiscalPeriod**](FiscalPeriod.md) |  | [optional] 
**Metrics** | **List&lt;string&gt;** | Requested List of Financial Statement Items or Ratios. Use /metrics endpoint for a complete list of available FF_* metric items.  | 
**Currency** | **string** | Currency code for currency values. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).  | [optional] [default to "LOCAL"]
**UpdateType** | **UpdateType** |  | [optional] 
**Batch** | **Batch** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

