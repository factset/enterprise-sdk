

# SharesOutstandingRequestBody

Shares Outstanding Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. Requests are limited to 50 IDs.  | 
**startDate** | **String** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  |  [optional]
**endDate** | **String** | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  |  [optional]
**frequency** | **Frequency** |  |  [optional]
**calendar** | **Calendar** |  |  [optional]
**batch** | **Batch** |  |  [optional]


## Implemented Interfaces

* Serializable


