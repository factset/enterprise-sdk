# factsetfunds.MarketAggregatesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.  Request Limits:      - ids limit &#x3D; 1000 per request(Non batch)   - Batch requests:       * Single day: up to 5000 IDs per request       * Multi-day: up to 1500 IDs per request         | 
**startDate** | **String** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**endDate** | **String** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**currency** | **String** | The ISO3 currency control for the requested fund. | [optional] [default to &#39;LOCAL&#39;]
**batch** | [**Batch**](Batch.md) |  | [optional] 


