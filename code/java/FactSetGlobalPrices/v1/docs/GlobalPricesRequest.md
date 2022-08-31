

# GlobalPricesRequest

Prices Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. Requests are limited to 50 IDs for multi-day requests and 1000 IDs for single day requests.  | 
**fields** | **java.util.List&lt;String&gt;** | Request available pricing data fields to be included in the response. Default is all fields. All responses will include the _fsymId_, _date_, and _currency_ fields.   |field|description|   |---|---|   |price|Closing Price|   |priceOpen|Opening Price|   |priceHigh|High Price|   |priceLow|Low Price|   |volume|Volume|   |turnover|Total Trade Value for the Day|   |tradeCount|Number of Trades|   |vwap|Volume Weighted Average Price|  |  [optional]
**startDate** | **String** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**endDate** | **String** | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  |  [optional]
**frequency** | **Frequency** |  |  [optional]
**currency** | **String** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). |  [optional]
**calendar** | **Calendar** |  |  [optional]
**adjust** | **Adjust** |  |  [optional]


## Implemented Interfaces

* Serializable


