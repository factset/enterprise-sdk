# factsetglobalprices.ReturnsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  &lt;p&gt;ids limit &#x3D;  1000 per non-batch request / 10000 per batch request&lt;/p&gt;  | 
**startDate** | **String** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**endDate** | **String** | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**currency** | **String** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**dividendAdjust** | [**DividendAdjust**](DividendAdjust.md) |  | [optional] 
**batch** | [**Batch**](Batch.md) |  | [optional] 


