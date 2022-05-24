# TimeSeriesTimeseriesObject

The `result` attribute in the Time-Series Non-Flattened Response Object will be a TIMESERIES object. A TIMESERIES object has a values attribute and a dates attribute that contain arrays of equal length so that the values and dates can be align to form a time series.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**[TimeSeriesScalarValue]**](TimeSeriesScalarValue.md) | Representing the data returned from the requested FQL formula for the requestId | [optional] 
**dates** | **[date, none_type]** | Representing the dates corresponding the requested FQL formula for the requestId | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


