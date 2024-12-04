

# PostPricesTimeSeriesIntradaySubsampleListRequestDataRange

Date and time range for the time series. The `start` and `end` boundaries must be aligned to `granularity`. That is, the numerical value is an integral multiple of the time span value represented by `granularity`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **OffsetDateTime** | The starting point of the time range (inclusive). The data accessible in the past is limited to a few weeks at most. | 
**end** | **OffsetDateTime** | The ending point of the time range (exclusive). Values in the future are not allowed. | 


## Implemented Interfaces

* Serializable


