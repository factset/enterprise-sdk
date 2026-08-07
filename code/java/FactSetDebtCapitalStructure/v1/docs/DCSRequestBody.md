

# DCSRequestBody

DCS Totals Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. Maximum of 25 IDs are supported.  | 
**startDate** | **LocalDate** | The date of the period requested in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**endDate** | **LocalDate** | The date of the period requested in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  |  [optional]
**frequency** | **Frequency** |  |  [optional]
**metrics** | **java.util.List&lt;String&gt;** | Requested List of Financial Statement Items or Ratios.  | 
**currency** | **String** | Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  |  [optional]


## Implemented Interfaces

* Serializable


