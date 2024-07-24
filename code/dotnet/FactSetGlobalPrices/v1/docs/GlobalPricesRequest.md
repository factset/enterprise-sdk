# FactSet.SDK.FactSetGlobalPrices.Model.GlobalPricesRequest
Prices Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  &lt;p&gt;ids limit &#x3D;  500 per non-batch request / 2000 per batch request for a single day and 50 per multi-day request&lt;/p&gt;  | 
**Fields** | **List&lt;string&gt;** | Request available pricing data fields to be included in the response. Default is all fields. All responses will include the _fsymId_, _date_, and _currency_ fields.   |field|description|   |- --|- --|   |price|Closing Price|   |priceOpen|Opening Price|   |priceHigh|High Price|   |priceLow|Low Price|   |volume|Volume|   |turnover|Total Trade Value for the Day|   |tradeCount|Number of Trades|   |vwap|Volume Weighted Average Price|  | [optional] 
**StartDate** | **string** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**EndDate** | **string** | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**Frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**Currency** | **string** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**Calendar** | [**Calendar**](Calendar.md) |  | [optional] 
**Adjust** | [**Adjust**](Adjust.md) |  | [optional] 
**Batch** | [**Batch**](Batch.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

