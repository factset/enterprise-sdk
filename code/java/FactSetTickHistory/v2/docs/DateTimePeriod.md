

# DateTimePeriod

 NOTE:       - The start and end times are processed as UTC time of the factsetExchangeCode provided. Please refer to the **Data Model User Guide** for time zone to exchange mappings.      - Supports milliseconds, YYYY-MM-DDTHH:MM:SS.SSSZ where .SSS represents the milliseconds which is optional. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **OffsetDateTime** | The date for (or from which) the data is required. Supports in YYYY-MM-DDTHH:MM:SSZ format.   |  [optional]
**end** | **OffsetDateTime** | The date to which data is required. Supports in YYYY-MM-DDTHH:MM:SSZ format.   |  [optional]


## Implemented Interfaces

* Serializable


