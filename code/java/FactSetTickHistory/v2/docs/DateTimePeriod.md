

# DateTimePeriod

 NOTE:       - Using start and end parameters within dateTimeRange will fetch the data on particular days in between the timestamps given.      - The start and end times are processed as the local time of the factsetExchangeCode provided. Please refer to the **Data Model User Guide** for time zone to exchange mappings. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **OffsetDateTime** | The date for (or from which) the data is required. Supports in YYYY-MM-DDTHH:MM:SSZ format.   |  [optional]
**end** | **OffsetDateTime** | The date to which data is required. Supports in YYYY-MM-DDTHH:MM:SSZ format. end time is interpreted in the local timezone as the selected exchange.  |  [optional]


## Implemented Interfaces

* Serializable


