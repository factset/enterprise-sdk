# factsetestimates.SegmentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 50 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. *  | 
**startDate** | **String** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint.  | [optional] 
**endDate** | **String** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**relativeFiscalStart** | **Number** | Relative fiscal period, expressed as an integer, used to filter results. | [optional] 
**relativeFiscalEnd** | **Number** | Relative fiscal period, expressed as an integer, used to filter results. | [optional] 
**periodicity** | [**Periodicity**](Periodicity.md) |  | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**segmentType** | [**SegmentType**](SegmentType.md) |  | [optional] 
**metrics** | **[String]** | Requested metrics. Use the &#x60;/metrics&#x60; endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). | 
**currency** | **String** | Currency code for adjusting the data. Use input as &#39;ESTIMATE&#39; for values in Estimate currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 


