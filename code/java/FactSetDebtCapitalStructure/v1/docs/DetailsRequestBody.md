

# DetailsRequestBody

Details Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. Maximum of 25 IDs are supported.  | 
**periodicity** | **Periodicity** |  |  [optional]
**date** | **LocalDate** | The date of the period requested in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  |  [optional]


## Implemented Interfaces

* Serializable


