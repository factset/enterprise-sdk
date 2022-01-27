# factsetprices.HighLowRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  | 
**date** | **String** | The specific date requested for a given period range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**period** | [**Period**](Period.md) |  | [optional] 
**priceType** | [**PriceType**](PriceType.md) |  | [optional] 
**calendar** | [**Calendar**](Calendar.md) |  | [optional] 
**currency** | **String** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**adjust** | [**Adjust**](Adjust.md) |  | [optional] 


