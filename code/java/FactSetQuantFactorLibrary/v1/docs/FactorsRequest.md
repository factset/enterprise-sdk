

# FactorsRequest

Request object for requesting factors.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. *  | 
**factors** | **java.util.List&lt;String&gt;** | List of Factors.  | 
**factorGroups** | **java.util.List&lt;String&gt;** | List of Factor Groupings to return all factors within the group.  |  [optional]
**startDate** | **String** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**endDate** | **String** | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. **NOTE:** The input endDate must come AFTER the input startDate.  | 
**frequency** | **Frequency** |  |  [optional]


## Implemented Interfaces

* Serializable


