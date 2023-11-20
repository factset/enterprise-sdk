# FactSet.SDK.FactSetGlobalPrices.Model.SharesOutstandingRequestBody
Shares Outstanding Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  &lt;p&gt;ids limit &#x3D;  500 per non-batch request / 2000 per batch request for a single day and 50 per multi-day request&lt;/p&gt;  | 
**StartDate** | **string** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**EndDate** | **string** | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**Frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**Calendar** | [**Calendar**](Calendar.md) |  | [optional] 
**Batch** | [**Batch**](Batch.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

