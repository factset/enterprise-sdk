

# CompanyEventRequestDataDateTime

- Data is available from November 1st, 2022. - If users provide future dates in requests, the API will return data between `start` and `end` up to 90 days. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **OffsetDateTime** | Start time of the event in ISO 8601 format. The maximum &#x60;dateTime&#x60; limit between start and end is up to 90 days. | 
**end** | **OffsetDateTime** | End time of the event in ISO 8601 format. The maximum &#x60;dateTime&#x60; limit between start and end is up to 90 days. | 


## Implemented Interfaces

* Serializable


