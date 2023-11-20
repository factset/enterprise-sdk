# factsetglobalprices.SharesOutstandingRequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  &lt;p&gt;ids limit &#x3D;  500 per non-batch request / 2000 per batch request for a single day and 50 per multi-day request&lt;/p&gt;  | 
**startDate** | **String** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**endDate** | **String** | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**calendar** | [**Calendar**](Calendar.md) |  | [optional] 
**batch** | [**Batch**](Batch.md) |  | [optional] 


