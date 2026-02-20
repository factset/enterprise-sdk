# FactSet.SDK.EventsandTranscripts.Model.CompanyEventRequestDataDateTime
Data is available from 2002.  If users provide future dates in requests, the API returns data between the specified start and end dates, subject to the maximum allowed date range.  Date range limits by universe type: - Tickers, Index, and Etf: Maximum of 365 days between start and end. - AllCompanies: Maximum of 90 days between start and end. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Start** | **DateTime** | Start time of the event in ISO 8601 format. | 
**End** | **DateTime** | End time of the event in ISO 8601 format. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

