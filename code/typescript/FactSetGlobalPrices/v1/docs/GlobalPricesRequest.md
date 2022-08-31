# factsetglobalprices.GlobalPricesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. Requests are limited to 50 IDs for multi-day requests and 1000 IDs for single day requests.  | 
**fields** | **[String]** | Request available pricing data fields to be included in the response. Default is all fields. All responses will include the _fsymId_, _date_, and _currency_ fields.   |field|description|   |---|---|   |price|Closing Price|   |priceOpen|Opening Price|   |priceHigh|High Price|   |priceLow|Low Price|   |volume|Volume|   |turnover|Total Trade Value for the Day|   |tradeCount|Number of Trades|   |vwap|Volume Weighted Average Price|  | [optional] 
**startDate** | **String** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**endDate** | **String** | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**currency** | **String** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**calendar** | [**Calendar**](Calendar.md) |  | [optional] 
**adjust** | [**Adjust**](Adjust.md) |  | [optional] 


