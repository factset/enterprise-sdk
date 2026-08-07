

# GroupHoldingsRequest

Returns Group Holdings Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.  Request Limits:    - ids limit &#x3D; 1000 per request(Non batch)     - Batch requests:       * Single day: up to 3000 IDs per request       * Multi-day: up to 500 IDs per request         | 
**asOfDate** | **String** | As of date for historical group holdings in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  |  [optional]
**group** | **Group** |  |  [optional]
**batch** | **Batch** |  |  [optional]


## Implemented Interfaces

* Serializable


