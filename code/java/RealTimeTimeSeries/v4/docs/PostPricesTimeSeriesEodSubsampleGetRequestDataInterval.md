

# PostPricesTimeSeriesEodSubsampleGetRequestDataInterval

Non-empty interval of days specifying a single subsample period. The starting point `start` of the single subsample is usually the attribute `range.end` of a previously received `/prices/timeSeries/eod/subsample/list` request. A valid range is between 1900-01-01 and a day that is less than or equal to the maximum allowed day determined from the delay period (if any). The ending point `end` may exceed the maximally entitled date range.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **LocalDate** | The starting point of the interval (inclusive).  | 
**end** | **LocalDate** | The ending point of the interval (exclusive). | 


## Implemented Interfaces

* Serializable


