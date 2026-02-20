

# CompanyEventRequestDataDateTime

Data is available from 2002.  If users provide future dates in requests, the API returns data between the specified start and end dates, subject to the maximum allowed date range.  Date range limits by universe type: - Tickers, Index, and Etf: Maximum of 365 days between start and end. - AllCompanies: Maximum of 90 days between start and end. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **OffsetDateTime** | Start time of the event in ISO 8601 format. | 
**end** | **OffsetDateTime** | End time of the event in ISO 8601 format. | 


## Implemented Interfaces

* Serializable


