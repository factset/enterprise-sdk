# FactSet.SDK.FactSetFunds.Model.MarketAggregatesRequest
Market Aggregate Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.  Request Limits:      - ids limit &#x3D; 1000 per request(Non batch)   - Batch requests:       * Single day: up to 5000 IDs per request       * Multi-day: up to 1500 IDs per request         | 
**StartDate** | **string** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**EndDate** | **string** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**Frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**Currency** | **string** | The ISO3 currency control for the requested fund. | [optional] [default to "LOCAL"]
**Batch** | **Batch** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

