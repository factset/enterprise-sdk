

# HighLowRequest

High Low Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  | 
**date** | **String** | The specific date requested for a given period range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  |  [optional]
**period** | **Period** |  |  [optional]
**priceType** | **PriceType** |  |  [optional]
**calendar** | **Calendar** |  |  [optional]
**currency** | **String** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). |  [optional]
**adjust** | **Adjust** |  |  [optional]


## Implemented Interfaces

* Serializable


