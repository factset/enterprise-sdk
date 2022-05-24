

# TimeSeriesTimeseriesObject

The `result` attribute in the Time-Series Non-Flattened Response Object will be a TIMESERIES object. A TIMESERIES object has a values attribute and a dates attribute that contain arrays of equal length so that the values and dates can be align to form a time series.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**java.util.List&lt;TimeSeriesScalarValue&gt;**](TimeSeriesScalarValue.md) | Representing the data returned from the requested FQL formula for the requestId |  [optional]
**dates** | **java.util.List&lt;LocalDate&gt;** | Representing the dates corresponding the requested FQL formula for the requestId |  [optional]


## Implemented Interfaces

* Serializable


