# FactSet.SDK.FactSetGlobalPrices.Model.ReturnsRequest
Returns Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  &lt;p&gt;ids limit &#x3D;  1000 per non-batch request / 10000 per batch request&lt;/p&gt;  | 
**StartDate** | **string** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**EndDate** | **string** | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**Currency** | **string** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**Frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**DividendAdjust** | [**DividendAdjust**](DividendAdjust.md) |  | [optional] 
**Batch** | [**Batch**](Batch.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

