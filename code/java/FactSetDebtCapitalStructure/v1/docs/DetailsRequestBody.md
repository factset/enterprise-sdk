

# DetailsRequestBody

Details Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. Maximum of 25 IDs are supported.  | 
**periodicity** | **Periodicity** |  |  [optional]
**date** | **LocalDate** | Date in YYYY-MM-DD format. |  [optional]
**currency** | **String** | Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  |  [optional]


## Implemented Interfaces

* Serializable


