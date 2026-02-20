

# AnnualizedDividendsRequest

Annualized Dividends Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. Requests are limited to 50 IDs for non-batch requests and 5000 for batch requests.  | 
**currency** | **String** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). |  [optional]
**batch** | **Batch** |  |  [optional]


## Implemented Interfaces

* Serializable


